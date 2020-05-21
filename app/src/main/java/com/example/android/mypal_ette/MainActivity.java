package com.example.android.mypal_ette;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String pickedColor = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton colorChosen = (ImageButton) findViewById(R.id.base_brown);
        colorChosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickedColor = "Red, yellow, brown, white(extra)";
                displayColors(pickedColor);

            }

        });
    }
        public void displayColors(String message) {

            TextView orderSummaryTextView = (TextView) findViewById(R.id.color_recommendations);
            orderSummaryTextView.setText(pickedColor);
        }


        }



