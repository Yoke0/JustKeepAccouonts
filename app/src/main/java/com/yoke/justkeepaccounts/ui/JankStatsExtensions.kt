package com.yoke.justkeepaccounts.ui

import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalView
import androidx.metrics.performance.PerformanceMetricsState
import androidx.metrics.performance.PerformanceMetricsState.Holder as MetricsStateHolder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.collect

@Composable
fun rememberMetricsStateHolder(): MetricsStateHolder {
    val localView = LocalView.current

    return remember(localView) {
        PerformanceMetricsState.getForHierarchy(localView)
    }
}

@Composable
fun JankMetricEffect(
    vararg keys: Any?,
    reportMetric: suspend CoroutineScope.(state: MetricsStateHolder) -> Unit
) {
    val metrics = rememberMetricsStateHolder()
    LaunchedEffect(metrics, *keys) {
        reportMetric(metrics)
    }
}

@Composable
fun JankMetricDisposableEffect(
    vararg keys: Any?,
    reportMetric: DisposableEffectScope.(state: MetricsStateHolder) -> DisposableEffectResult
) {
    val metrics = rememberMetricsStateHolder()
    DisposableEffect(metrics, *keys) {
        reportMetric(metrics)
    }
}

@Composable
fun TrackScrollJank(scrollableState: ScrollableState, stateName: String) {
    JankMetricEffect(scrollableState) { metricsHolder ->
        snapshotFlow { scrollableState.isScrollInProgress }.collect { isScrollInProgress ->
            metricsHolder.state?.apply {
                if (isScrollInProgress) {
                    addState(stateName, "Scrolling=true")
                } else {
                    removeState(stateName)
                }
            }
        }
    }
}