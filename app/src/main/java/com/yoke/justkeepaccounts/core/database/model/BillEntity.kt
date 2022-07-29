package com.yoke.justkeepaccounts.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yoke.justkeepaccounts.core.model.Bill

@Entity(
    tableName = "bills"
)
data class BillEntity(
    @PrimaryKey
    val id: Int,
    val account: Int,
    val name: String,
    val price: Float,
    val date: String,
    @ColumnInfo(name = "create_time")
    val createTime: Long,
    val remark: String,
)

fun BillEntity.asExternalModel() = Bill(
    id = id,
    account = account,
    name = name,
    price = price,
    date = date,
    createTime = createTime,
    remark = remark
)
