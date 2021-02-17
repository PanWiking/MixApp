package com.example.mixapp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mixapp.R;
import com.example.mixapp.kotlin.KotlinFile;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.print_value);
        button = findViewById(R.id.ask_kotlin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KotlinFile kotlinFile = new KotlinFile();
                kotlinFile.countNumbers(textView);
            }
        });
    }
}