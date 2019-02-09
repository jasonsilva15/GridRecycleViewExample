package com.example.service_admin.gridrecycleviewexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class Tab1Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     View view =inflater.inflate(R.layout.tab1_fragment,container,false);
     GridViewAdapter gridViewAdapter = new GridViewAdapter(view.getContext());
     gridViewAdapter.initialGrid();

     GridView gridView = view.findViewById(R.id.gridView);
     gridView.setAdapter (gridViewAdapter);

        return  view ;
    }
}
