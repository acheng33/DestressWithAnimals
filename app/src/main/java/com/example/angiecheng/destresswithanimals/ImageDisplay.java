package com.example.angiecheng.destresswithanimals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageDisplay extends AppCompatActivity {
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        final Button previousPicture = (Button) findViewById(R.id.previousPicture);
        previousPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View goBackOnePicture) {
                i--;
                int previousPhotoID = getBaseContext().getResources().getIdentifier("test" + i, "drawable", getBaseContext().getPackageName());
                ImageView testDisplayPrevious = (ImageView) findViewById(R.id.displayPhoto);
                testDisplayPrevious.setImageResource(previousPhotoID);
            }
        });

        final Button nextPicture = (Button) findViewById(R.id.nextPicture);
        nextPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View goForwardOnePicture) {
                int nextPhotoID = getBaseContext().getResources().getIdentifier("test" + i, "drawable", getBaseContext().getPackageName());
                ImageView testDisplayNext = (ImageView) findViewById(R.id.displayPhoto);
                testDisplayNext.setImageResource(nextPhotoID);
                i++;
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
