package com.yoke.justkeepaccounts.core.database.dao

import android.nfc.Tag
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.yoke.justkeepaccounts.core.database.model.BillTagCrossRef
import com.yoke.justkeepaccounts.core.database.model.BillWithTag
import kotlinx.coroutines.flow.Flow

@Dao
interface TagDao {
    @Transaction
    @Query(
        value = """
            SELECT * FROM tags
            WHERE id = :billId
        """
    )
    fun getTagsStream(billId: Int): Flow<List<BillWithTag>>

    @Insert
    suspend fun insertTag(tag: Tag): Long

    @Insert
    suspend fun insertBillCrossRefEntities(
        billTagCrossReferences: List<BillTagCrossRef>
    )

    @Query(
        value = """
            DELETE FROM tags
            WHERE id = :tagId
        """
    )
    suspend fun deleteTag(tagId: Int)
}