package com.yoke.justkeepaccounts.sync.initializers

import androidx.work.Constraints
import androidx.work.NetworkType

val SyncConstrains
    get() = Constraints.Builder()
        .setRequiredNetworkType(NetworkType.CONNECTED)
        .build()
