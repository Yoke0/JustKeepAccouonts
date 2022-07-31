package com.yoke.justkeepaccounts.navigation

import com.yoke.justkeepaccounts.ui.icon.Icon

data class TopLevelDestination(
    override val route: String,
    override val destination: String,
    val selectedIcon: Icon,
    val unselectedIcon: Icon,
    val iconTextId: Int
) : MyNavigationDestination
