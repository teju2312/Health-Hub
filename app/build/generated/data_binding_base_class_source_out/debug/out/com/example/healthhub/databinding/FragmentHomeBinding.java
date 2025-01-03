// Generated by view binder compiler. Do not edit!
package com.example.healthhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.denzcoskun.imageslider.ImageSlider;
import com.example.healthhub.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView categorySeeAll;

  @NonNull
  public final LinearLayout homeLayout;

  @NonNull
  public final ImageSlider imageSlider;

  @NonNull
  public final TextView newProductName;

  @NonNull
  public final RecyclerView newProductRec;

  @NonNull
  public final TextView newProductsSeeAll;

  @NonNull
  public final TextView popularProducts;

  @NonNull
  public final RecyclerView popularRec;

  @NonNull
  public final TextView popularSeeAll;

  @NonNull
  public final RecyclerView recCategory;

  @NonNull
  public final RecyclerView vegRec;

  @NonNull
  public final TextView vegRecipe;

  @NonNull
  public final TextView vegSeeAll;

  private FragmentHomeBinding(@NonNull NestedScrollView rootView, @NonNull TextView categorySeeAll,
      @NonNull LinearLayout homeLayout, @NonNull ImageSlider imageSlider,
      @NonNull TextView newProductName, @NonNull RecyclerView newProductRec,
      @NonNull TextView newProductsSeeAll, @NonNull TextView popularProducts,
      @NonNull RecyclerView popularRec, @NonNull TextView popularSeeAll,
      @NonNull RecyclerView recCategory, @NonNull RecyclerView vegRec, @NonNull TextView vegRecipe,
      @NonNull TextView vegSeeAll) {
    this.rootView = rootView;
    this.categorySeeAll = categorySeeAll;
    this.homeLayout = homeLayout;
    this.imageSlider = imageSlider;
    this.newProductName = newProductName;
    this.newProductRec = newProductRec;
    this.newProductsSeeAll = newProductsSeeAll;
    this.popularProducts = popularProducts;
    this.popularRec = popularRec;
    this.popularSeeAll = popularSeeAll;
    this.recCategory = recCategory;
    this.vegRec = vegRec;
    this.vegRecipe = vegRecipe;
    this.vegSeeAll = vegSeeAll;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.category_see_all;
      TextView categorySeeAll = ViewBindings.findChildViewById(rootView, id);
      if (categorySeeAll == null) {
        break missingId;
      }

      id = R.id.home_layout;
      LinearLayout homeLayout = ViewBindings.findChildViewById(rootView, id);
      if (homeLayout == null) {
        break missingId;
      }

      id = R.id.image_slider;
      ImageSlider imageSlider = ViewBindings.findChildViewById(rootView, id);
      if (imageSlider == null) {
        break missingId;
      }

      id = R.id.new_product_name;
      TextView newProductName = ViewBindings.findChildViewById(rootView, id);
      if (newProductName == null) {
        break missingId;
      }

      id = R.id.new_product_rec;
      RecyclerView newProductRec = ViewBindings.findChildViewById(rootView, id);
      if (newProductRec == null) {
        break missingId;
      }

      id = R.id.newProducts_see_all;
      TextView newProductsSeeAll = ViewBindings.findChildViewById(rootView, id);
      if (newProductsSeeAll == null) {
        break missingId;
      }

      id = R.id.popular_products;
      TextView popularProducts = ViewBindings.findChildViewById(rootView, id);
      if (popularProducts == null) {
        break missingId;
      }

      id = R.id.popular_rec;
      RecyclerView popularRec = ViewBindings.findChildViewById(rootView, id);
      if (popularRec == null) {
        break missingId;
      }

      id = R.id.popular_see_all;
      TextView popularSeeAll = ViewBindings.findChildViewById(rootView, id);
      if (popularSeeAll == null) {
        break missingId;
      }

      id = R.id.rec_category;
      RecyclerView recCategory = ViewBindings.findChildViewById(rootView, id);
      if (recCategory == null) {
        break missingId;
      }

      id = R.id.veg_rec;
      RecyclerView vegRec = ViewBindings.findChildViewById(rootView, id);
      if (vegRec == null) {
        break missingId;
      }

      id = R.id.veg_recipe;
      TextView vegRecipe = ViewBindings.findChildViewById(rootView, id);
      if (vegRecipe == null) {
        break missingId;
      }

      id = R.id.veg_see_all;
      TextView vegSeeAll = ViewBindings.findChildViewById(rootView, id);
      if (vegSeeAll == null) {
        break missingId;
      }

      return new FragmentHomeBinding((NestedScrollView) rootView, categorySeeAll, homeLayout,
          imageSlider, newProductName, newProductRec, newProductsSeeAll, popularProducts,
          popularRec, popularSeeAll, recCategory, vegRec, vegRecipe, vegSeeAll);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
