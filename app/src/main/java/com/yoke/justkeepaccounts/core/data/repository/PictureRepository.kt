package com.yoke.justkeepaccounts.core.data.repository

import com.yoke.justkeepaccounts.core.database.dao.PictureDao
import javax.inject.Inject

class PictureRepository @Inject constructor(
    private val pictureDao: PictureDao
) {

}