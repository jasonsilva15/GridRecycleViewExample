package com.example.service_admin.gridrecycleviewexample;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

import java.util.regex.Pattern;

import io.realm.Realm;
import okhttp3.internal.http.RealInterceptorChain;

public class StethoRealm extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        Stetho.initialize( Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(RealmInspectorModulesProvider.builder(this)
                        .databaseNamePattern(Pattern.compile(".+\\.realm"))
                        .withLimit(10000)// cantidad de datos
                        .build())
                .build());
    }
}
