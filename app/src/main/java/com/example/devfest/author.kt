package com.example.devfest

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView

class Author : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_author)
        val textDescriptionAuthor = findViewById<TextView>(R.id.descriptionAuthor)
        textDescriptionAuthor.setMovementMethod(ScrollingMovementMethod())

        val telegramButton = findViewById<ImageView>(R.id.telegram)
        telegramButton.setOnClickListener {
            val telegramIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.com/"))
            startActivity(telegramIntent)
        }

        val twitterButton = findViewById<ImageView>(R.id.twitter)
        twitterButton.setOnClickListener {
            val twitterIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"))
            startActivity(twitterIntent)
        }
        val openLecture = findViewById<View>(R.id.grey)
        openLecture.setOnClickListener {
            val openLectureIntent = Intent(this, MainActivity::class.java)
            startActivity(openLectureIntent)
        }

    }
}
