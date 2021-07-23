package com.js.ghostleggame.repo

import android.content.Context
import android.content.SharedPreferences

class MySharedPreferences (context: Context) {

    private val SHAREDPREFERENCES_NAME = "sharedpreferences"
    val prefs : SharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_NAME,Context.MODE_PRIVATE)
    val prefsEditor = prefs.edit()

}