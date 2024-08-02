package com.example.myapplication

import javax.inject.Inject

class UserDatabaseDataSourceImpl @Inject constructor(val userDao: UserDao): UserDatabaseDataSource {

    override fun saveUser(user: User) = userDao.insert(user)

    override fun getAllUser() = userDao.findAll()

}