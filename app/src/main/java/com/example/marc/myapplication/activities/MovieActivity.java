package com.example.marc.myapplication.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.example.marc.myapplication.fragments.MovieFragment;

public class MovieActivity extends SingleFragmentActivity
{
    public static final String EXTRA_MOVIE_ID = "movie_id";

    @Override
    protected Fragment getFragment()
    {
        Bundle extras = getIntent().getExtras();

        MovieFragment frag = new MovieFragment();
        frag.setArguments(extras);

        return frag;
    }
}
