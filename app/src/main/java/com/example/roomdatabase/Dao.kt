package com.example.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.Dao

@Dao
interface Dao {
    @Insert
    suspend fun insert(ishita: Ishita)

    @Update
    suspend fun update(ishita: Ishita)

    @Delete
    suspend fun deleteAllUsers(ishita: Ishita)

    @Query("Select * from User")
    // this get request
    fun getAllUsers() : LiveData<List<Ishita>>
}
