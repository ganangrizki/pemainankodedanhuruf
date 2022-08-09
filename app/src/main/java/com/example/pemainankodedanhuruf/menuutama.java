package com.example.pemainankodedanhuruf;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class menuutama extends AppCompatActivity {
    Button btn_keluar;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);
        btn_keluar= findViewById(R.id.btn_keluar);
        btn_keluar.setOnClickListener(view -> {
            if (view.getId() == R.id.btn_keluar) {
                Intent btnkeluar = new Intent(menuutama.this, MainActivity.class);
                startActivity(btnkeluar);
            }
            Toast.makeText(menuutama.this, "Anda telah keluar!", Toast.LENGTH_SHORT).show();
        });
    }
}