package com.example.marc.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.example.marc.myapplication.MovieFragment;
/**
 * Created by Marc on 11/12/2017.
 */

public class MovieActivity extends MainActivity
{
    public static final String MOVIE_ID = "movie_id";

    @Override
    protected Fragment getFragment()
    {
        Bundle extras = getIntent().getExtras();

        MovieFragment frag = new MovieFragment();
        frag.setArguments(extras);

        return frag;
    }
}
