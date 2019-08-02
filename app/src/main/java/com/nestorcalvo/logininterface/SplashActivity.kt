package com.nestorcalvo.logininterface

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView


class SplashActivity : Activity() {
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        //var bgapp = findViewById<ImageView>(R.id.bgapp)

        //var bganim = AnimationUtils.loadAnimation(this,R.anim.bganim)

        //bgapp.startAnimation(bganim)

        //bgapp.animate().translationX((-15000).toFloat()).setDuration(1000).setStartDelay(1500)


       /* handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            intent.putExtra("flag",true)
            startActivity(intent)
            finish()
        }, 1500)*/

    }
}