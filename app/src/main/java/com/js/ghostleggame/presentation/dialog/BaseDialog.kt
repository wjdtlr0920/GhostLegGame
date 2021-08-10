package com.js.ghostleggame.presentation.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDialog< B : ViewDataBinding>(activity: Activity, @LayoutRes private val layoutResId: Int) : Dialog(activity) {

    private lateinit var binding : B
    private lateinit var ctx : Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(ctx!!, layoutResId)
    }
}