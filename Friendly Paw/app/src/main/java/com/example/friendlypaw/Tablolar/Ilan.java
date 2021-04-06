package com.example.friendlypaw.Tablolar;

import java.sql.Array;

import io.realm.RealmObject;

public class Ilan extends RealmObject {
    private int ilanID,uyeID,AdresID;
    private Array resimler;
    private String baslik,aciklama;

    public int getIlanID() {
        return ilanID;
    }

    public void setIlanID(int ilanID) {
        this.ilanID = ilanID;
    }

    public int getUyeID() {
        return uyeID;
    }

    public void setUyeID(int uyeID) {
        this.uyeID = uyeID;
    }

    public int getAdresID() {
        return AdresID;
    }

    public void setAdresID(int adresID) {
        AdresID = adresID;
    }

    public Array getResimler() {
        return resimler;
    }

    public void setResimler(Array resimler) {
        this.resimler = resimler;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "Ilan{" +
                "ilanID=" + ilanID +
                ", uyeID=" + uyeID +
                ", AdresID=" + AdresID +
                ", resimler=" + resimler +
                ", baslik='" + baslik + '\'' +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }
}
