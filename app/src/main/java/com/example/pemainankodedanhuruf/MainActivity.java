package com.example.pemainankodedanhuruf;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_mulai;
    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_mulai= findViewById(R.id.btn_mulai);
        btn_mulai.setOnClickListener(view -> {
            if (view.getId() == R.id.btn_mulai) {
                Intent menuutama = new Intent(MainActivity.this, com.example.pemainankodedanhuruf.menuutama.class);
                startActivity(menuutama);
            }
            Toast.makeText(MainActivity.this, "Anda berhasil ke menu utama", Toast.LENGTH_SHORT).show();

        });
    }
}