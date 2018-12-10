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
            public void onClick(View startDisplay) {
                if (startDisplay == startButton) {
                    Intent directToPictures = new Intent(MainActivity.this, ImageDisplay.class);
                    MainActivity.this.startActivity(directToPictures);
                    Log.d("start", "worked!");
                }
                Log.d("start", "taken to next page!");
            }
        });


    }
}