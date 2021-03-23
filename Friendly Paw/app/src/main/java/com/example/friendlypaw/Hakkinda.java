package com.example.friendlypaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Hakkinda extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkinda);
        tanımla();
    }

    public void tanımla() {
        drawerLayout = findViewById(R.id.drawelayout);
    }

    public void ClickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickProfil(View view) {
        MainActivity.redirectActivity(this, Profil.class);
    }

    public void ClickilanVer(View view) {
        MainActivity.redirectActivity(this, IlanVer.class);
    }

    public void Clickilanlarim(View view) {
        MainActivity.redirectActivity(this, Ilanlarim.class);
    }

    public void ClickHakkında(View view) {
        recreate();
    }

    public void ClickCikis(View view) {
        MainActivity.logout(this);
    }
}