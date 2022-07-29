package com.yoke.justkeepaccounts.core.database.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.yoke.justkeepaccounts.core.database.model.BillWithPicture
import com.yoke.justkeepaccounts.core.database.model.PictureEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface PictureDao {
    @Query(
        value = """
            SELECT * FROM images
        """
    )
    fun getPictureEntitiesStream(): Flow<List<PictureEntity>>

    @Transaction
    @Query(
        value = """
            SELECT * FROM bills
            WHERE id = :billId
        """
    )
    fun getPictureEntitiesStream(billId: Int): Flow<List<BillWithPicture>>
}