package com.js.ghostleggame.repo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.js.ghostleggame.data.database.GameResult


@Database(entities = [GameResult::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun gameResultDao(): GameResultDao
}

//    companion object {
//        private var instance: AppDatabase? = null
//
//        @Synchronized
//        fun getInstance(context: Context): AppDatabase?{
//            if (instance == null){
//                synchronized(AppDatabase::class){
//                    instance = Room.databaseBuilder(
//                        context.applicationContext,
//                        AppDatabase::class.java,
//                        "game-database"
//                    )
//                        .build()
//                }
//            }
//            return instance
//        }
//    }
//}