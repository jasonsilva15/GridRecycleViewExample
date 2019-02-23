package com.example.service_admin.gridrecycleviewexample;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TableLayout;
import android.widget.TextView;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {


    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        setViewPager(viewPager);

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);

        Realm realm = Realm.getDefaultInstance();
        final  Product product= new Product("Carro","Ford","20000");
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                realm.copyFromRealm(product);
            }
        });


    }

    public void setViewPager(ViewPager viewPager){
     TabsFragmentsAdpter adapter =new TabsFragmentsAdpter(getSupportFragmentManager());
     // los tabs
        adapter.addFragment(new Tab1Fragment(), "Grid View");
        adapter.addFragment(new Tab2Fragment(), "Recycler View");
        adapter.addFragment(new Tab3Fragment(), "Card View");
        viewPager.setAdapter(adapter);

    }

}
