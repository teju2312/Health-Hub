package com.example.healthhub.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.healthhub.R;
import com.example.healthhub.activities.DetailedActivity;
import com.example.healthhub.activities.DetailedActivity1;
import com.example.healthhub.models.VegModel;

import java.util.List;

public class VegAdapter extends RecyclerView.Adapter<VegAdapter.ViewHolder> {

    private Context context;
    private List<VegModel> vegModelList;

    public VegAdapter(Context context, List<VegModel> vegModelList) {
        this.context = context;
        this.vegModelList = vegModelList;
    }

    @NonNull
    @Override
    public VegAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_veg_recipe, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VegAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(vegModelList.get(position).getImg_url()).into(holder.imageView);
        holder.name.setText(vegModelList.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailedActivity1.class);
                intent.putExtra("detailed", vegModelList.get(position)); // Use "detailed" key
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return vegModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name, price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.new_img);
            name = itemView.findViewById(R.id.new_product_name);
            price = itemView.findViewById(R.id.new_price);
        }
    }
}
