package com.js.ghostleggame.presentation.dialog

import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.SeekBar
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.DialogSettingBinding

class SettingDialog(context: Context) : BaseDialog<DialogSettingBinding>(context, R.layout.dialog_setting), View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 리스너 등록
        binding.header.back.setOnClickListener(this)
        binding.swDarkMode.setOnCheckedChangeListener(this)
        binding.swSound.setOnCheckedChangeListener(this)
        binding.swVibration.setOnCheckedChangeListener(this)
        binding.skbAppearPercent.setOnSeekBarChangeListener(this)
        binding.skbGameSpeed.setOnSeekBarChangeListener(this)

        setHeader()


    }

    override fun onClick(v: View?) {
        when(v){
            binding.header.back -> {
                dismiss()
            }
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView){
            binding.swDarkMode -> {
                val alertDialogBuilder = AlertDialog.Builder(context)
                alertDialogBuilder.setTitle("123456")
                alertDialogBuilder.setMessage("123456")
                alertDialogBuilder.setPositiveButton("OK", null)
                alertDialogBuilder.setNegativeButton("Cancel",null);


                val alertDialog = alertDialogBuilder.create()
                alertDialog.show()
            }
            binding.swSound -> {
                dismiss()
                // todo 쉐어드프리퍼런스에 소리 값 저장
            }
            binding.swVibration -> {
                dismiss()
                // todo 쉐어드프리퍼런스에 진동 값 저장
            }
        }
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        // todo 쉐어드프리퍼런스에 시크바 값 저장하자
        when(seekBar) {
            binding.skbGameSpeed -> {
                Log.e("SeekBar Stop", ""+seekBar?.progress + "skbGameSpeed")

            }
            binding.skbAppearPercent -> {
                Log.e("SeekBar Stop", ""+seekBar?.progress + "skbAppearPercent")

            }
        }
    }
    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        Log.e("SeekBar Start", ""+seekBar?.progress)
    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        Log.e("SeekBar ProgressChanged", ""+seekBar?.progress)
    }

    private fun setHeader(){
        binding.header.title.text = context.getString(R.string.setting_title)
        binding.header.setting.isVisible = false
    }

}