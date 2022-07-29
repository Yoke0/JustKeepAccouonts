package com.yoke.justkeepaccounts.sync.initializers

import android.content.Context
import androidx.startup.AppInitializer
import androidx.startup.Initializer
import androidx.work.ExistingWorkPolicy
import androidx.work.WorkManager
import androidx.work.WorkManagerInitializer
import com.yoke.justkeepaccounts.sync.workers.SyncWorker

object Sync {

    fun initialize(context: Context) {
        AppInitializer.getInstance(context)
            .initializeComponent(SyncInitializer::class.java)
    }
}

private const val SyncWorkName = "SyncWorkName"

class SyncInitializer : Initializer<Sync> {
    override fun create(context: Context): Sync {
        WorkManager.getInstance(context).apply {
            enqueueUniqueWork(
                SyncWorkName,
                ExistingWorkPolicy.REPLACE,
                SyncWorker.startUpSyncWork()
            )
        }

        return Sync
    }

    override fun dependencies(): List<Class<WorkManagerInitializer>> =
        listOf(WorkManagerInitializer::class.java)

}