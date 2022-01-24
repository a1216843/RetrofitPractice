package com.example.retrofitpractice.database

import android.content.Context
import android.service.autofill.UserData
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase(){
    abstract fun userDao() : UserDao

    companion object {
        private var instance : UserDatabase? = null
        @Synchronized
        fun getInstance(context : Context) : UserDatabase? {
            if(instance == null) {
                kotlin.synchronized(UserDatabase::class.java){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java,
                        "user-database"
                    ).build()
                }
            }
            return instance
        }
    }
}