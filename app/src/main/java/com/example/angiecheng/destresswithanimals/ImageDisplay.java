package com.example.angiecheng.destresswithanimals;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class ImageDisplay extends AppCompatActivity {
    final String URL = "https://dog.ceo/api/breeds/image/random";
    int drawableCounter = 0;

    MediaPlayer musicPlayer;
    ImageView imageView;
    Button returnHome;
    RequestQueue queue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context ctx = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);
        imageView = findViewById(R.id.displayPhoto);
        returnHome = findViewById(R.id.returnHome);

        queue = Volley.newRequestQueue(this);

        musicPlayer = MediaPlayer.create(ImageDisplay.this, R.raw.song3);
        musicPlayer.setLooping(true);
        musicPlayer.start();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View goForwardOnePicture) {

                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            Log.d("APP", response.toString());
                            DownloadImageTask d = new DownloadImageTask(imageView);
                            d.execute(response.getString("message"));
                        } catch (Exception error) {
                            Log.e("APP", error.toString());
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("APP", error.toString());
                    }
                });
                queue.add(jsonObjectRequest);
            }
        });
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View returnToHomeScreen) {
                if (returnToHomeScreen == returnHome) {
                    musicPlayer.stop();
                    Intent returnHome = new Intent(ImageDisplay.this, MainActivity.class);
                    ImageDisplay.this.startActivity(returnHome);
                }
            }
        });

    }
}
