package com.dla.fichafit;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

@SuppressLint("CustomSplashScreen")
public class A_A_SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_splash_screen);

        // Oculta a ActionBar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) { actionBar.hide(); }

        LinearLayout btn_splash_start = findViewById(R.id.btn_splash_start);

        btn_splash_start.setOnClickListener(view -> {

            boolean doesDatabaseExist = S_ConexaoDAO.doesDatabaseExist(A_A_SplashScreenActivity.this);
            if (!doesDatabaseExist) {
                Toast.makeText(this, "Não possi BD", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Possui BD", Toast.LENGTH_SHORT).show();
            }
            
        });

    }
}