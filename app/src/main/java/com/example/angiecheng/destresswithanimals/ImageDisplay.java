package com.example.angiecheng.destresswithanimals;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageDisplay extends AppCompatActivity {
    int drawableCounter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        final Button previousPicture = (Button) findViewById(R.id.previousPicture);
        previousPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View goBackOnePicture) {
                drawableCounter--;
                if (drawableCounter < 1) {
                    drawableCounter = 20;
                }
                int previousPhotoID = getBaseContext().getResources().getIdentifier("test" + drawableCounter,
                        "drawable", getBaseContext().getPackageName());
                ImageView testDisplayPrevious = (ImageView) findViewById(R.id.displayPhoto);
                testDisplayPrevious.setImageResource(previousPhotoID);
            }
        });

        final Button nextPicture = (Button) findViewById(R.id.nextPicture);
        nextPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View goForwardOnePicture) {
                drawableCounter++;
                if (drawableCounter > 20) {
                    drawableCounter = drawableCounter % 20;
                }
                ImageView testDisplayNext = (ImageView) findViewById(R.id.displayPhoto);
                int nextPhotoID = getBaseContext().getResources().getIdentifier("test" + drawableCounter,
                        "drawable", getBaseContext().getPackageName());
                testDisplayNext.setImageResource(nextPhotoID);
            }
        });

        MediaPlayer playMusic = MediaPlayer.create(ImageDisplay.this, R.raw.song3);
        playMusic.start();

        final Button returnHome = (Button) findViewById(R.id.returnHome);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View returnToHomeScreen) {
                if (returnToHomeScreen == returnHome) {
                    Intent returnHome = new Intent(ImageDisplay.this, MainActivity.class);
                    ImageDisplay.this.startActivity(returnHome);
                }
                MediaPlayer playMusic = MediaPlayer.create(ImageDisplay.this, R.raw.song3);
                playMusic.stop();
            }
        });



    }
}
