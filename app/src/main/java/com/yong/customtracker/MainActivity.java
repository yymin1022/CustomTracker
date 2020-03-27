package com.yong.customtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor preferenceEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("preference", MODE_PRIVATE);
        if(sharedPreferences.getBoolean("isFirst", true)){
            startActivity(getApplicationContext(), WelcomeActivity.class));
        }
    }
}