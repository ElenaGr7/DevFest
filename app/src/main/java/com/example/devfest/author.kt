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
import java.util.ArrayList

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
    fun generateLecture(): kotlin.collections.List<Lecture> {
        val lectures = ArrayList<Lecture>()
        lectures.add(Lecture("name1", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name2", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name3", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name4", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name5", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name6", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name7", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name8", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name9", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name12", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name13", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name14", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name15", "22", "22:00", "30 November", "Andriod"))
        lectures.add(Lecture("name16", "22", "22:00", "30 November", "Andriod"))

        return lectures
    }
}
