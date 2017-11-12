package com.example.marc.myapplication.activities;

import android.support.v4.app.Fragment;

import com.example.marc.myapplication.fragments.MovieListFragment;

public class MovieListActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment getFragment()
    {
        return new MovieListFragment();
    }
}
