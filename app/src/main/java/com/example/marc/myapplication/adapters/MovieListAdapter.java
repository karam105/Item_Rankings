package com.example.marc.myapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.marc.myapplication.MovieCollection;
import com.example.marc.myapplication.R;
import com.example.marc.myapplication.activities.MovieActivity;
import com.example.marc.myapplication.Models.MovieModel;


public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>
{
    private final String LOGTAG = "CrimeListAdapter";

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        Log.d(LOGTAG, "onCreateViewHolder()");

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.movie_cell, parent, false);

        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position)
    {
        Log.d(LOGTAG, "onBindViewHolder(" + position + ")");
        // Get crime at specified position
        MovieModel movie = MovieCollection.GetInstance().getMovies().get(position);

        // Setup the ViewHolder
        holder.setup(movie);
    }

    @Override
    public int getItemCount()
    {
        Log.d(LOGTAG, "getItemCount()");
        return MovieCollection.GetInstance().getMovies().size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private MovieModel movie;

        private TextView titleTextView;
        private CheckBox solvedCheckbox;

        public MovieViewHolder(View itemView)
        {
            super(itemView);

            itemView.setOnClickListener(this);

            this.titleTextView = itemView.findViewById(R.id.tv_title);
            this.solvedCheckbox = itemView.findViewById(R.id.cb_solved);
        }

        public void setup(MovieModel movie)
        {
            this.movie = movie;

            this.titleTextView.setText(movie.getTitle());
            this.solvedCheckbox.setChecked(movie.isSeen());
        }

        @Override
        public void onClick(View view)
        {
            Intent crimeIntent = new Intent(view.getContext(), MovieActivity.class);
            crimeIntent.putExtra(MovieActivity.EXTRA_CRIME_ID, this.movie.getId());

            view.getContext().startActivity(crimeIntent);
        }
    }
}
