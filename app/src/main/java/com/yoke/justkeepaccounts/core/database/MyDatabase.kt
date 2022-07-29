package com.yoke.justkeepaccounts.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yoke.justkeepaccounts.core.database.dao.BillDao
import com.yoke.justkeepaccounts.core.database.dao.PictureDao
import com.yoke.justkeepaccounts.core.database.dao.TagDao
import com.yoke.justkeepaccounts.core.database.model.*

@Database(
    entities = [
        BillEntity::class,
        BillPictureCrossRef::class,
        BillTagCrossRef::class,
        PictureEntity::class,
        TagEntity::class
    ],
    version = 1,
    exportSchema = true,
)
abstract class MyDatabase : RoomDatabase() {
    abstract fun billDao(): BillDao
    abstract fun pictureDao(): PictureDao
    abstract fun tagDao(): TagDao
}