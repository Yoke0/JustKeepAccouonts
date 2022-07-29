package com.yoke.justkeepaccounts.core.model

data class Bill(
    val id: Int,
    val account: Int,
    val name: String,
    val price: Float,
    val date: String,
    val createTime: Long,
    val remark: String,
)
