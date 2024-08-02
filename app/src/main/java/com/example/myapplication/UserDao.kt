package com.example.myapplication

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao{

    @Insert
    fun insert(user: User) : Long

    @Query("SELECT * FROM user")
    fun findAll() : List<User>

}
