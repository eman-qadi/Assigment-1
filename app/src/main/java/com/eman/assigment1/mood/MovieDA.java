package com.eman.assigment1.mood;

import java.util.ArrayList;

public class MovieDA implements IMovieDA{
    ArrayList<Movie> movies =new ArrayList<>();

    public MovieDA() {
        movies.add(new Movie("Money",2009,"horror"));
        movies.add(new Movie("Still Here",2010,"drama"));
        movies.add(new Movie("2 States ",2011,"horror"));
        movies.add(new Movie("Superman vs. The Elite",2013,"Action"));
        movies.add(new Movie("The Tax Collector",2010,"horror"));
        movies.add(new Movie("They Live Inside Us",2012,"family"));
        movies.add(new Movie("Crazy Romance",2015,"comedy"));
        movies.add(new Movie("What's for Dinner, Mom?",2016,"drama"));
        movies.add(new Movie("Troy the Odyssey",2017,"Action"));
        movies.add(new Movie("Deliha 2 ",2018,"comedy"));
        movies.add(new Movie("Scoob!",2020,"comedy"));
        movies.add(new Movie("Anastasia",2019,"family"));
        movies.add(new Movie("Black Box",2020,"horror"));


    }
    
    @Override
    public String[][] getMovie(String titel, int year, String movie_genre){
        String[][] arr = new String[1][3];
        try {
            int num=0;
            if (!titel.equals("")) {
                for (int s = 0; s < movies.size(); s++) {
                    if (titel.equals(movies.get(s).getTitel()) && year == movies.get(s).getYear() && movie_genre.equals(movies.get(s).getMovie_genre())) {
                        arr[num][0]=movies.get(s).getTitel();
                        arr[num][1]= String.valueOf(movies.get(s).getYear());
                        arr[num][2]=movies.get(s).getMovie_genre();
                        ++num;
                    }
                }
            }
            if(titel.equals("")){
                for (int s = 0; s < movies.size(); s++){
                      if (year == movies.get(s).getYear() && movie_genre.equals(movies.get(s).getMovie_genre())) {
                          arr[num][0] = movies.get(s).getTitel();
                          arr[num][1] = String.valueOf(movies.get(s).getYear());
                          arr[num][2] = movies.get(s).getMovie_genre();
                          num += 1;

                      }

                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }
    public Integer[] getYearTOSpinner(){
        return new Integer[]{2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
    }

    public String[] getGenreSpinner(){
        return new String[]{"horror","comedy","drama","family","Action"};
    }
}
