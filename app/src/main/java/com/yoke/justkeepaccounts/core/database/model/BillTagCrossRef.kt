package com.yoke.justkeepaccounts.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "bill_tags",
    primaryKeys = ["bill_id", "tag_id"],
    foreignKeys = [
        ForeignKey(
            entity = BillEntity::class,
            parentColumns = ["id"],
            childColumns = ["bill_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = TagEntity::class,
            parentColumns = ["id"],
            childColumns = ["tag_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["bill_id"]),
        Index(value = ["tag_id"]),
    ]
)
data class BillTagCrossRef(
    @ColumnInfo(name = "bill_id")
    val billId: Int,
    @ColumnInfo(name = "tag_id")
    val tagId: Int,
)
