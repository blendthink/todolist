package com.honwakadeveloper.todolist.realm.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.Required
import java.util.*

open class Group (

     @PrimaryKey open var id : String = UUID::randomUUID.toString(),
     @Required open var name : String

) : RealmObject()