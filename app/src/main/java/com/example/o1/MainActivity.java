package com.example.o1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText Input;
    Button Add,Remove,RemoveLast;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Input = findViewById(R.id.mInput);
        Add = findViewById(R.id.mAdd);
        listView = findViewById(R.id.mListview);
        Remove = findViewById(R.id.mRemove);
        RemoveLast = findViewById(R.id.mRemoveLast);
        final AddRemov addRemov = new AddRemov();

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inser = Input.getText().toString();
                addRemov.Add(inser,listView,MainActivity.this);
            }
        });
        Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inser = Input.getText().toString();
                addRemov.Remove(inser,listView,MainActivity.this);
            }
        });
        RemoveLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addRemov.RemoveLast(listView,MainActivity.this);

            }
        });



    }
}
