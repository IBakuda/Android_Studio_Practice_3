package com.mirea.ivanovma.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String text = "Сообщение из первого activity \n" + intent.getStringExtra("key");

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(text);
    }
}