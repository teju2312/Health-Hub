package com.example.healthhub.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.healthhub.R;
import com.example.healthhub.models.NewproductsModel;
import com.example.healthhub.models.PopularProductsModel;
import com.example.healthhub.models.VegModel;
import com.google.firebase.firestore.FirebaseFirestore;

public class DetailedActivity extends AppCompatActivity {

    ImageView detailedImg;
    TextView rating,name,description,price;

    Button addToCart,buyNow;

    ImageView addItems,removeItems;

    private FirebaseFirestore firestore;
    NewproductsModel newproductsModel = null;

    PopularProductsModel popularProductsModel = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        firestore = FirebaseFirestore.getInstance();

        final Object obj = getIntent().getSerializableExtra("detailed");

        if (obj instanceof NewproductsModel){
                newproductsModel = (NewproductsModel) obj;
        } else if (obj instanceof PopularProductsModel) {
            popularProductsModel = (PopularProductsModel) obj;
        } else if (obj instanceof VegModel) {
            VegModel vegObj = (VegModel) obj;

        }

        detailedImg = findViewById(R.id.detailed_img);
        name = findViewById(R.id.detailed_name);
        rating = findViewById(R.id.rating);
        description = findViewById(R.id.detailed_desc);
        price = findViewById(R.id.detailed_price);

        addToCart = findViewById(R.id.add_to_cart);
        buyNow = findViewById(R.id.buy_now);

        addItems = findViewById(R.id.add_item);
        removeItems = findViewById(R.id.remove_item);

        if (newproductsModel != null){
            Glide.with(getApplicationContext()).load(newproductsModel.getImg_url()).into(detailedImg);
            name.setText(newproductsModel.getName());
            rating.setText(newproductsModel.getRating());
            description.setText(newproductsModel.getDescription());
            price.setText(String.valueOf(newproductsModel.getPrice()));
            name.setText(newproductsModel.getName());

        }

        //popular products
        if (popularProductsModel != null){
            Glide.with(getApplicationContext()).load(popularProductsModel.getImg_url()).into(detailedImg);
            name.setText(popularProductsModel.getName());
            rating.setText(popularProductsModel.getRating());
            description.setText(popularProductsModel.getDescription());
            price.setText(String.valueOf(popularProductsModel.getPrice()));
            name.setText(popularProductsModel.getName());

        }





    }
}