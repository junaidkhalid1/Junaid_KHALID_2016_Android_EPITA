package com.epita.android.whatilike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Junaid KHALID on 10/20/2016.
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void MainActivity(View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

}
