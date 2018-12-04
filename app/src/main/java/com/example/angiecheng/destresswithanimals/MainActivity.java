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
                    Intent intentMain = new Intent(MainActivity.this, ImageDisplay.class);
                    MainActivity.this.startActivity(intentMain);
                    Log.d("start", "worked!");
                }
                Log.d("start", "taken to next page!");
            }
        });

        Button scrollBack = (Button) findViewById(R.id.scrollBack);
        scrollBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("previous", "I'm working!");
                Log.d("previous", "Hello World!");
            }
        });

        Button scrollForward = (Button) findViewById(R.id.scrollForward);
        scrollForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("next","I'm also working!");
            }
        });

        Button dogList = (Button) findViewById(R.id.dogList);
        dogList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("dogList", "dog checked!");
            }
        });

        Button catList = (Button) findViewById(R.id.catList);
        catList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("catList", "cat checked!");
            }
        });

        Button aquaticList = (Button) findViewById(R.id.aquaticList);
        aquaticList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("aquaticList", "aquatics checked!");
            }
        });

        Button babyAnimalList = (Button) findViewById(R.id.babyAnimalList);
        babyAnimalList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("babyAnimalList", "baby animals checked!");
            }
        });

        Button forestAnimalList = (Button) findViewById(R.id.forestAnimalList);
        forestAnimalList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("forestAnimalList", "forest animals checked!");
            }
        });

        Button smallAnimalList = (Button) findViewById(R.id.smallAnimalList);
        smallAnimalList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("smallAnimalList", "small animals checked!");
            }
        });

        Button horseList = (Button) findViewById(R.id.horseList);
        horseList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("horseList", "horse list checked!");
            }
        });

        Button foxList = (Button) findViewById(R.id.foxList);
        foxList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("foxList", "fox list checked!");
            }
        });
    }
}