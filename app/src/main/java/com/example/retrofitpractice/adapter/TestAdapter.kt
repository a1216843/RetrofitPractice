package com.example.retrofitpractice.adapter

import android.view.*
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitpractice.R
import com.example.retrofitpractice.databinding.ItemTestRecyclerviewBinding

class TestAdapter(val dataSet: ArrayList<String>) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {
    inner class TestViewHolder(binding : ItemTestRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root), View.OnCreateContextMenuListener{
        val text = binding.itemText
        init {
            binding.root.setOnCreateContextMenuListener(this)
        }
        override fun onCreateContextMenu(
            menu: ContextMenu?,
            v: View?,
            menuInfo: ContextMenu.ContextMenuInfo?
        ) {
            val menuInflater = MenuInflater(v?.context)
            menuInflater.inflate(R.menu.menu_context, menu)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestAdapter.TestViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_test_recyclerview, parent, false)
        System.out.println("살려줘! ${dataSet.size}")
        return TestViewHolder(ItemTestRecyclerviewBinding.bind(view))
    }

    override fun onBindViewHolder(holder: TestAdapter.TestViewHolder, position: Int) {
        holder.text.text = dataSet[position]
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}