package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox cbandroid,cbjava,cbpython,cbsql,cbkotlin;
    private Button btdisplay;
    private TextView tvoutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbandroid = findViewById(R.id.cb_android);
        cbjava = findViewById(R.id.cb_java);
        cbpython = findViewById(R.id.cb_python);
        cbsql = findViewById(R.id.cb_sql);
        cbkotlin = findViewById(R.id.cb_kotlin);
        btdisplay = findViewById(R.id.btn);
        tvoutput = findViewById(R.id.op);

        cbandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbandroid.isChecked()) {
                    cbandroid.setTextColor(getResources().getColor(R.color.pale));
                } else {
                    cbandroid.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbjava.isChecked()) {
                    cbjava.setTextColor(getResources().getColor(R.color.pale));
                } else {
                    cbjava.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbpython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbpython.isChecked()) {
                    cbpython.setTextColor(getResources().getColor(R.color.pale));
                } else {
                    cbpython.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbsql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbsql.isChecked()) {
                    cbsql.setTextColor(getResources().getColor(R.color.pale));
                } else {
                    cbsql.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbkotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbkotlin.isChecked()) {
                    cbkotlin.setTextColor(getResources().getColor(R.color.pale));
                } else {
                    cbkotlin.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        btdisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if (cbandroid.isChecked()) {
                    s += "\n ANDROID";
                }
                if (cbjava.isChecked()) {
                    s += "\n JAVA";
                }
                if (cbpython.isChecked()) {
                    s += "\n PYTHON";
                }
                if(cbsql.isChecked()){
                    s +="\n SQL";
                }
                if(cbkotlin.isChecked()){
                    s +="\n KOTLIN";
                }
                tvoutput.setText(s);
            }
        });

        }

}
