package com.apps.a10119911lat2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var txt_regis: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_regis = findViewById(R.id.txt_regis)
        txt_regis.setOnClickListener(this)

        }

    override fun onClick(v: View) {
        when(v.id){
            R.id.txt_regis ->{
                val intent = Intent(this@MainActivity, Register::class.java)
                startActivity(intent)
            }
        }
    }
}