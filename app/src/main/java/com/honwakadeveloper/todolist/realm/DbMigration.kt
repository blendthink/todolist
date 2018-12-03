package com.honwakadeveloper.todolist.realm

import io.realm.*
import java.util.*

class DbMigration: RealmMigration {

    override fun migrate(realm: DynamicRealm, oldVersion: Long, newVersion: Long) {

        val schema: RealmSchema = realm.schema

        when (oldVersion) {

            0L -> {

                schema.create("Group")
                    .addPrimaryKey("id")
                    .addField("name", String::class.java, FieldAttribute.REQUIRED)

                val group : RealmObjectSchema = schema.get("Group") ?: return

                schema.create("ToDo")
                    .addPrimaryKey("id")
                    .addField("title", String::class.java, FieldAttribute.REQUIRED)
                    .addField("is_completed", Boolean::class.java)
                    .addField("content", String::class.java)
                    .addField("due_at", Date::class.java)
                    .addRealmObjectField("group", group)
            }

            else -> {

            }
        }
    }
}
