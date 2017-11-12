package com.example.marc.myapplication;

import java.util.ArrayList;
import java.util.List;

import com.example.marc.myapplication.MovieModel;

/**
 * Created by Marc on 11/12/2017.
 */

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

        for (int i = 0; i < 10; ++i)
        {
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
        for (MovieModel movie : this.movies)
        {
            if (movie.getId().equals(id))
            {
                return movie;
            }
        }

        return null;
    }
}
