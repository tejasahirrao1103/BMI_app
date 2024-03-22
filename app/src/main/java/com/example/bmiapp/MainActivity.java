package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Hight= findViewById(R.id.edtHight);
        EditText Weight = findViewById(R.id.edtWeight);
        TextView txtOutput= findViewById(R.id.txtOutput);
        Button btnBmi = findViewById(R.id.btnBmi);

        btnBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String h = Hight.getText().toString();
                String w = Weight.getText().toString();

                double hig = Double.parseDouble(h);
                double weight = Double.parseDouble(w);
                double hight = hig/3.281;
                double bmi = weight/(hight*hight);

                if (bmi<18.5)
                {
                    txtOutput.setText(String.format("Your BMI is %.2f \nGain some.. You are Underweight",bmi));
                    txtOutput.setTextColor(Color.parseColor("#FFAA0505"));
                }
                else if (bmi>=18.5 && bmi<25)
                {
                    txtOutput.setText(String.format("Your BMI is %.2f \nYou are Normal",bmi));
                    txtOutput.setTextColor(Color.parseColor("#FF009E08"));
                }
                else if (bmi>=25 && bmi< 30)
                {
                    txtOutput.setText(String.format("Your BMI is %.2f \nohh.. YOU are Overweight",bmi));
                    txtOutput.setTextColor(Color.parseColor("#FFDCC600"));
                }
                 else
                {
                    txtOutput.setText(String.format("Your BMI is %.2f \nYou need to loos it.. You are Obesity",bmi));
                    txtOutput.setTextColor(Color.parseColor("#FFBD4C00"));
                }

            }
        });


    }
}