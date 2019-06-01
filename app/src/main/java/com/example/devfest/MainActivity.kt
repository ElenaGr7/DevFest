package com.example.devfest

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

var test2: String? = "t"

class MainActivity : AppCompatActivity() {

    private val ACTION_OPEN = "com.example.devfest.SHOW_AUTHOR"
    private val ACTION_OPEN_CATALOG = "com.example.devfest.SHOW_CATALOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textDescriptionAuthor = findViewById<TextView>(R.id.description)
        textDescriptionAuthor.setMovementMethod(ScrollingMovementMethod())

        val openCatalog = findViewById<Button>(R.id.button2)
        openCatalog.setOnClickListener {
            val openCatalogIntent = Intent(ACTION_OPEN_CATALOG)
            startActivity(openCatalogIntent)
        }

        val openAuthor = findViewById<TextView>(R.id.speaker)
        openAuthor.setOnClickListener {
            val openAuthorIntent = Intent(ACTION_OPEN)
                    startActivity(openAuthorIntent)
        }
    }
}
