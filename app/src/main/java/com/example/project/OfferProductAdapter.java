package com.example.project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

public class OfferProductAdapter extends RecyclerView.Adapter<OfferProductAdapter.OfferProductViewHolder>{

    @NonNull
    @Override
    public OfferProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.offers_products_item_list,parent,false);
        return new OfferProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OfferProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class OfferProductViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView tvOfferPercent;
        MaterialCardView cardParent;

        public OfferProductViewHolder(@NonNull View itemView) {
            super(itemView);
            image= itemView.findViewById(R.id.iv_offer_product);
            tvOfferPercent = itemView.findViewById(R.id.tv_percent_off);
            cardParent = itemView.findViewById(R.id.cv_offer_product);
        }
    }
}
