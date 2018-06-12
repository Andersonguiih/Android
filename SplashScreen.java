package com.example.professor.medlist;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                MostrarMainActivity();
            }
        }, 2000);
    }

    private void MostrarMainActivity() {
        Intent intent = new Intent(
                SplashScreen.this,MainActivity.class
        );
        startActivity(intent);
        finish();
    }

}
