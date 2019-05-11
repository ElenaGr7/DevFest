package com.example.devfest;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AuthorsAdapter
        extends RecyclerView.Adapter<AuthorsAdapter.AuthorsHolder> {

    private final List<Speaker> authors;

    AuthorsAdapter(List<Speaker> authors) {
        this.authors = authors;
    }

    @NonNull
    @Override
    public AuthorsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_speaker, parent, false);
        return new AuthorsHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AuthorsHolder holder, int position) {
        Speaker speaker = authors.get(position);
        holder.photoView.setImageResource(speaker.getPhoto());
        holder.nameView.setText(speaker.getName());
        holder.profView.setText(speaker.getProf());
        holder.cityView.setText(speaker.getCity());
    }

    @Override
    public int getItemCount() {
        return authors.size();
    }

    static class AuthorsHolder extends RecyclerView.ViewHolder {
        final ImageView photoView;
        final TextView nameView, profView, cityView;
        AuthorsHolder(View itemView){
            super(itemView);
            photoView = (ImageView)itemView.findViewById(R.id.photo);
            nameView = (TextView)itemView.findViewById(R.id.name);
            profView = (TextView)itemView.findViewById(R.id.prof);
            cityView = (TextView)itemView.findViewById(R.id.city);
        }
    }
}

