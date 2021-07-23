package com.js.ghostleggame.common

import android.content.Context
import android.widget.Toast

object Util {
    fun toastMessage(ctx : Context, message : String){
        Toast.makeText(ctx, "$message", 1500).show()
    }
    fun toastMessage(ctx : Context, message : String, time : Int){
        Toast.makeText(ctx, "$message", time).show()
    }
}