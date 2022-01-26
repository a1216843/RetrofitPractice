package com.example.retrofitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitpractice.databinding.ActivityMainBinding
import com.example.retrofitpractice.adapter.TestAdapter
import com.example.retrofitpractice.repository.BaeminRepository

class MainActivity : AppCompatActivity(), CompletionListener {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val baeminRepository = BaeminRepository()
    val data = arrayListOf("a1216843", "1216844", "a1216845")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        baeminRepository.loadBaeminNotice(1, this)
        binding.testRecyclerview.adapter = TestAdapter(data)
        binding.testRecyclerview.layoutManager = LinearLayoutManager(this)
        registerForContextMenu(binding.testRecyclerview)
    }
    override fun loadComplete(data: Data){
        System.out.println(data.content)
    }
}