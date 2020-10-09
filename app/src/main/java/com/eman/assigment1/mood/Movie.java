package com.eman.assigment1.mood;

public class Movie {
    private String titel;
    private int year;
    private String movie_genre;

    public Movie(String titel, int year, String movie_genre) {
        this.titel = titel;
        this.year = year;
        this.movie_genre = movie_genre;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMovie_genre() {
        return movie_genre;
    }

    public void setMovie_genre(String movie_genre) {
        this.movie_genre = movie_genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titel='" + titel + '\'' +
                ", year=" + year +
                ", movie_genre='" + movie_genre + '\'' +
                '}';
    }
}
