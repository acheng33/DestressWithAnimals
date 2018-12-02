package com.example.angiecheng.destresswithanimals;

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

        Button startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("start", "worked!");
            }
        });

        Button scrollBack = (Button) findViewById(R.id.scrollBack);
        scrollBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("previous", "I'm working!");
            }
        });

        Button scrollForward = (Button) findViewById(R.id.scrollForward);
        scrollForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("next","I'm also working!");
            }
        });
    }
}
