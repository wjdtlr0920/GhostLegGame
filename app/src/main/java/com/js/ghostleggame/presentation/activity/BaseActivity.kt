package com.js.ghostleggame.presentation.activity

import android.content.Context
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.js.ghostleggame.R
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel

abstract class BaseActivity< B : ViewDataBinding>(@LayoutRes private val layoutResId: Int) : AppCompatActivity() {

    var ctx : Context? = null
    lateinit var binding : B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutResId)

        ctx = baseContext
    }

    override fun onDestroy() {
        super.onDestroy()
        ctx = null
    }
    


}