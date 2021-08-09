package com.js.ghostleggame.presentation.activity

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.NumberPicker
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.ActivityMainBinding
import com.js.ghostleggame.repo.DatabaseWithRoom
import com.js.ghostleggame.repo.MySharedPreferences
import com.js.ghostleggame.viewmodel.MainViewModel
import com.js.ghostleggame.viewmodel.MainViewModel.Companion.TAG
import org.koin.android.ext.android.inject


class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main), View.OnClickListener {

    private val mRoomDB: DatabaseWithRoom by inject()
    private val mPrefs: MySharedPreferences by inject()
    private val model: MainViewModel by viewModels()

    override fun onClick(v: View?) {

        when(v){
            binding.tvPersonnelNum -> {
                var dialog = Dialog(this)
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                dialog.setContentView(R.layout.number_picker_dialog)
//                var _binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.number_picker_dialog, null, false);

                dialog.show()

//                val d = Dialog(this@MainActivity)
//                d.setTitle("NumberPicker")
//                d.setContentView(R.layout.number_picker_dialog)
////                val b1: Button = d.findViewById<View>(R.id.button1) as Button
////                val b2: Button = d.findViewById<View>(R.id.button2) as Button
//                var b1 =
//                val np =
//
//                np.maxValue = 100
//                np.minValue = 0
//                np.wrapSelectorWheel = false
//                np.setOnValueChangedListener(this)
//                b1.setOnClickListener(object : View.OnClickListener {
//                    fun onClick(v: View?) {
//                        tv.setText(np.value.toString())
//                        d.dismiss()
//                    }
//                })
//                b2.setOnClickListener(object : View.OnClickListener {
//                    fun onClick(v: View?) {
//                        d.dismiss()
//                    }
//                })
//                d.show()


                Log.e(TAG,"Test")
            }

            binding.tvWinningNum -> {
                Log.e(TAG,"Test2")
            }

        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
        * 초기 값 세팅
        * */
        binding.tvPersonnelNum.setOnClickListener(this)
        binding.tvWinningNum.setOnClickListener(this)

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


    /**
     * 사다리타기 맵 가져오기
     * */
    fun getGhostLegBoard(): ArrayList<Int>{


        return arrayListOf()
    }

    /**
     * 해더 세팅
     * */
    fun setHeader(){

//        binding.header. = getString(R.string.main_title)

    }


}