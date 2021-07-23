package com.js.ghostleggame.presentation.module

import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.js.ghostleggame.viewmodel.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import kotlin.math.sin

val viewModelModule = module {
    single {
        MainViewModel()
    }
}