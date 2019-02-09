package com.example.service_admin.gridrecycleviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    private  final Context context;
    ArrayList<Integer> imageIds;

    public  GridViewAdapter (Context context) {
        this.context =context;
        imageIds = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return imageIds.size();
    }

    @Override
    public Object getItem(int position) {
        return imageIds.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null ){
            imageView =new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(8,8,8,8);

        } else {
            imageView = (ImageView) convertView;
        }

        Picasso.get().load(imageIds.get(position)).into(imageView);
        return imageView;

    }
    public  void initialGrid() {

        imageIds.add(R.mipmap.imag1 );
        imageIds.add(R.mipmap.imag2 );
        imageIds.add(R.mipmap.imag3 );

    }
}
