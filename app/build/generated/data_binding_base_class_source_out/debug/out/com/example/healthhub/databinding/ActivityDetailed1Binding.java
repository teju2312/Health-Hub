// Generated by view binder compiler. Do not edit!
package com.example.healthhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.healthhub.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailed1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardview;

  @NonNull
  public final TextView detailedBmi;

  @NonNull
  public final TextView detailedDesc;

  @NonNull
  public final ImageView detailedImg;

  @NonNull
  public final TextView detailedName;

  @NonNull
  public final RatingBar myRating;

  @NonNull
  public final TextView rating;

  private ActivityDetailed1Binding(@NonNull ConstraintLayout rootView, @NonNull CardView cardview,
      @NonNull TextView detailedBmi, @NonNull TextView detailedDesc, @NonNull ImageView detailedImg,
      @NonNull TextView detailedName, @NonNull RatingBar myRating, @NonNull TextView rating) {
    this.rootView = rootView;
    this.cardview = cardview;
    this.detailedBmi = detailedBmi;
    this.detailedDesc = detailedDesc;
    this.detailedImg = detailedImg;
    this.detailedName = detailedName;
    this.myRating = myRating;
    this.rating = rating;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailed1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailed1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detailed1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailed1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardview;
      CardView cardview = ViewBindings.findChildViewById(rootView, id);
      if (cardview == null) {
        break missingId;
      }

      id = R.id.detailed_Bmi;
      TextView detailedBmi = ViewBindings.findChildViewById(rootView, id);
      if (detailedBmi == null) {
        break missingId;
      }

      id = R.id.detailed_desc;
      TextView detailedDesc = ViewBindings.findChildViewById(rootView, id);
      if (detailedDesc == null) {
        break missingId;
      }

      id = R.id.detailed_img;
      ImageView detailedImg = ViewBindings.findChildViewById(rootView, id);
      if (detailedImg == null) {
        break missingId;
      }

      id = R.id.detailed_name;
      TextView detailedName = ViewBindings.findChildViewById(rootView, id);
      if (detailedName == null) {
        break missingId;
      }

      id = R.id.my_rating;
      RatingBar myRating = ViewBindings.findChildViewById(rootView, id);
      if (myRating == null) {
        break missingId;
      }

      id = R.id.rating;
      TextView rating = ViewBindings.findChildViewById(rootView, id);
      if (rating == null) {
        break missingId;
      }

      return new ActivityDetailed1Binding((ConstraintLayout) rootView, cardview, detailedBmi,
          detailedDesc, detailedImg, detailedName, myRating, rating);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}