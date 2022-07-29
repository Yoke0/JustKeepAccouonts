package com.yoke.justkeepaccounts.ui

import androidx.compose.material3.windowsizeclass.WindowHeightSizeClass
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.core.os.trace
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.yoke.justkeepaccounts.R
import com.yoke.justkeepaccounts.feature.bill.navigation.BillDestination
import com.yoke.justkeepaccounts.feature.chart.navigation.ChartDestination
import com.yoke.justkeepaccounts.feature.gallery.navigation.GalleryDestination
import com.yoke.justkeepaccounts.feature.mine.navigation.MineDestination
import com.yoke.justkeepaccounts.navigation.MyNavigationDestination
import com.yoke.justkeepaccounts.navigation.TopLevelDestination
import com.yoke.justkeepaccounts.ui.icon.MyIcons

@Composable
fun rememberMyAppState(
    windowSizeClass: WindowSizeClass,
    navController: NavHostController = rememberNavController()
): MyAppState {
    NavigationTrackingSideEffect(navController)
    return remember(navController, windowSizeClass) {
        MyAppState(navController, windowSizeClass)
    }
}

@Stable
class MyAppState(
    val navController: NavHostController,
    val windowSizeClass: WindowSizeClass
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val shouldShowBottomBar: Boolean
        get() = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Compact ||
                windowSizeClass.heightSizeClass == WindowHeightSizeClass.Compact

    val shouldShowNaiRail: Boolean
        get() = !shouldShowBottomBar

    val topLevelDestinations: List<TopLevelDestination> = listOf(
        TopLevelDestination(
            route = BillDestination.route,
            destination = BillDestination.destination,
            selectedIcon = MyIcons.Bill,
            unselectedIcon = MyIcons.Bill,
            iconTextId = R.string.bill,
        ),
        TopLevelDestination(
            route = ChartDestination.route,
            destination = ChartDestination.destination,
            selectedIcon = MyIcons.Chart,
            unselectedIcon = MyIcons.Chart,
            iconTextId = R.string.chart,
        ),
        TopLevelDestination(
            route = GalleryDestination.route,
            destination = ChartDestination.destination,
            selectedIcon = MyIcons.Gallery,
            unselectedIcon = MyIcons.Gallery,
            iconTextId = R.string.gallery,
        ),
        TopLevelDestination(
            route = MineDestination.route,
            destination = ChartDestination.destination,
            selectedIcon = MyIcons.Mine,
            unselectedIcon = MyIcons.Mine,
            iconTextId = R.string.mine
        )
    )

    fun navigate(destination: MyNavigationDestination, route: String? = null) {
        trace("Navigation: $destination") {
            if (destination is TopLevelDestination) {
                navController.navigate(route ?: destination.route) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            } else {
                navController.navigate(route ?: destination.route)
            }
        }
    }

    fun onBackClick() {
        navController.popBackStack()
    }
}

@Composable
private fun NavigationTrackingSideEffect(navController: NavHostController) {
    JankMetricDisposableEffect(navController) { metricsHolder ->
        val listener = NavController.OnDestinationChangedListener { _, destination, _ ->
            metricsHolder.state?.addState("Navigation", destination.route.toString())
        }

        navController.addOnDestinationChangedListener(listener)

        onDispose {
            navController.removeOnDestinationChangedListener(listener)
        }
    }
}