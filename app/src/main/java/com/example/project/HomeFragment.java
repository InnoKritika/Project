package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView rvOfferProducts;
    ArrayList<OfferProduct> offerProducts;
    OfferProductAdapter offerProductAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        rvOfferProducts = view.findViewById(R.id.rv_offer_products);
        initRVOfferProducts();
        return view;

    }

    private void initRVOfferProducts() {
        offerProducts = new ArrayList<>();
        offerProducts.add(new OfferProduct(R.drawable.product,"10% Off"));
        offerProducts.add(new OfferProduct(R.drawable.product,"10% Off"));
        offerProducts.add(new OfferProduct(R.drawable.product,"10% Off"));
        offerProducts.add(new OfferProduct(R.drawable.product,"10% Off"));
        offerProducts.add(new OfferProduct(R.drawable.product,"10% Off"));
        offerProducts.add(new OfferProduct(R.drawable.product,"10% Off"));

        offerProductAdapter = new OfferProductAdapter(offerProducts,getActivity());
        rvOfferProducts.setAdapter(offerProductAdapter);
        rvOfferProducts.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
    }



}
