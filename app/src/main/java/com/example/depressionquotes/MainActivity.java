package com.example.depressionquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        This is good coding practice for apps apparently
        String[] quotes = getResources().getStringArray(R.array.quotes);
        final TextView textview = findViewById(R.id.text_id);
        textview.setText(quotes[0]);
    }
}