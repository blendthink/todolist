package com.honwakadeveloper.todolist.realm

import android.content.Context
import com.honwakadeveloper.todolist.R
import io.realm.Realm
import io.realm.RealmConfiguration

class DbManager private constructor() {

    companion object {

        fun initRealm(context: Context) {

            val filename: String = context.getString(R.string.database_filename)
            val schemaVersion : Long = context.resources.getInteger(R.integer.database_schema_version).toLong()
            val migration = DbMigration()

            Realm.init(context)

            val config : RealmConfiguration =
                RealmConfiguration.Builder()
                    .name(filename)
                    .schemaVersion(schemaVersion)
                    .migration(migration)
                    .build()

            Realm.setDefaultConfiguration(config)
        }

        fun getRealm(): Realm {
            return Realm.getDefaultInstance()
        }
    }
}