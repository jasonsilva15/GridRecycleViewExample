package com.example.service_admin.gridrecycleviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private final Context context;
    List<Product> productList;

    public  RecyclerViewAdapter(Context context , List<Product> productList){
        this.context =context;
        this.productList=productList;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_layout,viewGroup, false);
       return  new ItemHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
      Product product = productList.get(i);
      viewHolder.itemView.setTag(product);
      ItemHolder holder = (ItemHolder)viewHolder ;

        holder.nombre.setText(product.nombre);
        holder.descripcion.setText(product.descripcion);
        holder.precio.setText(product.precio);
            }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static  class ItemHolder extends  RecyclerView.ViewHolder {
        TextView nombre;
        TextView descripcion;
        TextView precio;



        public  ItemHolder (@NonNull View itemView ){
            super(itemView);
           this.nombre= itemView.findViewById(R.id.nombre);
            this.descripcion= itemView.findViewById(R.id.Descripcion);
            this.precio= itemView.findViewById(R.id.precio);

        }

    }
}
