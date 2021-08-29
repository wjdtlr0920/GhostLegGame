package com.js.ghostleggame.presentation.activity

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.LayoutRes
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.ActivityResultBinding
import com.js.ghostleggame.presentation.adapter.ResultAdapter
import com.js.ghostleggame.presentation.dialog.SettingDialog
import com.js.ghostleggame.viewmodel.MainViewModel


class ResultActivity : BaseActivity<ActivityResultBinding>(R.layout.activity_result), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.rvResult.layoutManager = LinearLayoutManager(this)
        binding.rvResult.adapter = ResultAdapter(arrayOf("1123123123","2123234234234","31231342351234"))



        binding.header.back.setOnClickListener(this)
        binding.header.setting.setOnClickListener(this)


        setHeader()

    }


    override fun onClick(v: View?) {
        when(v) {
            binding.header.back -> {
                finish()
            }
            binding.header.setting -> {
                var dialog = SettingDialog(this)
                dialog.show()
            }
        }
    }


    /**
     * 해더 세팅
     * */
    private fun setHeader(){

        binding.header.title.text = getString(R.string.result_title)

    }


}