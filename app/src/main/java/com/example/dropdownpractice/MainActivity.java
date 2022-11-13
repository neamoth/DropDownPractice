package com.example.dropdownpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] items = {"CSE334-Pervasive Computing", "CSE335-Pervasive Computing and Mobile App Development Lab ", "CSE326-Research and Innovation"};
    AutoCompleteTextView courseSlt;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseSlt = findViewById(R.id.CourseSlt);

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item,items);

        courseSlt.setAdapter(adapterItems);
        courseSlt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });

    }
}