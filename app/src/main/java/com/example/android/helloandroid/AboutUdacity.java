package com.example.android.helloandroid;

import android.app.MediaRouteButton;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class AboutUdacity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_udacity);

        }


    public void buttonFB (View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/udacity"));
        startActivity(browserIntent);
    }
    public void buttonTube (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/udacity"));
        startActivity(browserIntent);
    }
    public void buttonTweet (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/udacity"));
        startActivity(browserIntent);
    }
    public void buttonWWW (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.udacity.com"));
        startActivity(browserIntent);
    }





}
