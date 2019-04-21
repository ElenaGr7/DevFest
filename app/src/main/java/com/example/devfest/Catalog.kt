package com.example.devfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Catalog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)
    }

    private var name: String? = null
    private var prof: String? = null
    private var city: String? = null
    private var photo: Int = 0

    fun Catalog(name: String, prof: String, city: String, photo: Int){

        this.name = name
        this.prof = prof
        this.city = city
        this.photo = photo
    }

    fun getName(): String? {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getProf(): String? {
        return this.prof
    }

    fun setProf(prof: String) {
        this.prof = prof
    }

    fun getCity(): String? {
        return this.city
    }

    fun setCity(city: String) {
        this.city = city
    }

    fun getPhoto(): Int {
        return this.photo
    }

    fun setPhoto(photo: Int) {
        this.photo = photo
    }
}
