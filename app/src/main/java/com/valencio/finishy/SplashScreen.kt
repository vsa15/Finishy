package com.valencio.finishy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar!!.hide() // Hide Toolbar
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashScreen,MainActivity::class.java))
        },5000)
    }
}