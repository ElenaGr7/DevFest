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

        /*val lectures = generateLecture()
        compare(lectures)*/
        //intent = getIntent()
        //val id = intent.getStringExtra("test_id")
        //val lectureView = findViewById<TextView>(R.id.lecture)
        //lectureView.text = id
        val lectures = generateLecture()
        compare(lectures, id)
    }

    fun compare(lectures: List<Lecture>, id: Int){
        val lectureView = findViewById<TextView>(R.id.lecture)
        val roomView = findViewById<TextView>(R.id.room)
        val timeView = findViewById<TextView>(R.id.time)
        val dateView = findViewById<TextView>(R.id.date)
        val type = findViewById<TextView>(R.id.type)
        lectureView.text = lectures[id].lecture
        roomView.text = lectures[id].room
        timeView.text = lectures[id].time
        dateView.text = lectures[id].date
        type.text = lectures[id].type
    }

    fun generateLecture(): kotlin.collections.List<Lecture> {
        val lectures = ArrayList<Lecture>()
        lectures.add(Lecture(1,"name1", "21 room", "21:00", "30 November", "Andriod"))
        lectures.add(Lecture(2,"name2", "22 room", "22:00", "25 November", "Kotlin"))
        lectures.add(Lecture(3,"name3", "23 room", "23:00", "24 November", "Java"))
        lectures.add(Lecture(4,"name4", "24 room", "24:00", "26 November", "PHP"))
        lectures.add(Lecture(5,"name5", "25 room", "20:00", "29 November", "TEAM"))
        lectures.add(Lecture(6,"name6", "26 room", "14:00", "90 November", "LOVE"))
        lectures.add(Lecture(7,"name7", "27 room", "13:00", "44 November", "C++"))
        lectures.add(Lecture(8,"name8", "28 room", "12:00", "55 November", "C"))
        lectures.add(Lecture(9,"name9", "29 room", "16:00", "32 November", "IOS"))
        lectures.add(Lecture(10,"name12", "30 room", "19:00", "45 November", "JS"))
        lectures.add(Lecture(11,"name13", "31 room", "17:00", "21 November", "TOP"))
        lectures.add(Lecture(12,"name14", "32 room", "18:00", "64 November", "TOR"))
        lectures.add(Lecture(13,"name15", "33 room", "14:00", "32 November", "PM"))
        lectures.add(Lecture(14,"name16", "34 room", "10:00", "35 November", "LINK"))

        return lectures
    }
}
