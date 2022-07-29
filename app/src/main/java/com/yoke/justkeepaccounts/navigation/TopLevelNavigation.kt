package com.yoke.justkeepaccounts.navigation

data class TopLevelDestination(
    override val route: String,
    override val destination: String,
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val iconTextId: Int
) : MyNavigationDestination
