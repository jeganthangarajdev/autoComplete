package com.jegan.autocom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;

    String[] array={"Application","Solar","Changes","Inkpen","Cables","Energy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,array);
        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setAdapter(myAdapter);

    }
}
