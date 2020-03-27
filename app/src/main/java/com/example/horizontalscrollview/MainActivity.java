package com.example.horizontalscrollview;


import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button button = findViewById(R.id.button1);

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    Toast.makeText(getApplicationContext(),
                            "Object1",
                            Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });*/

        ImageButton imageButton = findViewById(R.id.imageButton);


        imageButton.setImageResource(R.drawable.bobur1);

        imageButton.getBackground().setAlpha(0);
        imageButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Long Click",
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                return false;
            }
        });

    }
}