package com.eman.assigment1.mood;

public interface IMovieDA {

    String[][] getMovie(String titel,int year,String movie_genre);
    Integer[] getYearTOSpinner();
    String[] getGenreSpinner();

}
