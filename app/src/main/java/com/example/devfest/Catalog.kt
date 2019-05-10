package com.example.devfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.R
import android.support.v7.widget.RecyclerView
import android.provider.ContactsContract.CommonDataKinds.Phone
import java.util.ArrayList


class Catalog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        setInitialData()
        val recyclerView = findViewById<View>(R.id.list) as RecyclerView
        // создаем адаптер
        val adapter = DataAdapter(this, authors)
        // устанавливаем для списка адаптер
        recyclerView.adapter = adapter
    }

    fun generateCats(): List<Speaker> {
        val authors = ArrayList<Speaker>()
        authors.add(new Speaker("KOT", "Разработчик", "С-Пб", R.drawable.evgenykot));
        return authors
    }
}
