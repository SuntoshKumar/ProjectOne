package com.kyaw.projectone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = findViewById<MaterialButton>(R.id.buttonone)
        val b = findViewById<MaterialButton>(R.id.buttontwo)
        a.setOnClickListener{

            val intent = Intent(this,Aactivity::class.java)

            startActivity(intent)
        }

        b.setOnClickListener {

            val intent = Intent(this,Bactivity::class.java)

            startActivity(intent)
        }
    }
}