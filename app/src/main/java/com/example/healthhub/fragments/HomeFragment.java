package com.example.healthhub.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.healthhub.R;
import com.example.healthhub.adapters.CategoryAdapter;
import com.example.healthhub.adapters.NewProductsAdapter;
import com.example.healthhub.adapters.PopularProductsAdapter;
import com.example.healthhub.adapters.VegAdapter;
import com.example.healthhub.models.CategoryModel;
import com.example.healthhub.models.NewproductsModel;
import com.example.healthhub.models.PopularProductsModel;
import com.example.healthhub.models.VegModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    LinearLayout linearLayout;
    ProgressDialog progressDialog;
    RecyclerView catRecyclerview,newProductRecyclerview,popularRecyclerview,VegRecipeview;

    //category recyclerView
    CategoryAdapter categoryAdapter;
    List<CategoryModel> categoryModelList;

    //new Product Recyclerview
        NewProductsAdapter newProductsAdapter;
        List<NewproductsModel> newProductsModelList;

    //Popular produtcs

        PopularProductsAdapter popularProductsAdapter;
        List<PopularProductsModel> popularProductsModelList;

        //Veg recipe

        VegAdapter vegAdapter;
        List<VegModel> vegModelList;

    //firestore
    FirebaseFirestore db ;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        progressDialog = new ProgressDialog(getActivity());
        catRecyclerview = root.findViewById(R.id.rec_category);
        newProductRecyclerview = root.findViewById(R.id.new_product_rec);
        popularRecyclerview = root.findViewById(R.id.popular_rec);
        VegRecipeview = root.findViewById(R.id.veg_rec);

        db = FirebaseFirestore.getInstance();

        linearLayout = root.findViewById(R.id.home_layout);
        linearLayout.setVisibility(View.GONE);

        //Image slider

        ImageSlider imageSlider = root.findViewById(R.id.image_slider);
        List<SlideModel> slideModels = new ArrayList<>();

         slideModels.add(new SlideModel(R.drawable.banner1,"Discount on shoes", ScaleTypes.CENTER_CROP) );
        slideModels.add(new SlideModel(R.drawable.banner2,"Get Fit Now!", ScaleTypes.CENTER_CROP) );
        slideModels.add(new SlideModel(R.drawable.banner3,"70% off", ScaleTypes.CENTER_CROP) );

        imageSlider.setImageList(slideModels);

        progressDialog.setTitle("Welcome To Health Hub");
        progressDialog.setMessage("please wait.....");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();


        //Category

        catRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        categoryModelList = new ArrayList<>();
        categoryAdapter = new CategoryAdapter(getContext(),categoryModelList);
        catRecyclerview.setAdapter(categoryAdapter);

        db.collection("Category")
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        for (QueryDocumentSnapshot document : task.getResult()) {

                            CategoryModel categoryModel = document.toObject(CategoryModel.class);
                            categoryModelList.add(categoryModel);
                            categoryAdapter.notifyDataSetChanged();
                            linearLayout.setVisibility(View.VISIBLE);
                            progressDialog.dismiss();

                        }
                    } else {
                        Toast.makeText(getActivity(), ""+task.getException(), Toast.LENGTH_SHORT).show();
                    }
                });

        //New Product
        newProductRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        newProductsModelList = new ArrayList<>();
        newProductsAdapter = new NewProductsAdapter(getContext(),newProductsModelList);
        newProductRecyclerview.setAdapter(newProductsAdapter);

        db.collection("NewProducts")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                NewproductsModel newproductsModel = document.toObject(NewproductsModel.class);
                                newProductsModelList.add(newproductsModel);
                                newProductsAdapter.notifyDataSetChanged();

                            }
                        } else {
                            Toast.makeText(getActivity(), ""+task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        //popular products

        popularRecyclerview.setLayoutManager(new GridLayoutManager(getActivity(),2));
        popularProductsModelList = new ArrayList<>();
        popularProductsAdapter = new PopularProductsAdapter(getContext(),popularProductsModelList);
        popularRecyclerview.setAdapter(popularProductsAdapter);

        db.collection("AllProducts")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                                PopularProductsModel popularProductsModel = document.toObject(PopularProductsModel.class);
                                popularProductsModelList.add(popularProductsModel);
                                popularProductsAdapter.notifyDataSetChanged();

                            }
                        } else {
                            Toast.makeText(getActivity(), ""+task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });


        //vegrec
        // Assuming this code is within a Fragment or Activity

// Setting up RecyclerView, LayoutManager, Adapter
        VegRecipeview.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        vegModelList = new ArrayList<>();
        vegAdapter = new VegAdapter(getContext(), vegModelList);
        VegRecipeview.setAdapter(vegAdapter);

// Retrieving data from Firestore
        db.collection("AllProducts1")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                VegModel vegModel = document.toObject(VegModel.class);
                                vegModelList.add(vegModel); // Adding each VegModel to the list
                            }
                            vegAdapter.notifyDataSetChanged(); // Notifying adapter after adding all items
                        } else {
                            Toast.makeText(getActivity(), "" + task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        ;

        return  root;
    }
}