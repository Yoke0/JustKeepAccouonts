package com.yoke.justkeepaccounts.feature.chart.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yoke.justkeepaccounts.core.navigation.AppNavigationDestination
import com.yoke.justkeepaccounts.feature.bill.BillRoute

object ChartDestination : AppNavigationDestination {
    override val route: String = "chart_route"
    override val destination: String = "chart_destination"
    const val chartIdArg = "chartId"
}

fun NavGraphBuilder.chartGraph(
    onBackClick: () -> Unit
) {
    composable(
        route = "${ChartDestination.route}/${ChartDestination.chartIdArg}",
        arguments = listOf(
            navArgument(ChartDestination.chartIdArg) {
                type = NavType.StringType
            }
        )
    ) {
        BillRoute(onBackClick = onBackClick)
    }
}