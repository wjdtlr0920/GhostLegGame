package com.js.ghostleggame.presentation.dialog

import android.content.Context
import android.os.Bundle
import android.view.View
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.DialogNumberPickerBinding

class SelectDialog(context: Context,val startNum: Int,val type: Type, private val callback: CallBack) : BaseDialog<DialogNumberPickerBinding>(context, R.layout.dialog_number_picker), View.OnClickListener {

    enum class Type{PERSONNEL, WINNER}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        when (type) {
            Type.PERSONNEL -> {
                binding.npPersonnel.minValue = context.getString(R.string.min_personnel).toInt()
                binding.npPersonnel.maxValue = context.getString(R.string.max_personnel).toInt()
                binding.npPersonnel.value = startNum
            }
            Type.WINNER -> {
                binding.npPersonnel.minValue = context.getString(R.string.min_winner).toInt()
                binding.npPersonnel.maxValue = context.getString(R.string.max_winner).toInt()
                binding.npPersonnel.value = startNum
            }

        }
        binding.imgUp.setOnClickListener(this)
        binding.imgDown.setOnClickListener(this)
        binding.btnOk.setOnClickListener(this)
        binding.btnCancel.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when(v){
            binding.imgUp -> {
                binding.npPersonnel.value += 1
            }
            binding.imgDown -> {
                binding.npPersonnel.value -= 1
            }
            binding.btnOk -> {
                dismiss()
                callback.onOk(binding.npPersonnel.value)
            }
            binding.btnCancel -> {
                dismiss()
            }
        }
    }
}

