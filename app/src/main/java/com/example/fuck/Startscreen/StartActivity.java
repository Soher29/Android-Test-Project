package com.example.fuck.Startscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


import com.example.fuck.R;
import com.example.fuck.notes.task_1.Task1Activity;
import com.example.fuck.notes.task_10.Task10Activity;
import com.example.fuck.notes.task_2.Task2Activity;
import com.example.fuck.notes.task_3.Task3Activity;
import com.example.fuck.notes.task_4.Task4Activity;
import com.example.fuck.notes.task_5.Task5Activity;
import com.example.fuck.notes.task_6.Task6Activity;
import com.example.fuck.notes.task_7.Task7Activity;
import com.example.fuck.notes.task_8.Task8Activity;
import com.example.fuck.notes.task_9.Task9Activity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button task_1 = findViewById(R.id.task_1);
        Button task_2 = findViewById(R.id.task_2);
        Button task_3 = findViewById(R.id.task_3);
        Button task_4 = findViewById(R.id.task_4);
        Button task_5 = findViewById(R.id.task_5);
        Button task_6 = findViewById(R.id.task_6);
        Button task_7 = findViewById(R.id.task_7);
        Button task_8 = findViewById(R.id.task_8);
        Button task_9 = findViewById(R.id.task_9);
        Button task_10 = findViewById(R.id.task_10);


        task_1.setOnClickListener(v ->
                startActivity(new Intent(this, Task1Activity.class)));

        task_2.setOnClickListener(v ->
                startActivity(new Intent(this, Task2Activity.class)));

        task_3.setOnClickListener(v ->
                startActivity(new Intent(this, Task3Activity.class)));

        task_4.setOnClickListener(v ->
                startActivity(new Intent(this, Task4Activity.class)));

        task_5.setOnClickListener(v ->
                startActivity(new Intent(this, Task5Activity.class)));

        task_6.setOnClickListener(v ->
                startActivity(new Intent(this, Task6Activity.class)));

        task_7.setOnClickListener(v ->
                startActivity(new Intent(this, Task7Activity.class)));

        task_8.setOnClickListener(v ->
                startActivity(new Intent(this, Task8Activity.class)));

        task_9.setOnClickListener(v ->
                startActivity(new Intent(this, Task9Activity.class)));

        task_10.setOnClickListener(v ->
                startActivity(new Intent(this, Task10Activity.class)));

    }


}