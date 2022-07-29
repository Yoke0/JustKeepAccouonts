package com.yoke.justkeepaccounts.feature.bill.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.yoke.justkeepaccounts.core.navigation.AppNavigationDestination
import com.yoke.justkeepaccounts.feature.bill.BillRoute

object BillDestination : AppNavigationDestination {
    override val route: String = "bill_route"
    override val destination: String = "bill_destination"
    const val billIdArg = "billId"
}

fun NavGraphBuilder.billGraph(
    onBackClick: () -> Unit
) {
    composable(
        route = "${BillDestination.route}/${BillDestination.billIdArg}",
        arguments = listOf(
            navArgument(BillDestination.billIdArg) {
                type = NavType.StringType
            }
        )
    ) {
        BillRoute(onBackClick = onBackClick)
    }
}