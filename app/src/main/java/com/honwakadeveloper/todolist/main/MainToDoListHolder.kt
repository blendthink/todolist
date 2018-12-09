package com.honwakadeveloper.todolist.main

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.honwakadeveloper.todolist.R

class MainToDoListHolder(

    itemView: View,

    private val titleView : TextView = itemView.findViewById(R.id.main_to_do_list_item_title)


) : RecyclerView.ViewHolder(itemView) {

    fun bindView(text : String) {

        titleView.text = text
    }
}