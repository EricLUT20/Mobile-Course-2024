package com.example.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.Arrays;

public class TodoListActivity extends AppCompatActivity {

    String[] todos = new String[0];
    ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_list);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        EditText addTodoEditText = (EditText) findViewById(R.id.addTodoEditText);

        itemAdapter = new ItemAdapter(this, todos);
        myListView.setAdapter(itemAdapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newTodo = addTodoEditText.getText().toString();
                if (!newTodo.isEmpty()) {
                    todos = Arrays.copyOf(todos, todos.length + 1);
                    todos[todos.length - 1] = newTodo;
                    itemAdapter = new ItemAdapter(TodoListActivity.this, todos);
                    myListView.setAdapter(itemAdapter);
                    addTodoEditText.setText("");
                }
            }
        });

    }
}
