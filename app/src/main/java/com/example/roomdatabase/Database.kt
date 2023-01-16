package com.example.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Ishita::class], version = 1)
abstract class AppDatabase: RoomDatabase()
{
    abstract fun dao() : Dao

    companion object{
        @Volatile       //any changes done in instance volatile will update it accordingly available yo all the threats
        private var INSTANCE : AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase{
            if(INSTANCE == null){
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        AppDatabase::class.java,
                        "userdb").build()
                }

            }
            return INSTANCE!! //!!for expecting instance is non nullable
        }


    }

}