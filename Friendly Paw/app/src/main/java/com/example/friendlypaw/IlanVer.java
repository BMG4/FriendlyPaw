package com.example.friendlypaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.friendlypaw.Tablolar.Ilan;

import io.realm.Realm;

public class IlanVer extends AppCompatActivity {
    DrawerLayout drawerLayout;
    Realm realm;
    EditText ilanBaslik, ilanAciklama;
    ImageView image1, image2, image3, image4, image5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilan_ver);
        tanımla();


    }

    public void tanımla() {
        realm = Realm.getDefaultInstance();
        drawerLayout = findViewById(R.id.drawelayout);
        ilanBaslik = findViewById(R.id.ilanbaslık);
        ilanAciklama = findViewById(R.id.ilanIcerik);
        image1 = findViewById(R.id.imageYükle1);
        image2 = findViewById(R.id.imageYükle2);
        image3 = findViewById(R.id.imageYükle3);
        image4 = findViewById(R.id.imageYükle4);
        image5 = findViewById(R.id.imageYükle5);
    }

    public void ClickYayinla() {
        final String ilanAciklamast = ilanAciklama.getText().toString();
        final String ilanBaslikst = ilanBaslik.getText().toString();
        yaz(ilanBaslikst, ilanAciklamast);
        ilanBaslik.setText("");
        ilanAciklama.setText("");

    }

    public void yaz(final String ilanBaslik, final String ilanAciklama) {

        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                //primary key için otomatik arttırma
                Number maxId = realm.where(Ilan.class).max("ilanid");
                int nextId = (maxId == null) ? 1 : maxId.intValue() + 1;
                Ilan ilan = realm.createObject(Ilan.class);
                ilan.setIlanid(nextId);
                ilan.setBaslik(ilanBaslik);
                ilan.setAciklama(ilanAciklama);


            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Toast.makeText(getApplicationContext(), "basarılı", Toast.LENGTH_LONG).show();

            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Toast.makeText(getApplicationContext(), "basarısız", Toast.LENGTH_LONG).show();
            }
        });
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
        recreate();
    }

    public void Clickilanlarim(View view) {
        MainActivity.redirectActivity(this, Ilanlarim.class);
    }

    public void ClickHakkında(View view) {
        MainActivity.redirectActivity(this, Hakkinda.class);
    }

    public void ClickCikis(View view) {
        MainActivity.logout(this);
    }

}