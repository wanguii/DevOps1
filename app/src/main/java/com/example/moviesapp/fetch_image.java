package com.example.moviesapp;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class fetch_image extends AppCompatActivity {

    //creating variables

    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_image);

        //Referencing a view with the variable
        img = findViewById(R.id.image);
        btn = findViewById(R.id.button);
    }
}
