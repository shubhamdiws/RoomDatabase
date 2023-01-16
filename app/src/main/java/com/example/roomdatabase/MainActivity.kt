package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var database : AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        database = AppDatabase.getDatabase(this)


        GlobalScope.launch {
            database.dao().insert(Ishita(1,"Ishita Mistry",9898031722,"ishita@gmail.com","isha@33"))
            database.dao().insert(Ishita(2,"Niyati",9852367412,"niyati11@gmail.com","niyati@11"))
            database.dao().insert(Ishita(3,"Isha",5862856475,"isha11@gmail.com","isha@11"))

        }
    }
    fun getData(view: View) {
        database.dao().getAllUsers().observe(this, Observer {
            Log.d("My Database",it.toString())
        }

        )}
}