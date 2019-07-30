package com.nestorcalvo.logininterface

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler



class SplashActivity : Activity() {

    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            intent.putExtra("flag",true)
            startActivity(intent)
            finish()
        }, 1500)

    }
}