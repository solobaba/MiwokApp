package com.example.android.miwokapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //Set a clicklistener on that View
        numbers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Create a new intent to open {@link NumbersActivity
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //Start a new activity
                startActivity(numbersIntent);

                //Find the View that shows the family category
                TextView family = (TextView) findViewById(R.id.family);
                //Set a clicklistener on that View
                family.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        //Create a new intent to open {@link FamilyActivity
                        Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                        //Start a new activity
                        startActivity(familyIntent);
                    }
                });

                //Find the View that shows the colors category
                TextView colors = (TextView) findViewById(R.id.colors);
                //Set a clicklistener on that View
                colors.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        //Create a new intent to open {@link ColorsActivity
                        Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                        //Start a new activity
                        startActivity(colorsIntent);
                    }
                });

                //Find the View that shows the colors category
                TextView phrases = (TextView) findViewById(R.id.phrases);
                //Set a clicklistener on that View
                phrases.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        //Create a new intent to open {@link PhrasesActivity
                        Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                        //Start a new activity
                        startActivity(phrasesIntent);
                    }
                });
            }
        });
    }
    }