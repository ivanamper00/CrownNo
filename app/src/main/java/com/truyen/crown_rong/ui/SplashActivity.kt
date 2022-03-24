package com.truyen.crown_rong.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import com.dakulangsakalam.customwebview.presentation.ui.jump.JumpActivity
import com.truyen.crown_rong.R

class SplashActivity : JumpActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            splashAction { _, _ ->
                startActivity(MainActivity.createIntent(this@SplashActivity))
                finish()
            }
        }, 1500)
    }
}