package com.example.marc.myapplication.Models;



import java.util.UUID;

public class MovieModel
{
    private String id;
    private String title;
    private String title2;
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

    public String getTitle2()
    {
        return title2;
    }

    public void setTitle2(String title2)
    {
        this.title2 = title2;
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
