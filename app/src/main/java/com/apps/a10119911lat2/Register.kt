package com.apps.a10119911lat2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class Register : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_regis : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btn_regis = findViewById(R.id.btn_regis)
        btn_regis.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_regis -> {
                val intent1 = Intent(this@Register, AlmostThere::class.java)
                startActivity(intent1)
            }
        }
    }
}