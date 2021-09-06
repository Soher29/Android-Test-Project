package com.example.fuck.notes.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.fuck.R;

import java.util.ArrayList;
import java.util.List;

public class Task2Activity extends AppCompatActivity {
    EditText input;
    ImageView preview1;
    ImageView preview2;
    ImageView preview3;
    ImageView preview4;

    List<ImageView> previews = new ArrayList<>();
    private int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        ImageButton imageButton = findViewById(R.id.imageButton);
        input = findViewById(R.id.link);
        preview1 = findViewById(R.id.preview1);
        preview2 = findViewById(R.id.preview2);
        preview3= findViewById(R.id.preview3);
        preview4 = findViewById(R.id.preview4);

        previews.add(preview1);
        previews.add(preview2);
        previews.add(preview3);
        previews.add(preview4);

        imageButton.setOnClickListener(v -> {
            String link = input.getText().toString();

            loadNext(link);
            input.getText().clear();
        });
    }

    private void loadNext(String link) {
        int nextIndex = ++counter;

        if (nextIndex > previews.size() - 1) {
            counter = 0;
            nextIndex = 0;
        }

        ImageView preview = previews.get(nextIndex);
        Glide.with(this).load(link).into(preview);
    }
}