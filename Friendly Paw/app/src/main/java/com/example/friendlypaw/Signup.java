package com.example.friendlypaw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.friendlypaw.Tablolar.Üye;

import io.realm.Realm;
import io.realm.RealmResults;

public class Signup extends AppCompatActivity {
    Realm realm;
    TextView Name, Surname, Mail, Password, Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        tanımla();
    }

    public void tanımla() {
        realm = Realm.getDefaultInstance();
        Name = findViewById(R.id.sgnupName);
        Surname = findViewById(R.id.sgnupSurname);
        Mail = findViewById(R.id.sgnupMail);
        Password = findViewById(R.id.sngupPassword);
        Number = findViewById(R.id.sngupPassword);
    }

    public void ClickLogin(View view) {
        MainActivity.redirectActivity(this,Login.class);
    }

    public void ClickSgnupOk(View view) {
        final String nametxt = Name.getText().toString();
        final String surnametxt = Surname.getText().toString();
        final String mailtxt = Mail.getText().toString();
        final String passwordtxt = Password.getText().toString();
        final String numbertxt = Number.getText().toString();
        yaz(nametxt, surnametxt, mailtxt, passwordtxt, numbertxt);
        Name.setText("");
        Surname.setText("");
        Mail.setText("");
        Password.setText("");
        Number.setText("");

    }

    public void yaz(final String name, final String surname, final String mail, final String password, final String number) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                //primary key için otomatik arttırma
                Number maxId = realm.where(Üye.class).max("uyeid");
                int nextId = (maxId == null) ? 1 : maxId.intValue() + 1;
                Üye üye = realm.createObject(Üye.class);
                üye.setUyeIsim(name);
                üye.setUyeid(nextId);
                üye.setUyeSoyisim(surname);
                üye.setUyeMail(mail);
                üye.setUyeSifre(password);
                üye.setUyeTelNo(number);

            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Toast.makeText(getApplicationContext(), "Kaydınız Gerçekleşmiştir", Toast.LENGTH_LONG).show();
                goster();
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                Toast.makeText(getApplicationContext(), "Kaydınız Gerçekleşmemiştir", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void goster() {
        realm.beginTransaction();
        RealmResults<Üye> sonuc = realm.where(Üye.class).findAll();
        if (sonuc.size() > 0) {
            for (int i = sonuc.size(); i > 0; i--) {
                Log.i("cıkıs", sonuc.toString());
            }
        }
        realm.commitTransaction();

    }

}