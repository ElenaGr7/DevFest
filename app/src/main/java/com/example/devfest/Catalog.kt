package com.example.devfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import java.util.ArrayList

class Catalog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)
        val authors = generateAuthors()
        val recyclerView = findViewById<RecyclerView>(R.id.list) as RecyclerView
        val adapter = AuthorsAdapter(authors)
        recyclerView.adapter = adapter
    }
    fun generateAuthors(): kotlin.collections.List<Speaker> {
        val authors = ArrayList<Speaker>()
        authors.add(Speaker(0,"name0", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(1,"name1", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(2,"name2", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(3,"name3", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(4,"name4", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(5,"name5", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(6,"name6", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(7,"name7", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(8,"name8", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(9,"name9", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(10,"name12", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(11,"name13", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(12,"name14", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(13,"name15", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker(14,"name16", "prof", "city", R.drawable.evgenykot))

        return authors
    }
}
