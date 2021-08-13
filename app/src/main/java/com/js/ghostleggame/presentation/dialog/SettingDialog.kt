package com.js.ghostleggame.presentation.dialog

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.DialogSettingBinding

class SettingDialog(context: Context) : BaseDialog<DialogSettingBinding>(context, R.layout.dialog_setting), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 리스너 등록
        binding.header.back.setOnClickListener(this)

        setHeader()


    }

    override fun onClick(v: View?) {
        when(v){
            binding.header.back -> {
                dismiss()
            }
        }
    }

    private fun setHeader(){
        binding.header.title.text = context.getString(R.string.setting_title)
        binding.header.setting.isVisible = false
    }

}