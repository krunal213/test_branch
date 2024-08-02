package com.example.myapplication

import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(val userDatabaseDataSource: UserDatabaseDataSource) : UserRepository{

    override fun saveUser(user: User) = userDatabaseDataSource.saveUser(user)

    override fun getAllUser(): List<User> = userDatabaseDataSource.getAllUser()

}