package com.eduandroid.recyclervieweduandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String symbol = getIntent().getStringExtra("SYM");
        String ruName = getIntent().getStringExtra("RU_NAME");
        String enName = getIntent().getStringExtra("EN_NAME");
        String weight = getIntent().getStringExtra("WEIGHT");
        String description = getIntent().getStringExtra("DESCRIPTION");

        TextView symTV = findViewById(R.id.CE_symbol);
        TextView ruNameTV = findViewById(R.id.CE_nameRU);
        TextView enNameTV = findViewById(R.id.CE_nameEN);
        TextView weightTV = findViewById(R.id.CE_weight);
        TextView descTV = findViewById(R.id.description);

        symTV.setText(symbol);
        ruNameTV.setText(ruName);
        enNameTV.setText(enName);
        weightTV.setText(weight);
        descTV.setText(description);
    }
}