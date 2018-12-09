package com.honwakadeveloper.todolist.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.honwakadeveloper.todolist.R

class MainToDoListAdapter(private val items : List<String>) : RecyclerView.Adapter<MainToDoListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainToDoListHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.main_to_do_list_item, parent, false)

        return MainToDoListHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MainToDoListHolder, position: Int) {
        holder.bindView(getItem(position))
    }

    private fun getItem(position: Int) : String {
        return items[position]
    }
}