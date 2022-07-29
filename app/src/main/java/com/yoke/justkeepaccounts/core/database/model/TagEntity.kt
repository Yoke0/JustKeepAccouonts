package com.yoke.justkeepaccounts.core.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yoke.justkeepaccounts.core.model.Tag

@Entity(
    tableName = "tags"
)
data class TagEntity(
    @PrimaryKey
    val id: Int,
    val name: String
)

fun TagEntity.asExternalModel() = Tag(
    id = id,
    name = name
)
