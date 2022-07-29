package com.yoke.justkeepaccounts.core.database.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class BillWithPicture(
    @Embedded
    val billEntity: BillEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            BillPictureCrossRef::class,
            parentColumn = "bill_id",
            entityColumn = "image_id"
        )
    )
    val pictureEntities: List<PictureEntity>
)
