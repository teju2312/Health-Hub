package com.example.healthhub.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.healthhub.R;
import com.example.healthhub.models.VegModel;
import com.google.firebase.firestore.FirebaseFirestore;

public class DetailedActivity1 extends AppCompatActivity {

    ImageView detailedImg;
    TextView rating, name, description, bmi;

    private FirebaseFirestore firestore;
    VegModel vegModel = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed1);

        firestore = FirebaseFirestore.getInstance();

        detailedImg = findViewById(R.id.detailed_img);
        name = findViewById(R.id.detailed_name);
        rating = findViewById(R.id.rating);
        description = findViewById(R.id.detailed_desc);
        bmi = findViewById(R.id.detailed_Bmi);

        final Object obj = getIntent().getSerializableExtra("detailed");

        if (obj instanceof VegModel) {
            vegModel = (VegModel) obj;
        }

        // Load data for VegModel if it's not null
        if (vegModel != null) {
            Glide.with(getApplicationContext()).load(vegModel.getImg_url()).into(detailedImg);
            name.setText(vegModel.getName());
            rating.setText(vegModel.getRating());
            description.setText(vegModel.getDescription());

            // Assuming getPrice() represents BMI, change as necessary
            bmi.setText(String.valueOf(vegModel.getBmi())); // Update if getPrice() is not BMI
        }

        // ... (rest of the code)
    }
}
