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

    protected void findViewMethod() {
        mRedTextView = findViewById(R.id.RedtextView);
        mOrangeTextView = findViewById(R.id.OrangeTextView);
        mYellowTextView = findViewById(R.id.YellowTextView);
        mGreenTextView = findViewById(R.id.GreenTextView);
        mBlueTextView = findViewById(R.id.BlueTextView);
        mIndigoTextView = findViewById(R.id.IndigoTextView);
        mVioletTextView = findViewById(R.id.VioletTextView);
    }

    protected void setListeners() {

        mRedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRedTextView.setVisibility(View.INVISIBLE);
                mOrangeTextView.setTextColor(Color.RED);
                mYellowTextView.setTextColor(Color.RED);
                mGreenTextView.setTextColor(Color.RED);
                mBlueTextView.setTextColor(Color.RED);
                mIndigoTextView.setTextColor(Color.RED);
                mVioletTextView.setTextColor(Color.RED);

                mRedTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mGreenTextView.setTextColor(Color.BLACK);
                        mBlueTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);
            }
        });

        mOrangeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mOrangeTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.parseColor("#FF7417"));
                mYellowTextView.setTextColor(Color.parseColor("#FF7417"));
                mGreenTextView.setTextColor(Color.parseColor("#FF7417"));
                mBlueTextView.setTextColor(Color.parseColor("#FF7417"));
                mIndigoTextView.setTextColor(Color.parseColor("#FF7417"));
                mVioletTextView.setTextColor(Color.parseColor("#FF7417"));

                mOrangeTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mGreenTextView.setTextColor(Color.BLACK);
                        mBlueTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);
            }
        });

        mYellowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mYellowTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.YELLOW);
                mOrangeTextView.setTextColor(Color.YELLOW);
                mGreenTextView.setTextColor(Color.YELLOW);
                mBlueTextView.setTextColor(Color.YELLOW);
                mIndigoTextView.setTextColor(Color.YELLOW);
                mVioletTextView.setTextColor(Color.YELLOW);

                mYellowTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mGreenTextView.setTextColor(Color.BLACK);
                        mBlueTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);
            }
        });

        mGreenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGreenTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.GREEN);
                mOrangeTextView.setTextColor(Color.GREEN);
                mYellowTextView.setTextColor(Color.GREEN);
                mBlueTextView.setTextColor(Color.GREEN);
                mIndigoTextView.setTextColor(Color.GREEN);
                mVioletTextView.setTextColor(Color.GREEN);

                mGreenTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mBlueTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);

            }
        });

        mBlueTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBlueTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.BLUE);
                mOrangeTextView.setTextColor(Color.BLUE);
                mYellowTextView.setTextColor(Color.BLUE);
                mGreenTextView.setTextColor(Color.BLUE);
                mIndigoTextView.setTextColor(Color.BLUE);
                mVioletTextView.setTextColor(Color.BLUE);

                mBlueTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mGreenTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);
            }
        });

        mGreenTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGreenTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.GREEN);
                mOrangeTextView.setTextColor(Color.GREEN);
                mYellowTextView.setTextColor(Color.GREEN);
                mBlueTextView.setTextColor(Color.GREEN);
                mIndigoTextView.setTextColor(Color.GREEN);
                mVioletTextView.setTextColor(Color.GREEN);

                mGreenTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mBlueTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);

            }
        });

        mBlueTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBlueTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.BLUE);
                mOrangeTextView.setTextColor(Color.BLUE);
                mYellowTextView.setTextColor(Color.BLUE);
                mGreenTextView.setTextColor(Color.BLUE);
                mIndigoTextView.setTextColor(Color.BLUE);
                mVioletTextView.setTextColor(Color.BLUE);

                mBlueTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mGreenTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);
            }
        });

        mIndigoTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndigoTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.parseColor("#810288"));
                mOrangeTextView.setTextColor(Color.parseColor("#810288"));
                mYellowTextView.setTextColor(Color.parseColor("#810288"));
                mGreenTextView.setTextColor(Color.parseColor("#810288"));
                mBlueTextView.setTextColor(Color.parseColor("#810288"));
                mVioletTextView.setTextColor(Color.parseColor("#810288"));

                mIndigoTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mGreenTextView.setTextColor(Color.BLACK);
                        mBlueTextView.setTextColor(Color.BLACK);
                        mVioletTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);
            }
        });

        mVioletTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mVioletTextView.setVisibility(View.INVISIBLE);
                mRedTextView.setTextColor(Color.parseColor("#E81FD2"));
                mOrangeTextView.setTextColor(Color.parseColor("#E81FD2"));
                mYellowTextView.setTextColor(Color.parseColor("#E81FD2"));
                mGreenTextView.setTextColor(Color.parseColor("#E81FD2"));
                mBlueTextView.setTextColor(Color.parseColor("#E81FD2"));
                mVioletTextView.setTextColor(Color.parseColor("#E81FD2"));

                mVioletTextView.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRedTextView.setTextColor(Color.BLACK);
                        mOrangeTextView.setTextColor(Color.BLACK);
                        mYellowTextView.setTextColor(Color.BLACK);
                        mGreenTextView.setTextColor(Color.BLACK);
                        mBlueTextView.setTextColor(Color.BLACK);
                        mIndigoTextView.setTextColor(Color.BLACK);
                    }
                }, 5000);
            }
        });

    }
}