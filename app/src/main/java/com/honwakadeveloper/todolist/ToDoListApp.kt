package com.honwakadeveloper.todolist

import android.app.Application
import com.honwakadeveloper.todolist.realm.DbManager

class ToDoListApp : Application() {

    override fun onCreate() {
        super.onCreate()

        DbManager.initRealm(this)
    }
}