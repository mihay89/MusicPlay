package com.example.adymihai.musicplay;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // get the favorites ImageButton
        ImageButton favorites = (ImageButton)findViewById(R.id.favorites);
        favorites.setOnClickListener(new View.OnClickListener() {
            //start FavoritesActivity
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FavoritesActivity.class));

            }
        });
        // get the library ImageButton and store it in an ImageButton instance variable
        ImageButton library = (ImageButton)findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            //start LibraryActivity
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LibraryActivity.class));

            }
        });
        //get the playNow imageButton and store it in an ImageButton instance variable
        ImageButton playNow = (ImageButton)findViewById(R.id.play_now);
        playNow.setOnClickListener(new View.OnClickListener() {
            //start PlayNowActivity
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlayNowActivity.class));

            }
        });
    }
}
