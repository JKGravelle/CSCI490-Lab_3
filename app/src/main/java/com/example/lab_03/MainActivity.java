package com.example.lab_03;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public ArrayAdapter<String> arrayAdapt;
    public ListView classList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] mySchedule = getResources().getStringArray(R.array.myClasses);


        arrayAdapt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, mySchedule);

        classList = findViewById(R.id.mySchedule);
        classList.setAdapter(arrayAdapt);

        classList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), "OnItemClick", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        classList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), "OnItemLongClick", Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

    }
}