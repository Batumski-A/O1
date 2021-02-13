package com.example.o1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ValueListAdapter extends ArrayAdapter<Value> {
    private Context context;
    int mResource;

    public ValueListAdapter(Context context, int resource, ArrayList<Value> objects) {
        super(context, resource,objects);
        this.context = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String text =getItem(position).getValue();
        Value value = new Value(text);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(mResource,parent,false);
        TextView key =(TextView)convertView.findViewById(R.id.lKey);
        key.setText(text);
        return convertView;
    }


}
