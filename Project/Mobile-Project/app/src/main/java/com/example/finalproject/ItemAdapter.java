package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] todos;

    public ItemAdapter(Context c, String[] t) {
        todos = t;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return todos.length;
    }

    @Override
    public Object getItem(int i) {
        return todos[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        CheckBox todoCheckBox = (CheckBox) v.findViewById(R.id.todoCheckBox);

        String todo = todos[i];

        todoCheckBox.setText(todo);

        return v;
    }
}
