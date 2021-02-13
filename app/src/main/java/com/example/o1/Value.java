package com.example.o1;

import android.widget.ArrayAdapter;

public class Value {
    private String Value;

    public Value(String value){
        this.Value = value;
    }

    public String getValue() {
        return Value;
    }


    public void setValue(String value) {
        Value = value;
    }
}
