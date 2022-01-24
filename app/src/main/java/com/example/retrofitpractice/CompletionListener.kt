package com.example.retrofitpractice

import com.example.retrofitpractice.Data

interface CompletionListener {
    fun loadComplete(data : Data)
}