package com.example.marc.myapplication;

import java.util.ArrayList;
import java.util.List;

import com.example.marc.myapplication.Models.MovieModel;

public class MovieCollection
{
    private static MovieCollection collection;

    public static MovieCollection GetInstance()
    {
        if (collection == null)
        {
            collection = new MovieCollection();
        }

        return collection;
    }

    private List<MovieModel> movies;

    private MovieCollection()
    {
        MovieModel movie1 = new MovieModel();
        MovieModel movie2 = new MovieModel();
        MovieModel movie3 = new MovieModel();
        MovieModel movie4 = new MovieModel();
        MovieModel movie5 = new MovieModel();
        MovieModel movie6 = new MovieModel();
        MovieModel movie7 = new MovieModel();
        MovieModel movie8 = new MovieModel();
        MovieModel movie9 = new MovieModel();
        MovieModel movie10 = new MovieModel();

        movie1.setTitle("The GodFather");
        movie2.setTitle("The Shawshank Redemption");
        movie3.setTitle("Forrest Gump");
        movie4.setTitle("The Dark Knight");
        movie5.setTitle("Lord of the Rings");
        movie6.setTitle("Pulp Fiction");
        movie7.setTitle("Star Wars: Episode V");
        movie8.setTitle("Saving Private Ryan");
        movie9.setTitle("Back to the Future");
        movie10.setTitle("Titanic");

        movie1.setSeen(true);
        movie2.setSeen(false);
        movie3.setSeen(false);
        movie4.setSeen(true);
        movie5.setSeen(false);
        movie6.setSeen(false);
        movie7.setSeen(false);
        movie8.setSeen(false);
        movie9.setSeen(true);
        movie10.setSeen(true);


        movie1.setTitle2("When the aging head of a famous crime family decides to transfer his position" +
                " to one of his subalterns, a series of unfortunate events start happening to the family," +
                " and a war begins between all the well-known families leading to insolence, deportation," +
                " murder and revenge, and ends with the favorable successor being finally chosen.");

        movie2.setTitle2("Chronicles the experiences of a formerly successful banker as a prisoner in" +
                " the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit." +
                " The film portrays the man's unique way of dealing with his new, torturous life; along" +
                " the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red.");

        movie3.setTitle2("Forrest Gump is a simple man with a low I.Q. but good intentions. He is running" +
                " through childhood with his best and only friend Jenny. His 'mama' teaches him the ways" +
                " of life and leaves him to choose his destiny. Forrest joins the army for service in Vietnam," +
                " finding new friends called Dan and Bubba, he wins medals, creates a famous shrimp fishing fleet," +
                " inspires people to jog, starts a ping-pong craze, creates the smiley, writes bumper stickers and songs," +
                " donates to people and meets the president several times. However, this is all irrelevant to" +
                " Forrest who can only think of his childhood sweetheart Jenny Curran, who has messed up her life." +
                " Although in the end all he wants to prove is that anyone can love anyone.");

        movie4.setTitle2("Set within a year after the events of Batman Begins, Batman, Lieutenant James Gordon," +
                " and new district attorney Harvey Dent successfully begin to round up the criminals that" +
                " plague Gotham City until a mysterious and sadistic criminal mastermind known only as the" +
                " Joker appears in Gotham, creating a new wave of chaos. Batman's struggle against the" +
                " Joker becomes deeply personal, forcing him to \"confront everything he believes\" and" +
                " improve his technology to stop him. A love triangle develops between Bruce Wayne, Dent and Rachel Dawes.");

        movie5.setTitle2("An ancient Ring thought lost for centuries has been found, and through a strange" +
                " twist in fate has been given to a small Hobbit named Frodo. When Gandalf discovers the" +
                " Ring is in fact the One Ring of the Dark Lord Sauron, Frodo must make an epic quest" +
                " to the Cracks of Doom in order to destroy it! However he does not go alone." +
                " He is joined by Gandalf, Legolas the elf, Gimli the Dwarf, Aragorn, Boromir and his" +
                " three Hobbit friends Merry, Pippin and Samwise. Through mountains, snow, darkness, forests," +
                " rivers and plains, facing evil and danger at every corner the Fellowship of the Ring must go." +
                " Their quest to destroy the One Ring is the only hope for the end of the Dark Lords reign!");

        movie6.setTitle2("Jules Winnfield (Samuel L. Jackson) and Vincent Vega (John Travolta) are two hit" +
                " men who are out to retrieve a suitcase stolen from their employer, mob boss Marsellus Wallace (Ving Rhames)." +
                " Wallace has also asked Vincent to take his wife Mia (Uma Thurman) out a few days later when" +
                " Wallace himself will be out of town. Butch Coolidge (Bruce Willis) is an aging boxer who is" +
                " paid by Wallace to lose his fight. The lives of these seemingly unrelated people are woven together" +
                " comprising of a series of funny, bizarre and uncalled-for incidents.");

        movie7.setTitle2("Luke Skywalker, Han Solo, Princess Leia and Chewbacca face attack by the" +
                " Imperial forces and its AT-AT walkers on the ice planet Hoth. While Han and Leia escape" +
                " in the Millennium Falcon, Luke travels to Dagobah in search of Yoda. Only with the" +
                " Jedi master's help will Luke survive when the dark side of the Force beckons him into" +
                " the ultimate duel with Darth Vader.");

        movie8.setTitle2("Opening with the Allied invasion of Normandy on 6 June 1944, members of the" +
                " 2nd Ranger Battalion under Cpt. Miller fight ashore to secure a beachhead. Amidst the fighting," +
                " two brothers are killed in action. Earlier in New Guinea, a third brother is KIA." +
                " Their mother, Mrs. Ryan, is to receive all three of the grave telegrams on the same day." +
                " The United States Army Chief of Staff, George C. Marshall, is given an opportunity to alleviate" +
                " some of her grief when he learns of a fourth brother, Private James Ryan, and decides to send out 8 men" +
                " (Cpt. Miller and select members from 2nd Rangers) to find him and bring him back home to his mother...");

        movie9.setTitle2("Marty McFly, a typical American teenager of the Eighties, is accidentally" +
                " sent back to 1955 in a plutonium-powered DeLorean \"time machine\" invented by a" +
                " slightly mad scientist. During his often hysterical, always amazing trip back in time," +
                " Marty must make certain his teenage parents-to-be meet and fall in love - so he can get back to the future.");

        movie10.setTitle2("84 years later, a 100 year-old woman named Rose DeWitt Bukater tells the story" +
                " to her granddaughter Lizzy Calvert, Brock Lovett, Lewis Bodine, Bobby Buell and Anatoly Mikailavich" +
                " on the Keldysh about her life set in April 10th 1912, on a ship called Titanic when young Rose" +
                " boards the departing ship with the upper-class passengers and her mother, Ruth DeWitt Bukater," +
                " and her fiancé, Caledon Hockley. Meanwhile, a drifter and artist named Jack Dawson and his best" +
                " friend Fabrizio De Rossi win third-class tickets to the ship in a game. And she explains the whole" +
                " story from departure until the death of Titanic on its first and last voyage April 15th, 1912 at 2:20 in the morning.");

        this.movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);
    }

    public List<MovieModel> getMovies()
    {
        return this.movies;
    }

    public void addMovie(MovieModel movie)
    {
        this.movies.add(movie);
    }

    public MovieModel getMovie(String id)
    {
        for(MovieModel movie: this.movies)
        {
            if (movie.getId().equals(id))
            {
                return movie;
            }
        }

        return null;
    }
}
