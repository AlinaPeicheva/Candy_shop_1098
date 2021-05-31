package com.peicheva.candy_shop_1098;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class OnBoardingActivity  extends AppCompatActivity{

    Button btn_start;

    View.OnClickListener onClickListener;
    ViewFlipper viewFlipper;

    Button buttonNextScr1;
    Button buttonPreviousScr2;
    Button buttonNextScr2;
    Button buttonPreviousScr3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(view -> startActivity(new Intent(OnBoardingActivity.this, LoginActivity.class)));

        onClickListener = new ClickListener();

        viewFlipper = findViewById(R.id.view_flipper);

        buttonNextScr1 = findViewById(R.id.btn_next_scr1);
        buttonNextScr2 = findViewById(R.id.btn_next_scr2);
        buttonPreviousScr2 = findViewById(R.id.btn_previous_scr2);
        buttonPreviousScr3 = findViewById(R.id.btn_previous_scr3);

        buttonNextScr1.setOnClickListener(onClickListener);
        buttonPreviousScr2.setOnClickListener(onClickListener);
        buttonNextScr2.setOnClickListener(onClickListener);
        buttonPreviousScr3.setOnClickListener(onClickListener);
    }

    private void showPreviousScreen() {
        if (!isFirst()) {
            viewFlipper.showPrevious();
        }
    }

    private boolean isFirst() {
        return viewFlipper.getDisplayedChild() == 0;
    }

    private void showNextScreen() {
        if (!isLast()) {
            viewFlipper.showNext();
        }
    }

    private boolean isLast() {
        return viewFlipper.getDisplayedChild() + 1 == viewFlipper.getChildCount();
    }

    private class ClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_next_scr1) {
                showNextScreen();
            } else if (id == R.id.btn_previous_scr2) {
                showPreviousScreen();
            } else if (id == R.id.btn_next_scr2) {
                showNextScreen();
            } else if (id == R.id.btn_previous_scr3) {
                showPreviousScreen();
            }
        }
    }
}