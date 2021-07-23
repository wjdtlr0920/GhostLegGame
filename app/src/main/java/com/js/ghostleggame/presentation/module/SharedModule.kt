package com.js.ghostleggame.presentation.module

import com.js.ghostleggame.repo.MySharedPreferences
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val sharedModule = module {
    single {
        MySharedPreferences(androidApplication().applicationContext)
    }

}