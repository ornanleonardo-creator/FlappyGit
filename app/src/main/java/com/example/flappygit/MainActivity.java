package com.example.flappygit;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setTextSize(32);
        tv.setText("🐦 FlappyGit\n\nTap to score");
        tv.setGravity(android.view.Gravity.CENTER);

        tv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                score++;
                tv.setText("🐦 FlappyGit\n\nScore : " + score);
                return true;
            }
        });

        setContentView(tv);
    }
}
