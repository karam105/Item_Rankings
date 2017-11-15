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
        MovieModel movie1 = new MovieModel();
        MovieModel movie2 = new MovieModel();
        MovieModel movie3 = new MovieModel();
        MovieModel movie4 = new MovieModel();
        MovieModel movie5 = new MovieModel();
        MovieModel movie6 = new MovieModel();
        MovieModel movie7 = new MovieModel();
        MovieModel movie8 = new MovieModel();
        MovieModel movie9 = new MovieModel();
        MovieModel movie10 = new MovieModel();

        movie1.setTitle("The GodFather");
        movie2.setTitle("The Shawshank Redemption");
        movie3.setTitle("Forrest Gump");
        movie4.setTitle("The Dark Knight");
        movie5.setTitle("Lord of the Rings");
        movie6.setTitle("Pulp Fiction");
        movie7.setTitle("Star Wars: Episode V");
        movie8.setTitle("Saving Private Ryan");
        movie9.setTitle("Back to the Future");
        movie10.setTitle("Titanic");

        movie1.setSeen(true);
        movie2.setSeen(false);
        movie3.setSeen(false);
        movie4.setSeen(true);
        movie5.setSeen(false);
        movie6.setSeen(false);
        movie7.setSeen(false);
        movie8.setSeen(false);
        movie9.setSeen(true);
        movie10.setSeen(true);

        this.movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
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
