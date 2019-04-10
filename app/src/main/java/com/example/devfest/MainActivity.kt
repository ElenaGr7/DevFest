package com.example.devfest

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val ACTION_OPEN = "com.example.devfest.SHOW_AUTHOR"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linkButton = findViewById<Button>(R.id.button2)
        linkButton.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://devfest-spb.com/"))
            startActivity(browserIntent)
        }

        val openAuthor = findViewById<TextView>(R.id.speaker)
        openAuthor.setOnClickListener {
            val openAuthorIntent = Intent(ACTION_OPEN)
                    startActivity(openAuthorIntent)
        }
    }
}
