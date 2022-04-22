package com.example.testahemmanu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button textknapp = findViewById(R.id.toggletext);
        textknapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("====", "knapp klick work");

                TextView hellotext = findViewById(R.id.helloText);

                hellotext.setVisibility(View.VISIBLE);
            }
        });

        Button changeText = findViewById(R.id.beep2);
        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText.setText("1");
                Log.d("===", "knapp  beep klick");
            }
        });


    }





}