package com.example.retrofitpractice.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User constructor(val name : String, val age : String, val phone : String){
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}