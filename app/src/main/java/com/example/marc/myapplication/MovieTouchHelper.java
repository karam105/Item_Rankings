package com.example.marc.myapplication;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.marc.myapplication.adapters.MovieListAdapter;

/**
 * Created by Marc on 11/12/2017.
 */

public class MovieTouchHelper extends ItemTouchHelper.SimpleCallback
{
    public MovieListAdapter mAdapter;

    public MovieTouchHelper(MovieListAdapter adapter)
    {
        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN,  ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT);
        this.mAdapter = adapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target)
    {
        mAdapter.swapPositions(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction)
    {
        mAdapter.removeElement(viewHolder.getAdapterPosition());
    }
}
