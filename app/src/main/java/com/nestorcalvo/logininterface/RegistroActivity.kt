package com.nestorcalvo.logininterface

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        bnRegister.setOnClickListener {

            if(edPass.text.isBlank() || edRepPass.text.isBlank() || edUser.text.isBlank()){
                Toast.makeText(this,getString(R.string.Empty),Toast.LENGTH_LONG).show()
            }

            else if(edPass.text.toString() == edRepPass.text.toString()){
                if (edPass.text.toString().length < 6 || edRepPass.text.toString().length < 6){

                    Toast.makeText(this,getString(R.string.shortPassword),Toast.LENGTH_LONG).show()

                }
                else{
                var intent = Intent()
                intent.putExtra("username", edUser.text.toString())
                intent.putExtra("pwd", edPass.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()}
            }
            else{
                Toast.makeText(this,getString(R.string.WrongRegisterPass),Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onBackPressed() {
        Toast.makeText(this,getString(R.string.IncompleteRegister),Toast.LENGTH_LONG).show()
        finish()
        super.onBackPressed()
    }

}
