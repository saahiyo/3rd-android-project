package com.mycy.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.mycy.myapp.MainActivity;

public class splash extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Start your main activity after the splash time out
                    Intent intent = new Intent(splash.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Close the splash activity so the user can't go back to it
                }
            }, 2000);
    }
}
