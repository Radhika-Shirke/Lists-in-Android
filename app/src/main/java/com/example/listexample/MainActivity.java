package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Spinner spinner;
    AutoCompleteTextView actxtView;
    ArrayList<String>arrNames = new ArrayList<>();
    ArrayList<String>arrIds = new ArrayList<>();

    ArrayList<String>arrLanguages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        spinner = findViewById(R.id.spinner);
        actxtView = findViewById(R.id.actxtView);


        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");
        arrNames.add("Ram");
        arrNames.add("Raman");
        arrNames.add("Ramanujan");
        arrNames.add("Ramjan");
        arrNames.add("Rameez");

        ArrayAdapter<String>adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "Clicked First Item", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Spinner

        arrIds.add("Aadhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving License Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, arrIds);
        spinner.setAdapter(spinnerAdapter);



        //AutoCompleteTextView
        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("Java");
        arrLanguages.add("PHP");
        arrLanguages.add("Objective c");
        arrLanguages.add("C#");
        arrLanguages.add("CScript");


        ArrayAdapter<String>actvAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrLanguages);
        actxtView.setAdapter(actvAdapter);
        actxtView.setThreshold(1); //Autocomplete will be displayed when the threshold is reached






    }
}