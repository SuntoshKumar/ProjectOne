package com.kyaw.projectone

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Aactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aactivity)

        val c = findViewById<Button>(R.id.phonedial)
        c.setOnClickListener {

            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$09250552791")
            }

            startActivity(intent)
//            if (intent.resolveActivity(packageManager) != null) {
//
//            }
        }

        val message = findViewById<Button>(R.id.message)

        message.setOnClickListener {

            val messageIntent = Intent(Intent.ACTION_SEND)
            messageIntent.type = "text/plain"
            messageIntent.putExtra(Intent.EXTRA_TEXT,"Hii, How are you?")
            startActivity(messageIntent)
        }

    }
}