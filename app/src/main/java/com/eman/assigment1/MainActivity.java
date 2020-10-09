package com.eman.assigment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import com.eman.assigment1.mood.IMovieDA;
import com.eman.assigment1.mood.Movie;
import com.eman.assigment1.mood.MovieFactory;

public class MainActivity extends AppCompatActivity {
   private Spinner spinner_year;
   private Spinner spinner_gen;
   private EditText titel;
   private EditText resultMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_year=findViewById(R.id.year);
        spinner_gen=findViewById(R.id.genre);
        titel=findViewById(R.id.titleAnser);
        resultMovies=findViewById(R.id.result);
        populateSpinnerYear();
        populateSpinnerGenre();

    }

    private void populateSpinnerGenre() {
        MovieFactory factory=new MovieFactory();
        IMovieDA objMovie=factory.getModel();
        String[] dataOfGente=objMovie.getGenreSpinner();
        ArrayAdapter<String> adapter =new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,dataOfGente);
        spinner_gen.setAdapter(adapter);
    }

    private void populateSpinnerYear() {
        MovieFactory factory=new MovieFactory();
        IMovieDA objMovie=factory.getModel();
        Integer[] dataOfYears=objMovie.getYearTOSpinner();
        ArrayAdapter<Integer> adapter =new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,dataOfYears);
        spinner_year.setAdapter(adapter);
    }

    public void ActionSearch(View view) {

        String yearofmovie = spinner_year.getSelectedItem().toString();
        String gen =spinner_gen.getSelectedItem().toString();
        String titelMovie=titel.getText().toString();

        MovieFactory factory=new MovieFactory();
        IMovieDA objMovie=factory.getModel();

        int year=Integer.parseInt(yearofmovie);
        String[][] result= objMovie.getMovie(titelMovie,year,gen);
        String all= new String();

        for (int a =0 ; a< result.length;a++) {
                all=all+"titel :"+result[a][0]+", Year :"+result[a][1]+", Type :"+result[a][2]+"\n";
        }

        resultMovies.setText(all+" ");
    }
}