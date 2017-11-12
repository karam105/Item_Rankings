package com.example.marc.myapplication;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import com.example.marc.myapplication.Models.MovieModel;

public class MovieCollection
{
    private static MovieCollection collection;

    public static MovieCollection GetInstance()
    {
        if (collection == null)
        {
            collection = new MovieCollection();
        }

        return collection;
    }

    private List<MovieModel> movies;

    private MovieCollection()
    {
        this.movies = new ArrayList<>();

        // Randomly generate 100 crimes
        for (int i = 0; i < 100; ++i)
        {
            Log.i("Test", "Generating stuff");

            MovieModel movie = new MovieModel();
            movie.setTitle("Movie #" + (i+1));
            movie.setSeen(i % 2 == 0);

            this.movies.add(movie);
        }
    }

    public List<MovieModel> getMovies()
    {
        return this.movies;
    }

    public void addMovie(MovieModel movie)
    {
        this.movies.add(movie);
    }

    public MovieModel getMovie(String id)
    {
        for(MovieModel movie: this.movies)
        {
            if (movie.getId().equals(id))
            {
                return movie;
            }
        }

        return null;
    }
}
