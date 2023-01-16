package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "User")
data class Ishita(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val mobile:Long,
    val email:String,
    val password:String
    )
