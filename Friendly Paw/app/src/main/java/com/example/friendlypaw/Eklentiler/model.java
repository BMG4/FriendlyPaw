package com.example.friendlypaw.Eklentiler;

public class model {
    private String mesajIcerik;
    private String kisi;
    private int resimID;

    public model(String mesajIcerik, String kisi, int resimID) {
        this.mesajIcerik = mesajIcerik;
        this.kisi = kisi;
        this.resimID = resimID;
    }

    public String getMesajIcerik() {
        return mesajIcerik;
    }

    public void setMesajIcerik(String mesajIcerik) {
        this.mesajIcerik = mesajIcerik;
    }

    public String getKisi() {
        return kisi;
    }

    public void setKisi(String kisi) {
        this.kisi = kisi;
    }

    public int getResimID() {
        return resimID;
    }

    public void setResimID(int resimID) {
        this.resimID = resimID;
    }
}
