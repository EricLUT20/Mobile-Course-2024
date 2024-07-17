package com.example.finalproject;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AnimalListActivity extends AppCompatActivity {

    String[] animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);

        Resources res = getResources();
        ListView myAnimalListView = (ListView) findViewById(R.id.myAnimalListView);
        animals = res.getStringArray(R.array.animals);

        AnimalListAdapter animalListAdapter = new AnimalListAdapter(this, animals);
        myAnimalListView.setAdapter(animalListAdapter);

        myAnimalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(), AnimalDetailActivity.class);
                showDetailActivity.putExtra("com.example.finalproject.ITEM_INDEX", i);
                startActivity(showDetailActivity);
            }
        });

    }
}