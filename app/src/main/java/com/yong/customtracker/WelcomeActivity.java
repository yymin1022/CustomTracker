package com.yong.customtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button btnDone = findViewById(R.id.btn_welcome_done);
        SharedPreferences sharedPreferences = getSharedPreferences("preference", MODE_PRIVATE);
        final SharedPreferences.Editor preferenceEditor = sharedPreferences.edit();
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_welcome_done:
                        preferenceEditor.putBoolean("isFirst", false);
                        preferenceEditor.apply();
                        finish();
                }
            }
        };

        btnDone.setOnClickListener(onClickListener);
    }
}
