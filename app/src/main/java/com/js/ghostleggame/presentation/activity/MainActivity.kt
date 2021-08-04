package com.js.ghostleggame.presentation.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.js.ghostleggame.R
import com.js.ghostleggame.common.Util.toastMessage
import com.js.ghostleggame.data.database.GameResult
import com.js.ghostleggame.data.dto.User
import com.js.ghostleggame.databinding.ActivityMainBinding
import com.js.ghostleggame.repo.DatabaseWithRoom
import com.js.ghostleggame.repo.MySharedPreferences
import com.js.ghostleggame.viewmodel.MainViewModel
import org.koin.android.ext.android.bind
import org.koin.android.ext.android.inject
import java.util.Observer

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val mRoomDB: DatabaseWithRoom by inject()
    private val mPrefs: MySharedPreferences by inject()
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
        * 뷰모델에 라이브데이터랑 코인 연결하던중이였음
         *
         * https://www.youtube.com/watch?v=-b0VNKw_niY  21분 30초
        * */
        model
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




    fun getGhostLegBoard(): ArrayList<Int>{


        return arrayListOf()
    }

}