package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.myList);
        String names []= {"Ala","Ola","Ela","Ula","Wojtek"};
        String games []= {"Witcher 3","Code Vein","PS5","Dying Light","Batman Arkham Knight"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textName,names);
        lista.setAdapter(adapter);
    }
}