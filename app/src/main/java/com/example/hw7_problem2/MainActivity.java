package com.example.hw7_problem2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String BUNDLE_IS_CLICKED = "BUndleIsClicked";
    TextView[] mTextViews = new TextView[7];
    int[] mColor = new int[]{R.color.Red, R.color.Orange, R.color.Yellow, R.color.Green,
            R.color.Blue, R.color.Indigo, R.color.Violet};
    boolean[] mIsClicked = new boolean[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewMethod();
        setListeners();

        if (savedInstanceState!=null){
            mIsClicked = savedInstanceState.getBooleanArray(BUNDLE_IS_CLICKED);
            for (int i = 0; i < 7 ; i++) {
                if (mIsClicked[i]){
                    mTextViews[i].setVisibility(View.INVISIBLE);
                }
            }
        }

    }

    protected void findViewMethod() {

        mTextViews = new TextView[]{findViewById(R.id.RedtextView),
                findViewById(R.id.OrangeTextView), findViewById(R.id.YellowTextView) ,
                findViewById(R.id.GreenTextView), findViewById(R.id.BlueTextView) ,
                findViewById(R.id.IndigoTextView), findViewById(R.id.VioletTextView)};

    }

    protected void setListeners() {

        for (int i = 0; i < 7 ; i++) {
            final int finalI = i;
            mTextViews[finalI].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mIsClicked[finalI] = true;

                    for (int j = 0; j < 7 ; j++) {
                        if (j==finalI){
                            mTextViews[j].setVisibility(View.INVISIBLE);
                        } else{
                            mTextViews[j].setTextColor(getResources().getColor(mColor[finalI]));
                        }
                    }

                    mTextViews[finalI].postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            for (int j = 0; j < 7 ; j++) {
                                if (j!=finalI){
                                    mTextViews[j].setTextColor(Color.BLACK);
                                }
                            }
                        }
                    }, 5000);
                }
            });
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBooleanArray(BUNDLE_IS_CLICKED, mIsClicked);
    }
}