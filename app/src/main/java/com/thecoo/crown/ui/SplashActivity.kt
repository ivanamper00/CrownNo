package com.thecoo.crown.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.kaiguanjs.utils.YQCUtils
import com.thecoo.crown.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val timer = object: CountDownTimer(3000, 1000){
            override fun onTick(p0: Long) { }
            override fun onFinish() {
                YQCUtils.splashAction(this@SplashActivity){ _, _ ->
                    startActivity(MainActivity.createIntent(this@SplashActivity))
                    finish()
                }
            }
        }
        timer.start()
    }
}