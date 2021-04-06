package com.example.friendlypaw.Tablolar;

import io.realm.RealmObject;

public class Üye extends RealmObject {
    private int uyeid;
    private String uyeIsim,uyeSoyisim,uyeMail,uyeSifre,uyeTelNo;

    public int getUyeid() {
        return uyeid;
    }

    public void setUyeid(int uyeid) {
        this.uyeid = uyeid;
    }

    public String getUyeIsim() {
        return uyeIsim;
    }

    public void setUyeIsim(String uyeIsim) {
        this.uyeIsim = uyeIsim;
    }

    public String getUyeSoyisim() {
        return uyeSoyisim;
    }

    public void setUyeSoyisim(String uyeSoyisim) {
        this.uyeSoyisim = uyeSoyisim;
    }

    public String getUyeMail() {
        return uyeMail;
    }

    public void setUyeMail(String uyeMail) {
        this.uyeMail = uyeMail;
    }

    public String getUyeSifre() {
        return uyeSifre;
    }

    public void setUyeSifre(String uyeSifre) {
        this.uyeSifre = uyeSifre;
    }

    public String getUyeTelNo() {
        return uyeTelNo;
    }

    public void setUyeTelNo(String uyeTelNo) {
        this.uyeTelNo = uyeTelNo;
    }

    @Override
    public String toString() {
        return "Üye{" +
                "uyeid=" + uyeid +
                ", uyeIsim='" + uyeIsim + '\'' +
                ", uyeSoyisim='" + uyeSoyisim + '\'' +
                ", uyeMail='" + uyeMail + '\'' +
                ", uyeSifre='" + uyeSifre + '\'' +
                ", uyeTelNo='" + uyeTelNo + '\'' +
                '}';
    }
}
