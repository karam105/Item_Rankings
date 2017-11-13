package com.example.marc.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;




import com.example.marc.myapplication.MovieCollection;
import com.example.marc.myapplication.MovieTouchHelper;
import com.example.marc.myapplication.R;
import com.example.marc.myapplication.activities.MovieActivity;
import com.example.marc.myapplication.Models.MovieModel;
import com.example.marc.myapplication.adapters.MovieListAdapter;


public class MovieFragment extends Fragment
{
    private final String LOGTAG = "CrimeFragment";

    private EditText titleEditText;
    private CheckBox solvedCheckbox;

    private MovieModel movie;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String crimeId = getArguments().getString(MovieActivity.EXTRA_CRIME_ID);
        this.movie = MovieCollection.GetInstance().getMovie(crimeId);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_movie, container, false);

        this.titleEditText = v.findViewById(R.id.et_title);
        this.titleEditText.setText(this.movie.getTitle());

        this.solvedCheckbox = v.findViewById(R.id.cb_solved);
        this.solvedCheckbox.setChecked(this.movie.isSeen());

        this.titleEditText.addTextChangedListener(new TextWatcher()
        {
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

        this.solvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked)
            {
                Log.d(LOGTAG, "Solved changed to " + isChecked);
                movie.setSeen(isChecked);
            }
        });

        return v;
    }
}
