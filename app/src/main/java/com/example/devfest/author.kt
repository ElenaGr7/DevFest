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
        intent = getIntent()
        //val id = intent.getStringExtra("test_id")

        val id = test2

        val lectureView = findViewById<TextView>(R.id.lecture)
        lectureView.text = id
    }

    /*fun compare(lectures: List<Lecture>){
        var i: Int = 0;
        var x: Int = 0;
        val intent = intent
        val id = intent.getStringExtra("id")
        while ((i <= lectures.size) && (x==0)) {
            if (lectures[i].lecture == id) {
                x = 1
                i++
                val lectureView = findViewById<View>(R.id.lecture) as TextView
                val roomView = findViewById<View>(R.id.room) as TextView
                val timeView = findViewById<View>(R.id.time) as TextView
                val dateView = findViewById<View>(R.id.date) as TextView
                val type = findViewById<View>(R.id.type) as TextView
                lectureView.text = lectures[i].lecture
                roomView.text = lectures[i].room
                timeView.text = lectures[i].time
                dateView.text = lectures[i].date
                type.text = lectures[i].type
            }
        }
    }*/

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
