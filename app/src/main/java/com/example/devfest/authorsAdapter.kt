package com.example.devfest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class AuthorsAdapter2 internal constructor(private val authors: List<Author>) :
    RecyclerView.Adapter<AuthorsAdapter.AuthorsHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsHolder {
        // create a new view
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.item_speaker, parent, false)
        return AuthorsHolder(itemView)
    }

    override fun onBindViewHolder(holder: AuthorsHolder, position: Int) {
        // get our custom object from our dataset at this position
        val author = authors[position]
        holder.photoView.setImageResource(Catalog.getPhoto())
        holder.nameView.setText(Catalog.getName())
        holder.profView.setText(Catalog.getProf())
        holder.cityView.setText(Catalog.getCity())
    }

    override fun getItemCount(): Int {
        return authors.size
    }

    internal class AuthorsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val photoView: ImageView
        val nameView: TextView
        val profView: TextView
        val cityView: TextView

        init {
            photoView = itemView.findViewById(R.id.photo) as ImageView
            nameView = itemView.findViewById(R.id.name) as TextView
            profView = itemView.findViewById(R.id.prof) as TextView
            cityView = itemView.findViewById(R.id.city) as TextView
        }
    }
}

