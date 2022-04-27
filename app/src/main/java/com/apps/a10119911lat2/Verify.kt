package com.apps.a10119911lat2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Verify : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_send : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        btn_send = findViewById(R.id.btn_send)
        btn_send.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when(p0.id){
            R.id.btn_send -> {
                val intent = Intent (this@Verify, Profile::class.java)
                startActivity(intent)
            }
        }
    }
}