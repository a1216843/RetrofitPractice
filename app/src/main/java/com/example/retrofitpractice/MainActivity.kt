package com.example.retrofitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofitpractice.databinding.ActivityMainBinding
import com.example.retrofitpractice.Data
import com.example.retrofitpractice.repository.BaeminRepository

class MainActivity : AppCompatActivity(), CompletionListener {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val baeminRepository = BaeminRepository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        baeminRepository.loadBaeminNotice(1, this)
    }
    override fun loadComplete(data: Data){
        System.out.println(data.content)
    }
}