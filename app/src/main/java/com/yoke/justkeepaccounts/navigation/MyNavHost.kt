package com.yoke.justkeepaccounts.navigation

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.yoke.justkeepaccounts.feature.bill.navigation.BillDestination
import com.yoke.justkeepaccounts.feature.bill.navigation.billGraph
import com.yoke.justkeepaccounts.feature.chart.navigation.chartGraph
import com.yoke.justkeepaccounts.feature.gallery.navigation.galleryGraph
import com.yoke.justkeepaccounts.feature.mine.navigation.mineGraph

@Composable
fun MyNavHost(
    navController: NavHostController,
    onNavigationDestination: (MyNavigationDestination, String) -> Unit,
    onBackClick: () -> Unit,
    windowSizeClass: WindowSizeClass,
    modifier: Modifier = Modifier,
    startDestination: String = BillDestination.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        billGraph(onBackClick)
        chartGraph(onBackClick)
        galleryGraph(onBackClick)
        mineGraph(onBackClick)
    }

}