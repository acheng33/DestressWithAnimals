package com.example.angiecheng.destresswithanimals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == startButton) {
                    Intent directToPictures = new Intent(MainActivity.this, ImageDisplay.class);
                    MainActivity.this.startActivity(directToPictures);
                    Log.d("start", "worked!");
                }
                Log.d("start", "taken to next page!");
            }
        });

        final Button dogList = (Button) findViewById(R.id.dogList);
        dogList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("dogList", "dog checked!");
            }
        });

        final Button catList = (Button) findViewById(R.id.catList);
        catList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("catList", "cat checked!");
            }
        });

        final Button aquaticList = (Button) findViewById(R.id.aquaticList);
        aquaticList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("aquaticList", "aquatics checked!");
            }
        });

        final Button babyAnimalList = (Button) findViewById(R.id.babyAnimalList);
        babyAnimalList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("babyAnimalList", "baby animals checked!");
            }
        });

        final Button forestAnimalList = (Button) findViewById(R.id.forestAnimalList);
        forestAnimalList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("forestAnimalList", "forest animals checked!");
            }
        });

        final Button smallAnimalList = (Button) findViewById(R.id.smallAnimalList);
        smallAnimalList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("smallAnimalList", "small animals checked!");
            }
        });

        final Button horseList = (Button) findViewById(R.id.horseList);
        horseList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("horseList", "horse list checked!");
            }
        });

        final Button foxList = (Button) findViewById(R.id.foxList);
        foxList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("foxList", "fox list checked!");
            }
        });
    }
}