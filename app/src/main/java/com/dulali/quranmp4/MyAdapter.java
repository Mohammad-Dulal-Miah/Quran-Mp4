package com.dulali.quranmp4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
public class MyAdapter extends BaseAdapter {

    Context context ;
    String names[];
    LayoutInflater inflater;

    public MyAdapter(Context context , String names[]){
        this.context = context;
        this.names = names;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.sura_item,null);
        TextView textView = view.findViewById(R.id.name);
        TextView position = view.findViewById(R.id.position);
        int j = i+1;
        textView.setText(names[i]);
        position.setText(""+j);

        return view;
    }
}
