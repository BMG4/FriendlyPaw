package com.example.friendlypaw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lst;
    List<model> liste;
    mesajAdapter adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanımla();
        doldur();
    }

    public void tanımla() {lst = findViewById(R.id.Listview);
    }

    public void doldur(){
        liste= new ArrayList<>();
        model n1=new model("Golden cinsi Köpek","Osman Çagrı Karekulak",R.drawable.ic_launcher_foreground);
        model n2=new model("Akıllı tekir kedi","Furkan Berk",R.drawable.ic_launcher_foreground);
        model n3=new model("Pug Çok güzel","Mehmet Emin ŞAHAN",R.drawable.ic_launcher_foreground);
        liste.add(n1);
        liste.add(n2);
        liste.add(n3);
        adp=new mesajAdapter(liste,this);
        lst.setAdapter(adp);
    }
}