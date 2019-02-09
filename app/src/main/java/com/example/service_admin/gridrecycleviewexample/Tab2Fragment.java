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

public class Tab2Fragment extends Fragment {

    List<Product> productList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.tab2_fragment,container,false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        productList.add(new Product("Ejemplo","Ejemplo desc","200"));
        productList.add(new Product("auto","corolla","500"));
        productList.add(new Product("demo","en proseso","100"));
        productList.add(new Product("baterias","El aguila","1500"));

        RecyclerViewAdapter adapter =new RecyclerViewAdapter(view.getContext(),productList);
        recyclerView.setAdapter(adapter);
        return  view ;
    }
}
