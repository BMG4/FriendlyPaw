package com.example.friendlypaw.Tablolar;

import io.realm.RealmObject;

public class Adres extends RealmObject {
    private int adresID, uyeID;
    private String AdresBaslik, il, ilce, sokak, mahalle, aciklama;

    public int getAdresID() {
        return adresID;
    }

    public void setAdresID(int adresID) {
        this.adresID = adresID;
    }

    public int getUyeID() {
        return uyeID;
    }

    public void setUyeID(int uyeID) {
        this.uyeID = uyeID;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getAdresBaslik() {
        return AdresBaslik;
    }

    public void setAdresBaslik(String adresBaslik) {
        AdresBaslik = adresBaslik;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "adresID=" + adresID +
                ", uyeID=" + uyeID +
                ", AdresBaslik='" + AdresBaslik + '\'' +
                ", il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", sokak='" + sokak + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", aciklama='" + aciklama + '\'' +
                '}';
    }
}
