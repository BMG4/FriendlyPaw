package com.example.friendlypaw.Eklentiler;

public class model {
    private String ilanIcerik;
    private String ilanBaslik;
    private int resimID;

    public model(String ilanIcerik, String ilanBaslik, int resimID) {
        this.ilanIcerik = ilanIcerik;
        this.ilanBaslik = ilanBaslik;
        this.resimID = resimID;
    }

    public String getIlanIcerik() {
        return ilanIcerik;
    }

    public void setIlanIcerik(String ilanIcerik) {
        this.ilanIcerik = ilanIcerik;
    }

    public String getIlanBaslik() {
        return ilanBaslik;
    }

    public void setIlanBaslik(String ilanBaslik) {
        this.ilanBaslik = ilanBaslik;
    }

    public int getResimID() {
        return resimID;
    }

    public void setResimID(int resimID) {
        this.resimID = resimID;
    }
}
