package com.yoke.justkeepaccounts.core.database.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class BillWithTag(
    @Embedded
    val billEntity: BillEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            value = BillTagCrossRef::class,
            parentColumn = "bill_id",
            entityColumn = "tag_id"
        )
    )
    val tagEntities: List<TagEntity>
)