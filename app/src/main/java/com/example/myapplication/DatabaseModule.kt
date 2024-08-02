package com.example.myapplication

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(application: Application) = Room
        .databaseBuilder(
            application,
            AppDatabase::class.java,
            AppDatabase::class.java.simpleName
        ).build()

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase) =
        appDatabase.userDao()

}