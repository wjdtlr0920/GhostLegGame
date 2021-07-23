package com.js.ghostleggame.presentation.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.js.ghostleggame.R
import com.js.ghostleggame.databinding.ActivityMainBinding
import com.js.ghostleggame.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val handler = Handler()
        handler.postDelayed({
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        },1500)

    }


    /**
     * todo SplashActivity가 종료되었을때 MainActivity를 못 띄우게 해야함
     */
    override fun onPause() {
        super.onPause()
        finish()
    }


}