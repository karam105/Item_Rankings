package com.example.marc.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.marc.myapplication.MovieCollection;
import com.example.marc.myapplication.R;
import com.example.marc.myapplication.MovieActivity;
import com.example.marc.myapplication.MovieModel;

/**
 * Created by Marc on 11/12/2017.
 */

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieViewHolder>
{
    private final String LOGTAG = "MovieListAdapter";

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

        MovieModel movie = MovieCollection.GetInstance().getMovies().get(position);

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
        private CheckBox movieSeenCheck;

        public MovieViewHolder(View itemView)
        {
            super(itemView);

            itemView.setOnClickListener(this);

            this.titleTextView = itemView.findViewById(R.id.title);
            this.movieSeenCheck = itemView.findViewById(R.id.movie_seen);
        }

        public void setup(MovieModel movie)
        {
            this.movie = movie;

            this.titleTextView.setText(movie.getTitle());
            this.movieSeenCheck.setChecked(movie.isSeen());
        }

        @Override
        public void onClick(View view)
        {
            Intent movieIntent = new Intent(view.getContext(), MovieActivity.class);
            movieIntent.putExtra(MovieActivity.MOVIE_ID, this.movie.getId());

            view.getContext().startActivity(movieIntent);
        }
    }
}
