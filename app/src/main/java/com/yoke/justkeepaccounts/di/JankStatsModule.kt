package com.yoke.justkeepaccounts.di

import android.app.Activity
import android.util.Log
import android.view.Window
import androidx.core.app.ActivityCompat
import androidx.metrics.performance.JankStats
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asExecutor
import java.util.concurrent.Executor

@Module
@InstallIn(ActivityCompat::class)
object JankStatsModule {

    private const val TAG = "JankStatsModule"

    @Provides
    fun providesOnFrameListener(): JankStats.OnFrameListener {
        return JankStats.OnFrameListener { frameData ->
            if (frameData.isJank) {
                Log.v(TAG, frameData.toString())
            }
        }
    }

    @Provides
    fun providesWindow(activity: Activity): Window {
        return activity.window
    }

    @Provides
    fun providesDefaultExecutor(): Executor {
        return Dispatchers.Default.asExecutor()
    }

    @Provides
    fun providesJankStats(
        window: Window,
        executor: Executor,
        frameListener: JankStats.OnFrameListener
    ): JankStats {
        return JankStats.createAndTrack(window, executor, frameListener)
    }
}