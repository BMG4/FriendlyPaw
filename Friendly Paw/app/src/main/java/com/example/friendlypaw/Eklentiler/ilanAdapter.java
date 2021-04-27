package com.example.friendlypaw.Eklentiler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.friendlypaw.R;

import java.util.List;

public class ilanAdapter extends BaseAdapter {
    List<model> list;
    Context context;

    public ilanAdapter(List<model> list, Context context) {
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
        View layout = LayoutInflater.from(context).inflate(R.layout.ilan_icerik,parent,false);
        ImageView img= layout.findViewById(R.id.ilanResim);
        TextView icerik=layout.findViewById(R.id.ilanIcerik);
        TextView baslik=layout.findViewById(R.id.ilanbaslık);

        img.setImageResource(list.get(position).getResimID());
        icerik.setText(list.get(position).getIlanIcerik());
        baslik.setText(list.get(position).getIlanBaslik());


        return layout;
    }
}
