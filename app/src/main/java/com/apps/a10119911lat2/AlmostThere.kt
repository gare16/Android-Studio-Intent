package com.apps.a10119911lat2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlmostThere : AppCompatActivity(), View.OnClickListener {
    private lateinit var btn_verify : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)
        btn_verify = findViewById(R.id.btn_verify)
        btn_verify.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_verify ->{
                val intent = Intent (this@AlmostThere, Verify::class.java)
                startActivity(intent)
            }
        }
    }
}