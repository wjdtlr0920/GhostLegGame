package com.js.ghostleggame.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.LinearLayoutManager
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.ActivityResultBinding
import com.js.ghostleggame.presentation.adapter.ResultAdapter


class ResultActivity : BaseActivity<ActivityResultBinding>(R.layout.activity_result) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.rvResult.layoutManager = LinearLayoutManager(this)
        binding.rvResult.adapter = ResultAdapter(arrayOf("1123123123","2123234234234","31231342351234"))


    }
}