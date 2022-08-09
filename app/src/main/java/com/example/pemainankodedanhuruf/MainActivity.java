package com.example.pemainankodedanhuruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_mulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_mulai=(Button) findViewById(R.id.btn_mulai);
        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn_mulai:
                        Intent menuutama= new Intent(MainActivity.this, com.example.pemainankodedanhuruf.menuutama.class);
                        startActivity(menuutama);
                        break;
                }

            }
        });
    }
}