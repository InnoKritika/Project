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

public class HomeFragment extends Fragment {
    RecyclerView rvOfferProducts, rvProducts;
    OfferProductAdapter offerProductAdapter;
    ProductAdapter productAdapter;
    Data data = new Data();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        rvOfferProducts = view.findViewById(R.id.rv_offer_products);
        rvProducts = view.findViewById(R.id.rv_product_list);
        initRVOfferProducts();


        offerProductAdapter = new OfferProductAdapter(data.offerList,getActivity());
        rvOfferProducts.setAdapter(offerProductAdapter);
        rvOfferProducts.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));


        productAdapter = new ProductAdapter(getActivity(),data.productList);
        rvProducts.setAdapter(productAdapter);
        rvProducts.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));



        return view;

    }
    private void initProductsData(){
        data.productList.add(new Product(1,"Soap",R.drawable.soap,200));
        data.productList.add(new Product(1,"Soap",R.drawable.soap,200));
        data.productList.add(new Product(1,"Soap",R.drawable.soap,200));
        data.productList.add(new Product(1,"Soap",R.drawable.soap,200));

    }

    private void initRVOfferProducts() {

        data.offerList.add(new OfferProduct(R.drawable.product,"20% Off"));
        data.offerList.add(new OfferProduct(R.drawable.product,"20% Off"));
        data.offerList.add(new OfferProduct(R.drawable.product,"20% Off"));
        data.offerList.add(new OfferProduct(R.drawable.product,"20% Off"));
        data.offerList.add(new OfferProduct(R.drawable.product,"20% Off"));
        data.offerList.add(new OfferProduct(R.drawable.product,"20% Off"));



    }



}
