package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button todoListBtn = (Button) findViewById(R.id.todoListBtn);
        Button animalListBtn = (Button) findViewById(R.id.animalListBtn);
        Button foodListBtn = (Button) findViewById(R.id.foodListBtn);

        todoListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent todoListIntent = new Intent(getApplicationContext(), TodoListActivity.class);
                startActivity(todoListIntent);

            }
        });

        animalListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent animalListIntent = new Intent(getApplicationContext(), AnimalListActivity.class);
                startActivity(animalListIntent);

            }
        });

        foodListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent foodListIntent = new Intent(getApplicationContext(), FoodListActivity.class);
                startActivity(foodListIntent);

            }
        });

    }
}