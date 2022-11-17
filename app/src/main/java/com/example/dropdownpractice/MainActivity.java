package com.example.dropdownpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] itemsCourse = {"CSE334-Pervasive Computing", "CSE335-Pervasive Computing and Mobile App Development Lab"};
    String[] itemsSection = {"T3_PC_A", "T3_PC_B", "T3_PC_C", "PC_A", "PC_B", "PC_C"};
    AutoCompleteTextView courseSelect;
    AutoCompleteTextView sectionSelect;
    ArrayAdapter<String> adapterItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseSelect = findViewById(R.id.courseSelect);

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item,itemsCourse);

        courseSelect.setAdapter(adapterItems);
        courseSelect.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });
        sectionSelect = findViewById(R.id.sectionSelect);

        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item,itemsSection);

        sectionSelect.setAdapter(adapterItems);
        sectionSelect.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), "Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });

    }
}