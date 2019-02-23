package com.example.service_admin.gridrecycleviewexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Tab3Fragment  extends Fragment {

    List<Product> productList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.tab3_fragment,container,false);

        RecyclerView cardList =view.findViewById(R.id.cardviewlist);
        cardList.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        cardList.setLayoutManager(layoutManager);

        productList.add( new Product("Celular" ,"",""));
        productList.add( new Product("Celular2" ,"",""));


        CardViewAdapter adapter = new CardViewAdapter(view.getContext(),productList);

        cardList.setAdapter(adapter);
        return  view ;
    }
}
