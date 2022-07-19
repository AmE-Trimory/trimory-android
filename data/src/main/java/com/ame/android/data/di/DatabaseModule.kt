package com.ame.android.data.di

import android.content.Context
import androidx.room.Room
import com.ame.android.data.database.TrimoryDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideTrimoryDatabase(@ApplicationContext context: Context) : TrimoryDatabase{
        return Room.databaseBuilder(
            context, TrimoryDatabase::class.java, "trimory.db"
        ).build()
    }
}