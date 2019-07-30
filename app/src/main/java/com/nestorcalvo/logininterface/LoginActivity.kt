package com.nestorcalvo.logininterface

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private var username: String = ""
    private var password: String = ""
    private var userlogin: String = ""
    private var pwdlogin: String = ""
    private var flag = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        flag = intent.extras!!.getBoolean("flag")

        if (!flag) {

            username = intent.extras!!.getString("user").toString()
            password = intent.extras!!.getString("pwd").toString()
            flag = true
        }
        tvRegister.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivityForResult(intent, 1234)

        }
        btLogin.setOnClickListener {

            userlogin = edUser.text.toString()
            pwdlogin = edPass.text.toString()
            if (userlogin == username && pwdlogin == password && (userlogin.isNotBlank() && pwdlogin.isNotBlank())) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("user", userlogin)
                intent.putExtra("pwd", pwdlogin)
                startActivity(intent)
                finish()
            } else if (userlogin.isBlank() || pwdlogin.isBlank()) {
                Toast.makeText(this, getString(R.string.Empty), Toast.LENGTH_LONG).show()
            } else if (userlogin != username) {
                Toast.makeText(this, getString(R.string.WrongUser), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, getString(R.string.WrongPwd), Toast.LENGTH_LONG).show()
            }

        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1234 && resultCode == Activity.RESULT_OK) {
            username = data!!.extras!!.getString("username").toString()
            password = data.extras!!.getString("pwd").toString()

        }
    }

}
