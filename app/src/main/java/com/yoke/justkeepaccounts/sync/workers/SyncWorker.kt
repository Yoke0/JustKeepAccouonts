package com.yoke.justkeepaccounts.sync.workers

import android.content.Context
import androidx.work.*
import com.yoke.justkeepaccounts.sync.initializers.SyncConstrains
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class SyncWorker @AssistedInject constructor(
    @Assisted private val appContext: Context,
    @Assisted workerParams: WorkerParameters,
) : CoroutineWorker(appContext, workerParams) {

    override suspend fun doWork(): Result {
        TODO("Not yet implemented")
    }

    companion object {

        fun startUpSyncWork() = OneTimeWorkRequestBuilder<DelegatingWorker>()
            .setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST)
            .setConstraints(SyncConstrains)
            .setInputData(SyncWorker::class.delegatedData())
            .build()

    }
}