package com.example.marc.myapplication.fragments;

import android.content.ClipData;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import com.example.marc.myapplication.MovieTouchHelper;
import com.example.marc.myapplication.R;
import com.example.marc.myapplication.adapters.MovieListAdapter;


public class MovieListFragment extends Fragment
{
    private MovieListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_movie_list, container, false);

        RecyclerView moviesListView = v.findViewById(R.id.rv_movies);

        this.adapter = new MovieListAdapter();
        moviesListView.setAdapter(adapter);

        // This is lame - don't study this, just do it
        moviesListView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ItemTouchHelper.Callback callback = new MovieTouchHelper(adapter);
        ItemTouchHelper helper = new ItemTouchHelper(callback);
        helper.attachToRecyclerView(moviesListView);

        return v;
    }

    @Override
    public void onResume()
    {
        super.onResume();

        this.adapter.notifyDataSetChanged();
    }
}
