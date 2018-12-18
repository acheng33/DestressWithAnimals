package com.example.angiecheng.destresswithanimals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CheckListScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklists);

        final Button toImages = (Button) findViewById(R.id.toImageDisplay);
        toImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View toImageDisplay) {
                if (toImageDisplay == toImages) {
                    Intent toCheckListScreen = new Intent(CheckListScreen.this, ImageDisplay.class);
                    CheckListScreen.this.startActivity(toCheckListScreen);

                }
            }
        });


    }
}
