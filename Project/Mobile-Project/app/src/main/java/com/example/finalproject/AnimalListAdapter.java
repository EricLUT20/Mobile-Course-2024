package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AnimalListAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;

    public AnimalListAdapter(Context c, String[] i) {
        items = i;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_animal_listview_detail, null);
        TextView animalNameTextView = (TextView) v.findViewById(R.id.animalNameTextView);

        String name = items[i];

        animalNameTextView.setText(name);

        return v;
    }
}
