package com.yoke.justkeepaccounts.core.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.yoke.justkeepaccounts.core.database.model.BillEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface BillDao {
    @Query(
        value = """
            SELECT * FROM bills
            WHERE id = :billId
        """
    )
    fun getBillEntityStream(billId: Int): Flow<BillEntity>

    @Query(
        value = """
            SELECT * FROM bills
        """
    )
    fun getBillEntitiesStream(): Flow<List<BillEntity>>

    @Query(
        value = """
            SELECT * FROM bills
            WHERE date = :date
        """
    )
    fun getBillEntitiesStream(date: String): Flow<List<BillEntity>>

    @Query(
        value = """
            SELECT DISTINCT date FROM bills
            ORDER BY date DESC
        """
    )
    fun getBillsDateStream(): Flow<List<String>>

    @Insert
    suspend fun insertBill(billEntity: BillEntity): Long

    @Update
    suspend fun updateBill(billEntity: BillEntity)

    @Query(
        value = """
            DELETE FROM bills
            WHERE id = :billId
        """
    )
    suspend fun deleteBill(billId: Int)
}