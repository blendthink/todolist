package com.honwakadeveloper.todolist.realm.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import java.util.*

open class ToDo (

    @PrimaryKey open var id : String = UUID::randomUUID.toString(),
    @Required open var title : String,
    @Required open var is_completed : Boolean = false,
    open var content : String? = null,
    open var due_at : Date? = null,
    open var group : Group? = null

) : RealmObject()