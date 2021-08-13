package com.js.ghostleggame.presentation.activity

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.CompoundButton
import android.widget.NumberPicker
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.js.ghostleggame.R
import com.js.ghostleggame.common.Util.toastMessage
import com.js.ghostleggame.databinding.ActivityMainBinding
import com.js.ghostleggame.presentation.dialog.BaseDialog
import com.js.ghostleggame.presentation.dialog.SelectDialog
import com.js.ghostleggame.presentation.dialog.SettingDialog
import com.js.ghostleggame.repo.DatabaseWithRoom
import com.js.ghostleggame.repo.MySharedPreferences
import com.js.ghostleggame.viewmodel.MainViewModel
import com.js.ghostleggame.viewmodel.MainViewModel.Companion.TAG
import org.koin.android.ext.android.inject


class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main), View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private val mRoomDB: DatabaseWithRoom by inject()
    private val mPrefs: MySharedPreferences by inject()
    private val model: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * 초기 값 세팅
         * */
        // 리스너
        binding.tvPersonnelNum.setOnClickListener(this)
        binding.tvWinningNum.setOnClickListener(this)
        binding.btnReset.setOnClickListener(this)
        binding.btnResult.setOnClickListener(this)
        binding.btnAllStart.setOnClickListener(this)
        binding.cbShadowMode.setOnCheckedChangeListener(this)

        binding.header.setting.setOnClickListener(this)

        setHeader()

        /**
         * 뷰모델에 라이브데이터랑 코인 연결하던중이였음
         *
         * https://www.youtube.com/watch?v=-b0VNKw_niY  21분 30초
         * */
//        model = ViewModelProvider(this).get(MainViewModel::class.java)


//        toastMessage(ctx!!, "Toast Test")

//        mPrefs.prefsEditor.putInt("dark_mode", 6)
//        mPrefs.prefsEditor.apply()

//        mRoomDB.invoke().gameResultDao().insertGame(GameResult(17))
//        var data = mRoomDB.invoke().gameResultDao().getAll()
//        binding.tvTitle.text = data[2].date.toString()
//        var data = mPrefs.prefs.getInt("dark_mode", 3)
//        binding.user = User(1,"테스트",5,1)
//        binding.lifecycleOwner
//        binding.
//
//
//        val model: MainViewModel by viewModels()
//        model.getUsers().observe(this, Observer<List<User>>{ users ->
//            // update UI
//
//
//        })


    }


    override fun onClick(v: View?) {

        when(v){


            binding.header.back -> {
                finish()
            }
            binding.header.setting -> {
                var dialog = SettingDialog(this)
                dialog.show()
            }

            binding.tvPersonnelNum -> {
                var dialog = SelectDialog(this,binding.tvPersonnelNum.text.toString().toInt(), SelectDialog.Type.PERSONNEL, object: BaseDialog.CallBack{
                    override fun onOk(personnel: Int) {
                        setPersonnel(personnel, SelectDialog.Type.PERSONNEL)
                    }
                    override fun onCancel() {
                    }
                })
                dialog.show()
            }

            binding.tvWinningNum -> {
                var dialog = SelectDialog(this, binding.tvWinningNum.text.toString().toInt(), SelectDialog.Type.WINNER,object: BaseDialog.CallBack{
                    override fun onOk(personnel: Int) {
                        if(personnel <= binding.tvPersonnelNum.text.toString().toInt())
                            setPersonnel(personnel, SelectDialog.Type.WINNER)
                        else
                            toastMessage(this@MainActivity,getString(R.string.main_not_winner_num))
                    }
                    override fun onCancel() {
                    }
                })
                dialog.show()
            }

            binding.btnReset -> {

            }

            binding.btnResult -> {
                startActivity(Intent(this, ResultActivity::class.java))

            }

            binding.btnAllStart -> {

            }
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView){
            binding.cbShadowMode -> {
                binding.viewShadowMode.isVisible = isChecked
            }
        }
    }


    /**
     * 사다리타기 맵 가져오기
     * */
    fun getGhostLegBoard(): ArrayList<Int>{


        return arrayListOf()
    }

    /**
     * 해더 세팅
     * */
    private fun setHeader(){

        binding.header.title.text = getString(R.string.main_title)
        binding.header.back.isVisible = false

    }

    fun setPersonnel(personnel: Int, type: SelectDialog.Type){
        when(type){
            SelectDialog.Type.PERSONNEL -> {
                binding.tvPersonnelNum.text = personnel.toString()
            }
            SelectDialog.Type.WINNER -> {
                binding.tvWinningNum.text = personnel.toString()
            }
        }
    }


}