package com.nestorcalvo.logininterface

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvUserMain.text = intent.extras!!.getString("user").toString()
        tvPwdMain.text = intent.extras!!.getString("pwd").toString()

    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.close -> callIntent()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun callIntent() {
        val intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("user", tvUserMain.text.toString())
        intent.putExtra("pwd", tvPwdMain.text.toString())
        intent.putExtra("flag", false)
        startActivity(intent)
        finish()
    }
}
