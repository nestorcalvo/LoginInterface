package com.nestorcalvo.logininterface

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.view.animation.AnimationSet




class SplashActivity : Activity() {
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var bgapp = findViewById<ImageView>(R.id.bgapp)

        var bgappicon = findViewById<ImageView>(R.id.bgappicon)

        var bgapptext = findViewById<TextView>(R.id.etTitle)

        var bganim = AnimationUtils.loadAnimation(this,R.anim.bganim)


        var bgpopout= AnimationUtils.loadAnimation(this,R.anim.textanimoutro)

        bgappicon.startAnimation(bgpopout)
        bgapptext.startAnimation(bgpopout)

        bgappicon.animate().startDelay = 4000
        bgapptext.animate().startDelay = 4000

        bgapp.startAnimation(bganim)
        bgapp.animate().startDelay = 2000

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            intent.putExtra("flag",true)
            startActivity(intent)
            finish()
        }, 1000)




    }
}