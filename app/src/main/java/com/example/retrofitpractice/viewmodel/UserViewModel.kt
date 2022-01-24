package com.example.retrofitpractice.viewmodel

import android.app.Application
import android.service.autofill.UserData
import androidx.lifecycle.AndroidViewModel
import androidx.room.Room
import com.example.retrofitpractice.database.User
import com.example.retrofitpractice.database.UserDatabase

class UserViewModel(application: Application) : AndroidViewModel(application) {
    var userDB = UserDatabase.getInstance(application) // 이걸 repository에 넘김
    var userList = userDB?.userDao()?.getAll()
    // repository 생성

    fun insert(user: User){
        // repository.insert 구현
    }
}