package com.eduandroid.recyclervieweduandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    double[] atomicWeight = {1.0079, 4.0026, 6.938, 9.01218, 10.806, 12.0096, 14.0064, 15.999,
            18.9984, 20.1797, 22.9898, 24.304, 26.9815, 28.084, 30.9738, 32.059, 35.446, 39.792,
            39.0983, 40.0784, 44.9559, 47.8671, 50.9415, 51.9962, 54.938, 55.8452, 58.9332, 58.6934,
            63.5463, 65.382, 69.7231, 72.6308, 74.9216, 78.9718, 79.901, 83.7982, 85.4678, 87.621,
            88.9058, 91.2242, 92.9064, 95.951, 98.9062, 101.072, 102.906, 106.421, 107.868, 112.414,
            114.818, 118.711};

    ArrayList<ChemicalElementsModel> chemicalElementsModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);

        setChemicalElementsModels();

        CE_RecyclerViewAdapter adapter = new CE_RecyclerViewAdapter(this,
                chemicalElementsModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setChemicalElementsModels() {
        String[] elementNamesRU = getResources().getStringArray(R.array.chemical_elements_full_name_RU);
        String[] elementNamesEN = getResources().getStringArray(R.array.chemical_elements_full_name_EN);
        String[] elementSymbols = getResources().getStringArray(R.array.chemical_elements_symbols);

        for (int i = 0; i < elementNamesEN.length; i++) {
            chemicalElementsModels.add(new ChemicalElementsModel(elementNamesRU[i],
                    elementNamesEN[i], elementSymbols[i], atomicWeight[i]));
        }
    }
}
