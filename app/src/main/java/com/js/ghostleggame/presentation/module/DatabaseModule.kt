package com.js.ghostleggame.presentation.module

import com.js.ghostleggame.repo.AppDatabase
import com.js.ghostleggame.repo.DatabaseWithRoom
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module{
    single {
        DatabaseWithRoom(androidApplication().applicationContext)
    }
}