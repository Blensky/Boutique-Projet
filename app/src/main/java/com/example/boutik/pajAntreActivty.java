package com.example.boutik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class pajAntreActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paj_antre);

    ////////////////////add handler start////////////////////////////
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(pajAntreActivty.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }, 3000);
    //after 3 secs it will automatically redirect to the MainActivity page
    ////////////////////add handler end//////////////////////////////
    }
}