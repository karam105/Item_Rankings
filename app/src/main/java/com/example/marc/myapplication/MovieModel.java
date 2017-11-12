package com.example.marc.myapplication;

import java.util.UUID;

/**
 * Created by Marc on 11/12/2017.
 */

public class MovieModel
{
    private String id;
    private String title;
    private boolean seen;

    public MovieModel()
    {
        this.id = UUID.randomUUID().toString();
    }

    public String getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public boolean isSeen()
    {
        return seen;
    }
    public void setSeen(boolean seen)
    {
        this.seen = seen;
    }
}
