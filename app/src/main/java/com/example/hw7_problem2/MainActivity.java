package com.example.hw7_problem2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mRedTextView;
    TextView mOrangeTextView;
    TextView mYellowTextView;
    TextView mGreenTextView;
    TextView mBlueTextView;
    TextView mIndigoTextView;
    TextView mVioletTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewMethod();
        setListeners();


    }

    protected void findViewMethod(){
        mRedTextView = findViewById(R.id.RedtextView);
        mOrangeTextView = findViewById(R.id.OrangeTextView);
        mYellowTextView = findViewById(R.id.YellowTextView);
        mGreenTextView = findViewById(R.id.GreenTextView);
        mBlueTextView = findViewById(R.id.BlueTextView);
        mIndigoTextView = findViewById(R.id.IndigoTextView);
        mVioletTextView = findViewById(R.id.VioletTextView);
    }

    protected void setListeners(){

        mRedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRedTextView.setVisibility(View.INVISIBLE);
                
            }
        });

        mOrangeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mOrangeTextView.setVisibility(View.INVISIBLE);
            }
        });

        mYellowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYellowTextView.setVisibility(View.INVISIBLE);
            }
        });

        mGreenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGreenTextView.setVisibility(View.INVISIBLE);
            }
        });

        mBlueTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBlueTextView.setVisibility(View.INVISIBLE);
            }
        });

        mGreenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGreenTextView.setVisibility(View.INVISIBLE);
            }
        });

        mBlueTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBlueTextView.setVisibility(View.INVISIBLE);
            }
        });

        mIndigoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndigoTextView.setVisibility(View.INVISIBLE);
            }
        });

        mVioletTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mVioletTextView.setVisibility(View.INVISIBLE);
            }
        });

    }
}