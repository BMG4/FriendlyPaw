package com.example.friendlypaw.Eklentiler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.friendlypaw.R;
import com.example.friendlypaw.Tablolar.Ilan;

import java.util.List;

import io.realm.RealmResults;

public class ilanAdapter extends BaseAdapter {
    List<Ilan> list;
    Context context;

    public ilanAdapter(List<Ilan> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.ilan_icerik,parent,false);
        ImageView img= convertView.findViewById(R.id.ilanResim);
        TextView icerik=convertView.findViewById(R.id.ilanIcerik);
        TextView baslik=convertView.findViewById(R.id.ilanbaslık);
        icerik.setText(list.get(position).getAciklama());
        baslik.setText(list.get(position).getBaslik());


        return convertView;
    }
}
