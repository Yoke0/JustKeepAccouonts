package com.yoke.justkeepaccounts.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import com.yoke.justkeepaccounts.ui.theme.MyTheme

@Composable
fun MyApp(
    windowSizeClass: WindowSizeClass,
    appState: MyAppState = rememberMyAppState(windowSizeClass)
) {
    MyTheme() {

    }
}