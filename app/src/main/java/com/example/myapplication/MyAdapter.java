package com.example.myapplication;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.List;

public class MyAdapter() extends BaseAdapter {
    public MyAdapter(Context context, List<Person> personList, LayoutInflater layoutInflater) {
        this.context = context;
        this.personList = personList;
        this.layoutInflater = layoutInflater;
    }

    private Context context;
    private List<Person> personList;
    private LayoutInflater layoutInflater;
}
