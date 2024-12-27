package com.example.healthhub.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.healthhub.R;

public class bmi extends AppCompatActivity {

    EditText heightEditText, weightEditText;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        heightEditText = findViewById(R.id.heightEditText);
        weightEditText = findViewById(R.id.weightEditText);
        Button calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        try {
            double height = Double.parseDouble(heightEditText.getText().toString());
            double weight = Double.parseDouble(weightEditText.getText().toString());

            double bmi = calculateBMIValue(height, weight);
            String bmiText = String.format("%.2f", bmi);
            String result = "Your BMI is: " + bmiText;

            resultTextView.setText(result);

            // Redirect to OnBoardingActivity
            redirectToOnBoarding();
        } catch (NumberFormatException e) {
            resultTextView.setText("Please enter valid numeric values for height and weight.");
        }
    }

    private double calculateBMIValue(double height, double weight) {
        // Convert height from cm to meters
        double heightMeters = height / 100.0;

        // Calculate BMI
        return weight / (heightMeters * heightMeters);
    }

    private void redirectToOnBoarding() {
        Intent intent = new Intent(this, OnBoardingActivity.class); // Replace OnBoardingActivity with your actual class name
        startActivity(intent);
    }
}
