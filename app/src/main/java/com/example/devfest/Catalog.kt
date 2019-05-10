package com.example.devfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import java.util.ArrayList





class Catalog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        generatAuthors()
        val recyclerView = findViewById<RecyclerView>(R.id.list) as RecyclerView
        val adapter = AuthorsAdapter(this, authors)
        recyclerView.adapter = adapter
    }

    fun generatAuthors(): kotlin.collections.List<Speaker> {
        val authors = ArrayList<Speaker>()
        authors.add(Speaker(R.drawable.evgenykot))

        return authors
    }
}
