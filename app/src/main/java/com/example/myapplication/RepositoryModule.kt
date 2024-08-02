package com.example.myapplication

import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl) : UserRepository

}