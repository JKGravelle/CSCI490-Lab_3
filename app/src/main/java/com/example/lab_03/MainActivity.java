package com.example.lab_03;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.content.res.Resources;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private String[] classes = {"Japanese 290", "UI Design",
        "CITA Capstone", "Painting I", "Data Structures and Algorithms",
            "Art History of Japan", "Printmaking II"};

    public ArrayAdapter<String> arrAdapter;
    public ListView myList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] schedule = getResources().getStringArray(R.array.classes);


        arrAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, schedule);

        myList = findViewById(R.id.class_schedule);
        myList.setAdapter(arrAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), "OnItemClick", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        myList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), "OnItemLongClick", Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

    }
}
