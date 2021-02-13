package com.example.o1;

import android.content.Context;
import android.text.TextPaint;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class AddRemov {
    HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
    ArrayList<Value> arrayList = new ArrayList<Value>();

    public AddRemov(){
        arrayList = new ArrayList<Value>();
        hashMap = new HashMap<String, Integer>();
    }
    public void Add(String input, ListView listView, Context context){
        if(hashMap.get(input) == null){
            int arrSize = arrayList.size();
            arrayList.add(new Value(input));
            hashMap.put(input,arrSize);
            ValueListAdapter valueListAdapter = new ValueListAdapter(context,R.layout.list_adapter,arrayList);
            listView.setAdapter(valueListAdapter);
        }else {
            Toast.makeText(context,"Already uploaded",Toast.LENGTH_LONG).show();
        }
    }
    public void Remove(String input,ListView listView, Context context){
        int index = 0;
        if(hashMap.containsKey(input)){
            index = hashMap.get(input);
        }else{
            index = -1;
        }
        ArrayList<String> hashKeylist = new ArrayList<>(hashMap.keySet());
        if(index >= 0){
            Toast.makeText(context,String.valueOf(index),Toast.LENGTH_SHORT).show();
            arrayList.remove(index);
            hashMap.remove(input);
            Toast.makeText(context,"removed",Toast.LENGTH_SHORT).show();
            ValueListAdapter valueListAdapter = new ValueListAdapter(context,R.layout.list_adapter,arrayList);
            listView.setAdapter(valueListAdapter);
        }else{
            Toast.makeText(context,"Is not",Toast.LENGTH_SHORT).show();
        }
    }
    public void RemoveLast(ListView listView, Context context){
        int size = arrayList.size();
        if(size > 0) {
            ArrayList<String> heshKeylist = new ArrayList<>(hashMap.keySet());
            arrayList.remove(size - 1);
            hashMap.remove(heshKeylist.get(size-1));
            Toast.makeText(context,"last removed",Toast.LENGTH_SHORT).show();
            ValueListAdapter valueListAdapter = new ValueListAdapter(context, R.layout.list_adapter, arrayList);
            listView.setAdapter(valueListAdapter);
        }
    }


}
