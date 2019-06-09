package com.example.devfest

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class AuthorsAdapter internal constructor(private val authors: List<Speaker>) :
    RecyclerView.Adapter<AuthorsAdapter.AuthorsHolder>() {

    //var test_id: String = "test_id"

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_speaker, parent, false)
        return AuthorsHolder(itemView)
    }

    override fun onBindViewHolder(holder: AuthorsHolder, position: Int) {
        val speaker = authors[position]
        holder.photoView.setImageResource(speaker.photo)
        holder.nameView.text = speaker.name
        holder.profView.text = speaker.prof
        holder.cityView.text = speaker.city
        val ACTION_OPEN = "com.example.devfest.SHOW_AUTHOR"
        holder.itemView.setOnClickListener {
            //val intent = Intent(ACTION_OPEN)
            //intent.putExtra(test_id, speaker.name)
            id = speaker.id
            holder.itemView.getContext().startActivity(Intent(ACTION_OPEN))
        }
    }

    override fun getItemCount(): Int {
        return authors.size
    }

    class AuthorsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoView: ImageView
        val nameView: TextView
        val profView: TextView
        val cityView: TextView
        init {
            photoView = itemView.findViewById<View>(R.id.photo) as ImageView
            nameView = itemView.findViewById<View>(R.id.name) as TextView
            profView = itemView.findViewById<View>(R.id.prof) as TextView
            cityView = itemView.findViewById<View>(R.id.city) as TextView
        }
    }
}

