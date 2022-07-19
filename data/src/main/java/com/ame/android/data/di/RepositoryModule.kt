package com.ame.android.data.di

import com.ame.android.data.repository.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

   /* @Provides
    @Singleton
    fun provideRemoteConfigRepository(
        remoteConfigRepository: IRemoteConfigRepository
    ) : IRemoteConfigRepository {
        return RemoteConfigRepository()
    }*/

    @Provides
    @Singleton
    fun provideTrimoryRepository(
    ):ITrimoryRepository{
        return TrimoryRepository()
    }
}