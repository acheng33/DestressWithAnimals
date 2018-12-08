package com.example.angiecheng.destresswithanimals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageDisplay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        final Button previousPicture = (Button) findViewById(R.id.previousPicture);
        previousPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View goBackOnePicture) {
                Log.d("previousPicture", "take to previous photo");
            }
        });

        final Button nextPicture = (Button) findViewById(R.id.nextPicture);
        nextPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View goForwardOnePicture) {
                Log.d("nextPicture", "take to next photo");

                ImageView testDisplayImage = (ImageView) findViewById(R.id.displayPhoto);
                testDisplayImage.setImageResource(R.drawable.test1);
            }
        });

        final Button returnHome = (Button) findViewById(R.id.returnHome);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View returnToHomeScreen) {
                if (returnToHomeScreen == returnHome) {
                    Intent returnHome = new Intent(ImageDisplay.this, MainActivity.class);
                    ImageDisplay.this.startActivity(returnHome);
                    Log.d("return home", "returned to home screen");
                }
                Log.d("returnHome", "worked!");
            }
        });

        final Button favoritePicture = (Button) findViewById(R.id.favoritePicture);
        favoritePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View favoritePictureList) {
                Log.d("favoritePicture", "picutre is favorited!");
            }
        });

    }
}
