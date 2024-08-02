package com.example.myapplication

interface UserRepository {
    fun saveUser(user: User): Long
    fun getAllUser(): List<User>
}