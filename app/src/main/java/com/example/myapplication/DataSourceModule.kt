package com.example.myapplication

import dagger.Binds
import dagger.Module

@Module
abstract class DataSourceModule {

    @Binds
    abstract fun bindUserDatabaseDataSource(userDatabaseDataSourceImpl: UserDatabaseDataSourceImpl) : UserDatabaseDataSource

}