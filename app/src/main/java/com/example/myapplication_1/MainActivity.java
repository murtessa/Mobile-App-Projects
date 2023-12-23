package com.example.myapplication_1;

//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.ToggleButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private ToggleButton toggleButton;
    private RadioGroup radioGroup;
    private RadioButton radioOption1;
    private RadioButton radioOption2;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI controls
        checkBox = findViewById(R.id.checkBox);
        toggleButton = findViewById(R.id.toggleButton);
        radioGroup = findViewById(R.id.radioGroup);
        radioOption1 = findViewById(R.id.radioOption1);
        radioOption2 = findViewById(R.id.radioOption2);
        spinner = findViewById(R.id.spinner);

        // Populate spinner with data
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_options,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Set up listeners for UI controls
        setListeners();
    }

    private void setListeners() {
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle CheckBox click
                boolean isChecked = ((CheckBox) view).isChecked();
                // Add your logic here
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle ToggleButton click
                boolean isChecked = ((ToggleButton) view).isChecked();
                // Add your logic here
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                // Handle RadioButton selection
                switch (checkedId) {
                    case R.id.radioOption1:
                        // Option 1 selected
                        break;
                    case R.id.radioOption2:
                        // Option 2 selected
                        break;
                }
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                // Handle Spinner item selection
                String selectedItem = adapterView.getItemAtPosition(position).toString();
                // Add your logic here
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Handle case where nothing is selected in Spinner
            }
        });
    }
}
