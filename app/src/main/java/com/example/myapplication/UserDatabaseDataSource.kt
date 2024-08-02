package com.example.myapplication

interface UserDatabaseDataSource {
    fun saveUser(user: User): Long
    fun getAllUser(): List<User>
}