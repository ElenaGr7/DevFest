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

        val authors = generatAuthors()
        val recyclerView = findViewById<RecyclerView>(R.id.list) as RecyclerView
        val adapter = AuthorsAdapter(authors)
        recyclerView.adapter = adapter

    }

    fun generatAuthors(): kotlin.collections.List<Speaker> {
        val authors = ArrayList<Speaker>()
        authors.add(Speaker("name1", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name2", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name3", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name4", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name5", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name6", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name7", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name8", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name9", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name12", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name13", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name14", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name15", "prof", "city", R.drawable.evgenykot))
        authors.add(Speaker("name16", "prof", "city", R.drawable.evgenykot))

        return authors
    }
}
