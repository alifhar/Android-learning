package com.example.toshiba.lesson_2_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        nextActivity();
    }

    public void nextActivity() {
        TextView text = findViewById(R.id.textView);
        String data;
        if(getIntent().hasExtra("data")) {
            data = getIntent().getExtras().getString("data");
            text.setText(data);
        } else {
            text.setText("data tidak ada");
        }
    }
}
