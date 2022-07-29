package com.yoke.justkeepaccounts.core.data.repository

import com.yoke.justkeepaccounts.core.database.dao.BillDao
import com.yoke.justkeepaccounts.core.database.model.BillEntity
import com.yoke.justkeepaccounts.core.database.model.asExternalModel
import com.yoke.justkeepaccounts.core.model.Bill
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class BillRepository @Inject constructor(
    private val billDao: BillDao,
) {

    fun getBillsStream(): Flow<List<Bill>> =
        billDao.getBillEntitiesStream().map {
            it.map(BillEntity::asExternalModel)
        }

    fun getBillsStream(date: String): Flow<List<Bill>> =
        billDao.getBillEntitiesStream(date).map {
            it.map(BillEntity::asExternalModel)
        }

    fun getBillsDateStream(): Flow<List<String>> =
        billDao.getBillsDateStream()
}