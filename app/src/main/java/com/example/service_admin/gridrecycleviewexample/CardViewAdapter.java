package com.example.service_admin.gridrecycleviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class CardViewAdapter extends  RecyclerView.Adapter {

    private final Context context;
    List<Product> productList;

    public CardViewAdapter(Context context, List<Product> productList) {

        this.context = context;
               this.productList=productList;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
