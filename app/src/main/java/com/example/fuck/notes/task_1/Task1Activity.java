package com.example.fuck.notes.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fuck.R;

public class Task1Activity extends AppCompatActivity implements View.OnClickListener {
    TextView tv1;
    EditText et1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        et1 = (EditText) findViewById(R.id.et1);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (et1.getText().length() == 0) {
            et1.setError("поле пустое");
        } else {
            String str = "\n-" + et1.getText().toString();
            tv1.append(str);
            et1.getText().clear();
        }
    }
}


