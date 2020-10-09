package com.eman.assigment1.mood;

public class MovieFactory {
    public IMovieDA getModel(){
        return new MovieDA();
    }
}
