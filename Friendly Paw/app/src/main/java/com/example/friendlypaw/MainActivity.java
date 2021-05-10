package com.example.friendlypaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.friendlypaw.Eklentiler.ilanAdapter;
import com.example.friendlypaw.Eklentiler.model;
import com.example.friendlypaw.Tablolar.Ilan;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm realm;
    ListView listView;
    List<model> liste;
    ilanAdapter adp;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımla();
        //doldur();
    }

    public void tanımla() {
        realm = Realm.getDefaultInstance();
        listView = findViewById(R.id.Listview);
        drawerLayout = findViewById(R.id.drawelayout);
    }

    public void ClickMenu(View view) {
        openDrawer(drawerLayout);
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void ClickHome(View view) {
        recreate();
    }

    public void ClickProfil(View view) {
        redirectActivity(this, Login.class);
    }

    public void ClickilanVer(View view) {
        redirectActivity(this, IlanVer.class);
    }

    public void Clickilanlarim(View view) {
        redirectActivity(this, Ilanlarim.class);
    }

    public void ClickHakkında(View view) {
        redirectActivity(this, Hakkinda.class);
    }

    public void ClickCikis(View view) {
        logout(this);
    }

    public static void logout(Activity activity) {
        activity.finishAffinity();
        System.exit(0);
    }

    public static void redirectActivity(Activity activity, Class aClass) {
        Intent intent = new Intent(activity, aClass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);

    }


    public void doldur() {
        realm.beginTransaction();
        RealmResults<Ilan> sonuc = realm.where(Ilan.class).findAll();
        List<model> list;
        if (sonuc.size()>0){
            ilanAdapter ilanAdapter = new ilanAdapter(sonuc,getApplicationContext());
            listView.setAdapter(ilanAdapter);
        }
        realm.commitTransaction();
/*
        liste = new ArrayList<>();
        model n1 = new model("Golden cinsi Köpek", "Osman Çagrı Karekulak", R.drawable.ic_launcher_foreground);
        model n2 = new model("Akıllı tekir kedi", "Furkan Berk", R.drawable.ic_launcher_foreground);
        model n3 = new model("Pug Çok güzel", "Mehmet Emin ŞAHAN", R.drawable.ic_launcher_foreground);
        liste.add(n1);
        liste.add(n2);
        liste.add(n3);
        adp = new ilanAdapter(liste, this);
        lst.setAdapter(adp);*/
    }
}