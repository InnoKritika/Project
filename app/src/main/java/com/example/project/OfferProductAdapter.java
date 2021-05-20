package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class OfferProductAdapter extends RecyclerView.Adapter<OfferProductAdapter.OfferProductViewHolder>{
    ArrayList<OfferProduct> arrayList ;
    Context context;

    public OfferProductAdapter(ArrayList<OfferProduct> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public OfferProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.offers_products_item_list,parent,false);
        return new OfferProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OfferProductViewHolder holder, int position) {
        OfferProduct offerProducts =arrayList.get(position);
        holder.tvOfferPercent.setText(offerProducts.getOfferPercent());
        Picasso.get().load(offerProducts.getImageUrl()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
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
