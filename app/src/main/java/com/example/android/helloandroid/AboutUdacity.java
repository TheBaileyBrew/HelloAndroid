package com.example.android.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;


public class AboutUdacity extends AppCompatActivity {

    ImageButton myButton;
    View myView;
    View myView2;
    View myView3;
    boolean isUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_udacity);

        myView = findViewById(R.id.fb);
        myView2 = findViewById(R.id.tweet);
        myView3 = findViewById(R.id.youtube);
        myButton = findViewById(R.id.my_button);

        //set as invisible
        myView.setVisibility(View.INVISIBLE);
        myView2.setVisibility(View.INVISIBLE);
        myView3.setVisibility(View.INVISIBLE);
        isUp = false;
    }


    public void buttonFB(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/udacity"));
        startActivity(browserIntent);
    }

    public void buttonTube(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/udacity"));
        startActivity(browserIntent);
    }

    public void buttonTweet(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/udacity"));
        startActivity(browserIntent);
    }

    // slide the view from below itself to the current position
    public void slideUp(View view) {
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                1000,  // fromYDelta
                0);                // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);

    }

    // slide the view from its current position to below itself
    public void slideDown(View view) {
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                1000); // toYDelta
        animate.setDuration(500);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    public void onSlideViewButtonClick(View view) {
        if (isUp) {
            slideDown(myView);
            slideDown(myView2);
            slideDown(myView3);
        } else {
            slideUp(myView);
            slideUp(myView2);
            slideUp(myView3);
        }
        isUp = !isUp;
    }
}





