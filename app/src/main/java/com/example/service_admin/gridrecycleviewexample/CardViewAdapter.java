package com.example.service_admin.gridrecycleviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout,viewGroup,false);
        return  new CardHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
     Product product = productList.get(i);
     viewHolder.itemView.setTag(product);
     CardHolder holder =(CardHolder)viewHolder;
     holder.textView.setText(product.nombre);
     holder.imageView.setImageResource(R.mipmap.imag2);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


    private class CardHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public  CardHolder (View v) {
            super(v);

            textView = v.findViewById(R.id.cardviewtext);
            imageView=v.findViewById(R.id.carviewimg);
        }

    }

}




