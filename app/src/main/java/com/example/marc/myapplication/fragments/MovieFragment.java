package com.example.marc.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;


import com.example.marc.myapplication.MovieCollection;
import com.example.marc.myapplication.R;
import com.example.marc.myapplication.activities.MovieActivity;
import com.example.marc.myapplication.Models.MovieModel;


public class MovieFragment extends Fragment
{
    private EditText titleEditText;
    private CheckBox seenCheckBox;
    private EditText plotEditText;

    private MovieModel movie;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String movieId = getArguments().getString(MovieActivity.EXTRA_MOVIE_ID);
        this.movie = MovieCollection.GetInstance().getMovie(movieId);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_movie, container, false);

        this.titleEditText = v.findViewById(R.id.et_title);
        this.titleEditText.setText(this.movie.getTitle());

        this.plotEditText = v.findViewById(R.id.et_plot);
        this.plotEditText.setText(this.movie.getPlot());

        this.seenCheckBox = v.findViewById(R.id.cb_seen);
        this.seenCheckBox.setChecked(this.movie.isSeen());

        this.titleEditText.addTextChangedListener(new TextWatcher()
        {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable)
            {
                movie.setTitle(editable.toString());
            }
        });

        this.plotEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable)
            {
                movie.setPlot(editable.toString());
            }
        });

        this.seenCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked)
            {
                movie.setSeen(isChecked);
            }
        });

        return v;
    }
}
