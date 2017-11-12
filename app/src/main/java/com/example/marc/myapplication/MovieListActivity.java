package com.example.marc.myapplication;

import android.support.v4.app.Fragment;

import com.example.marc.myapplication.MovieListFragment;

/**
 * Created by Marc on 11/12/2017.
 */

public class MovieListActivity extends MainActivity
{
    @Override
    protected Fragment getFragment()
    {
        return new MovieListFragment();
    }
}
