package com.js.ghostleggame.repo

import android.content.Context
import androidx.room.Room

class DatabaseWithRoom(private val applicationContext: Context) {

    companion object {
        private const val DB_NAME = "room_db"
    }

    fun invoke(): AppDatabase {
        return Room.databaseBuilder(applicationContext,
                AppDatabase::class.java, DB_NAME)
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()
    }
}