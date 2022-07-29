package com.yoke.justkeepaccounts.core.data.repository

import com.yoke.justkeepaccounts.core.database.dao.TagDao
import javax.inject.Inject

class TagRepository @Inject constructor(
    private val tagDao: TagDao
) {

    fun getTagsStream(billId: Int) =
        tagDao.getTagsStream(billId)
}