package com.yoke.justkeepaccounts.feature.mine.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yoke.justkeepaccounts.core.navigation.AppNavigationDestination
import com.yoke.justkeepaccounts.feature.bill.BillRoute

object MineDestination : AppNavigationDestination {
    override val route: String = "mine_route"
    override val destination: String = "mine_destination"
    const val mineIdArg = "mineId"
}

fun NavGraphBuilder.mineGraph(
    onBackClick: () -> Unit
) {
    composable(
        route = "${MineDestination.route}/${MineDestination.mineIdArg}",
        arguments = listOf(
            navArgument(MineDestination.mineIdArg) {
                type = NavType.StringType
            }
        )
    ) {
        BillRoute(onBackClick = onBackClick)
    }
}