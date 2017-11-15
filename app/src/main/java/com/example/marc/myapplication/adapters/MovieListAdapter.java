package com.example.marc.myapplication.adapters;

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
import com.example.marc.myapplication.activities.MovieActivity;
import com.example.marc.myapplication.Models.MovieModel;

import java.util.Collections;


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

    public void removeElement(int itemPosition)
    {
        MovieCollection.GetInstance().getMovies().remove(itemPosition);
        notifyItemRemoved(itemPosition);
    }

    public void swapPositions(int firstItem, int secondItem)
    {
        Collections.swap(MovieCollection.GetInstance().getMovies(), firstItem, secondItem);
        notifyItemMoved(firstItem, secondItem);
    }

    class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private MovieModel movie;

        private TextView titleTextView;
        private CheckBox seenCheckBox;

        public MovieViewHolder(View itemView)
        {
            super(itemView);

            itemView.setOnClickListener(this);

            this.titleTextView = itemView.findViewById(R.id.tv_title);
            this.seenCheckBox = itemView.findViewById(R.id.cb_seen);
        }

        public void setup(MovieModel movie)
        {
            this.movie = movie;

            this.titleTextView.setText(movie.getTitle());
            this.seenCheckBox.setChecked(movie.isSeen());
        }

        @Override
        public void onClick(View view)
        {
            Intent movieIntent = new Intent(view.getContext(), MovieActivity.class);
            movieIntent.putExtra(MovieActivity.EXTRA_MOVIE_ID, this.movie.getId());

            view.getContext().startActivity(movieIntent);
        }
    }
}
