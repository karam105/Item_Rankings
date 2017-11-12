package com.example.marc.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marc.myapplication.R;
import com.example.marc.myapplication.MovieListAdapter;

/**
 * Created by Marc on 11/12/2017.
 */

public class MovieListFragment extends Fragment
{
    private MovieListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_movie_list, container, false);

        RecyclerView moviesList = v.findViewById(R.id.rv_movies);

        this.adapter = new MovieListAdapter();
        moviesList.setAdapter(adapter);

        moviesList.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

    @Override
    public void onResume()
    {
        super.onResume();

        this.adapter.notifyDataSetChanged();
    }
}
