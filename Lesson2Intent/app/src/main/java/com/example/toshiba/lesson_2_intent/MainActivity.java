package com.example.toshiba.lesson_2_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToNextActivity(View v) {
        EditText text = findViewById(R.id.editText);
        Intent intent = new Intent(getApplicationContext(), NextActivity.class);
        intent.putExtra("data", text.getText() + "");
        startActivity(intent);
    }
}
