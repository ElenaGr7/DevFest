package com.example.devfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.provider.ContactsContract.CommonDataKinds.Phone
import java.util.ArrayList
import java.util.List;





class Catalog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        generatAuthors()
        val recyclerView = findViewById(R.id.list) as RecyclerView
        // создаем адаптер
        val adapter = AuthorsAdapter(this, authors)
        // устанавливаем для списка адаптер
        recyclerView.adapter = adapter
    }

    fun generatAuthors(): kotlin.collections.List<Speaker> {
        val authors = ArrayList<Speaker>()
        authors.add(Speaker("1","2","3",R.drawable.evgenykot))

        return authors
    }
}
