package com.example.android.mypal_ette;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    String pickedColor = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Pulling textviews and finding them by ID so they can be used for onclick Listener


        final TextView baseBrownChosen = (TextView) findViewById(R.id.base_brown);
        final TextView darkBrownChosen = (TextView) findViewById(R.id.dark_brown);
        final TextView tanChosen = (TextView) findViewById(R.id.tan);
        final TextView brickChosen = (TextView) findViewById(R.id.brick_color);
        final TextView violetChosen = (TextView) findViewById(R.id.violet);
        final TextView slateChosen = (TextView) findViewById(R.id.slate);


        //Onlick listener Instructions for the colors
        baseBrownChosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickedColor = "Red, yellow, brown, white(extra)";
                displayColors(pickedColor);


                ArrayList<TextView> colorChoice = new ArrayList<TextView>();
                colorChoice.add((TextView) findViewById(R.id.base_brown));
                colorChoice.add((TextView) findViewById(R.id.dark_brown));


            darkBrownChosen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pickedColor = "Base brown, burnt umber, blue";
                    displayColors(pickedColor);


                    tanChosen.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            pickedColor = "Red, white, yellow(extra)";
                            displayColors(pickedColor);

                            brickChosen.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    pickedColor = "Orange and violet";
                                    displayColors(pickedColor);

                                    violetChosen.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            pickedColor = "red and blue";
                                            displayColors(pickedColor);

                                            slateChosen.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    pickedColor = "violet and green";
                                                    displayColors(pickedColor);
                                                }
                                            });

                                        }
                                    });
                                }
                            });
                        }
                    });

                }
            });

            }
        });
    }


        public void displayColors(String message) {

            TextView orderSummaryTextView = (TextView) findViewById(R.id.color_recommendations);
            orderSummaryTextView.setText(pickedColor);
        }


        }



