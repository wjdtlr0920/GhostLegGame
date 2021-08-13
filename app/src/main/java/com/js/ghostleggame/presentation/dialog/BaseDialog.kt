package com.js.ghostleggame.presentation.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDialog< B : ViewDataBinding>(private val ctx: Context, @LayoutRes private val layoutResId: Int, val style: Int? = null) : Dialog(ctx, android.R.style.Theme_Translucent_NoTitleBar) {

    interface CallBack{
        fun onOk(personnel: Int)
        fun onCancel()
    }

    lateinit var binding : B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = DataBindingUtil.setContentView(context as Activity, layoutResId)
        binding = DataBindingUtil.inflate(LayoutInflater.from(ctx), layoutResId, null, false)
        window?.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        window?.setBackgroundDrawableResource(android.R.color.transparent)
        setContentView(binding.root)


    }

}
