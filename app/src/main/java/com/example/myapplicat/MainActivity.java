package com.example.myapplicat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EditText number1;
        EditText number2;
        Button Add_button;
        TextView result;
        // by ID we can use each component which id is assign in xml file
        number1= findViewById(R.id.editText_first_no);
        number2= findViewById(R.id.editText_second_no);
        Add_button= findViewById(R.id.add_button);
        result = findViewById(R.id.textView_answer);

        // Add_button add clicklistener
        Add_button.setOnClickListener(v -> {

            // num1 or num2 double type
            // get data which is in edittext, convert it to string
            // using parse Double convert it to Double type
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            // add both number and store it to sum
            double sum = num1 + num2;
            // set it ot result textview
            result.setText(Double.toString(sum));
        });
    }
}