package com.example.marc.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.marc.myapplication.R;
import com.example.marc.myapplication.MovieModel;
import com.example.marc.myapplication.MovieActivity;
import com.example.marc.myapplication.MovieCollection;

/**
 * Created by Marc on 11/12/2017.
 */

public class MovieFragment extends Fragment
{
    private final String LOGTAG = "Moviefragment";

    private TextView titleTextView;
    private CheckBox movieSeen;

    private MovieModel movie;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String movieID = getArguments().getString(MovieActivity.MOVIE_ID);
        this.movie = MovieCollection.GetInstance().getMovie(movieID);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_movie, container, false);
        this.titleTextView = v.findViewById(R.id.tv_title);
        this.titleTextView.setText(this.movie.getTitle());

        this.movieSeen = v.findViewById(R.id.movie_seen);
        this.movieSeen.setChecked(this.movie.isSeen());

        this.titleTextView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
            }

            @Override
            public void afterTextChanged(Editable editable)
            {
                Log.d(LOGTAG, "Text changed! to " + editable.toString());
                movie.setTitle(editable.toString());
            }
        });

        this.movieSeen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isSeen)
            {
                Log.d(LOGTAG, "Seen changed to " + isSeen);
                movie.setSeen(isSeen);
            }
        });

        return v;
    }
}
