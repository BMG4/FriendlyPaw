package com.example.friendlypaw.Tablolar;

import io.realm.RealmObject;

public class Ilan extends RealmObject {
    int ilanid,uyeid,adresid;
   String Baslik,Aciklama,Resimler;

    public String getResimler() {
        return Resimler;
    }

    public void setResimler(String resimler) {
        Resimler = resimler;
    }

    public int getIlanid() {
        return ilanid;
    }

    public void setIlanid(int ilanid) {
        this.ilanid = ilanid;
    }

    public int getUyeid() {
        return uyeid;
    }

    public void setUyeid(int uyeid) {
        this.uyeid = uyeid;
    }

    public int getAdresid() {
        return adresid;
    }

    public void setAdresid(int adresid) {
        this.adresid = adresid;
    }


    public String getBaslik() {
        return Baslik;
    }

    public void setBaslik(String baslik) {
        Baslik = baslik;
    }

    public String getAciklama() {
        return Aciklama;
    }

    public void setAciklama(String aciklama) {
        Aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "Ilan{" +
                "ilanid=" + ilanid +
                ", uyeid=" + uyeid +
                ", adresid=" + adresid +
                ", Baslik='" + Baslik + '\'' +
                ", Aciklama='" + Aciklama + '\'' +
                ", Resimler='" + Resimler + '\'' +
                '}';
    }
}
