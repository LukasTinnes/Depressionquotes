package com.example.depressionquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        This is good coding practice for apps apparently
        String[] quotes = getResources().getStringArray(R.array.quotes);
        final TextView textview = findViewById(R.id.text_id);

        Random rand = new Random();
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = rand.nextInt(quotes.length);
                textview.setText(quotes[number]);
            }
        });
        textview.setText(quotes[0]);
    }
}