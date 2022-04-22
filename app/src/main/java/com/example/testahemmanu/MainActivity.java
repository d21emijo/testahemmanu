package com.example.testahemmanu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

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
                Log.d("===", "knapp  beep2 klick");
            }
        });



        TextView firstName = findViewById(R.id.firstName);
        TextView fakeName = findViewById(R.id.fakeName);

        TextView firstNameedt = findViewById(R.id.textFirstName);

        Button logindetail = findViewById(R.id.beep);
        logindetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("===", "knapp beep klick");

                String loginfirstname = firstName.getText().toString();

                Log.d("===", loginfirstname);

                firstNameedt.setText(loginfirstname);
            }
        });

    }





}