package com.example.android.helloandroid;

import android.app.MediaRouteButton;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class AboutUdacity extends AppCompatActivity {

    Button myButton;
    View myView;
    boolean isUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_udacity);

        myView = findViewById(R.id.my_view);
        myButton = findViewById(R.id.my_button);

        //set as invisible
        myView.setVisibility(View.INVISIBLE);
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

    public void buttonWWW(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.udacity.com"));
        startActivity(browserIntent);
    }

    // slide the view from below itself to the current position
    public void slideUp(View view) {
        view.setVisibility(View.VISIBLE);
        TranslateAnimation animate = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 100,                 // fromXDelta
                Animation.RELATIVE_TO_PARENT, 100,                 // toXDelta
                Animation.ABSOLUTE, 100,  // fromYDelta
                Animation.ABSOLUTE, 100);                // toYDelta
        animate.setDuration(50);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    // slide the view from its current position to below itself
    public void slideDown(View view) {
        TranslateAnimation animate = new TranslateAnimation(
                0,                 // fromXDelta
                0,                 // toXDelta
                0,                 // fromYDelta
                view.getHeight()); // toYDelta
        animate.setDuration(50);
        animate.setFillAfter(true);
        view.startAnimation(animate);
    }

    public void onSlideViewButtonClick(View view) {
        if (isUp) {
            slideDown(myView);
            myButton.setText("SHOW LINKS");
        } else {
            slideUp(myView);
            myButton.setText("HIDE LINKS");
        }
        isUp = !isUp;
    }
}





