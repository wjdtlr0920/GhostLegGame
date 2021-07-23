package com.js.ghostleggame

import android.app.Application
import com.js.ghostleggame.presentation.module.databaseModule
import com.js.ghostleggame.presentation.module.sharedModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppBase : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@AppBase)
            modules(listOf(
                    databaseModule,
                    sharedModule
                    )
            )
        }
    }
}