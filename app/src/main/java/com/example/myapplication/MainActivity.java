package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista=findViewById(R.id.myList);
        //String names []= {"Ala","Ola","Ela","Ula","Wojtek"};
        //String games []= {"Witcher 3","Code Vein","PS5","Dying Light","Batman Arkham Knight"};
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Ala","Alak",20));
        personList.add(new Person("Ola","Olak",19));
        personList.add(new Person("Bela","Belak",23));
        personList.add(new Person("Ula","Ulak",22));
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.single_row,R.id.textName,names);
        MyAdapter myAdapter=new MyAdapter(this,personList);
        lista.setAdapter(Myadapter);
    }
}