package com.yoke.justkeepaccounts.core.database

import com.yoke.justkeepaccounts.core.database.dao.BillDao
import com.yoke.justkeepaccounts.core.database.dao.PictureDao
import com.yoke.justkeepaccounts.core.database.dao.TagDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {
    @Provides
    fun providesBillDao(
        database: MyDatabase
    ): BillDao = database.billDao()

    @Provides
    fun providesPictureDao(
        database: MyDatabase
    ): PictureDao = database.pictureDao()

    @Provides
    fun providesTagDao(
        database: MyDatabase
    ): TagDao = database.tagDao()
}