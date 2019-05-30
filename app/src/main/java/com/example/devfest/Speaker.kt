package com.example.devfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Speaker(
    var name: String? = null,
    var prof: String? = null,
    var city: String? = null,
    var photo: Int = 0) {
}

class Lecture(
    var lecture: String? = null,
    var room: String? = null,
    var time: String? = null,
    var date: String? = null,
    var type: String? = null) {
}