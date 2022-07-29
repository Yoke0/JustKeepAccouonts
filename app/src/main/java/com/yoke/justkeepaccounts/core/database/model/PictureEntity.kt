package com.yoke.justkeepaccounts.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yoke.justkeepaccounts.core.model.Picture

@Entity(
    tableName = "images"
)
data class PictureEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val url: String,
    val date: String,
    @ColumnInfo(name = "create_time")
    val createTime: Long,
)

fun PictureEntity.asExternalModel() = Picture(
    id = id,
    name = name,
    url = url,
    date = date,
    createTime = createTime
)
