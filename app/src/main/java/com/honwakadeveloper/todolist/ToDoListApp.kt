package com.honwakadeveloper.todolist

import android.app.Application
import io.realm.Realm

class ToDoListApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
    }
}