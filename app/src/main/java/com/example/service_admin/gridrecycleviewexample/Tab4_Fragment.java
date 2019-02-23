package com.example.service_admin.gridrecycleviewexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import io.realm.Realm;

public class Tab4_Fragment  extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.tab4_fragment,container,false);

        final Realm realm = Realm.getDefaultInstance();
        Button button = view.findViewById(R.id.bottonadd);
        final TextView name =view.findViewById(R.id.productname);
        final TextView desc =view.findViewById(R.id.productdesc);
        final TextView precio =view.findViewById(R.id.productprecio);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final Product product =new Product(name.getText().toString()
                ,desc.getText().toString()
                ,precio.getText().toString());

                realm.executeTransaction(new Realm.Transaction(){

                    @Override
                    public void execute(Realm realm) {
                        realm.copyToRealm(product);
                    }
                });
            }
        });
        return  view ;
    }



}
