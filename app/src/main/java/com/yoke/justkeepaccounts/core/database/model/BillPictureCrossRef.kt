package com.yoke.justkeepaccounts.core.database.model

import androidx.room.*

@Entity(
    tableName = "bill_picture",
    primaryKeys = ["bill_id", "picture_id"],
    foreignKeys = [
        ForeignKey(
            entity = BillEntity::class,
            parentColumns = ["id"],
            childColumns = ["bill_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = PictureEntity::class,
            parentColumns = ["id"],
            childColumns = ["picture_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["bill_id"]),
        Index(value = ["image_id"]),
    ]
)
data class BillPictureCrossRef(
    @ColumnInfo(name = "bill_id")
    val billId: Int,
    @ColumnInfo(name = "picture_id")
    val pictureId: Int,
)
