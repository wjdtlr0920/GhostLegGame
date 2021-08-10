package com.js.ghostleggame.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.LayoutRes
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.ActivityResultBinding


class ResultActivity : BaseActivity<ActivityResultBinding>(R.layout.activity_result) {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
}