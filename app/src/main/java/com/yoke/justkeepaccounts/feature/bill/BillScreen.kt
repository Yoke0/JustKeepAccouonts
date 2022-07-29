package com.yoke.justkeepaccounts.feature.bill

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import kotlin.math.floor

@Composable
fun BillRoute(
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: BillViewModel = hiltViewModel(),
) {
    BillScreen(

    )

}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun BillScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        topBar = {

        },
        containerColor = Color.Transparent
    ) { innerPadding ->
        BoxWithConstraints(
            modifier = modifier
                .padding(innerPadding)
                .consumedWindowInsets(innerPadding)
        ) {
//            val numberOfColumns = when (windowSizeClass.widthSizeClass) {
//                WindowWidthSizeClass.Compact, WindowWidthSizeClass.Medium -> 1
//                else -> floor(maxWidth / 300.dp).toInt().coerceAtLeast(1)
//            }
        }

    }
}