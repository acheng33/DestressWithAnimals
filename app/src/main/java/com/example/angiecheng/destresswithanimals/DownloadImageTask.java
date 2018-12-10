package com.example.angiecheng.destresswithanimals;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

public class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
    ImageView bmImage;
    public DownloadImageTask(ImageView bmImage) {
        this.bmImage = bmImage;
    }

    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap bmp = null;
        try {
            Log.d("1", urldisplay);
            InputStream in = new java.net.URL(urldisplay).openStream();
            Log.d("2", urldisplay);
            bmp = BitmapFactory.decodeStream(in);
            Log.d("3", urldisplay);
        } catch (Exception e) {
            Log.e("Error", (e.getMessage() == null) ? "image load failed!" :e.getMessage());
            e.printStackTrace();
        }
        return bmp;
    }
    protected void onPostExecute(Bitmap result) {
        bmImage.setImageBitmap(result);
    }
}