package com.example.pemainankodedanhuruf;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class pengkodeangagka extends AppCompatActivity {
    Button btn_keluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengkodeangagka);
        btn_keluar = (Button) findViewById(R.id.btn_keluar);
        btn_keluar.setOnClickListener(v -> {
            Intent kode = new Intent(pengkodeangagka.this,menuutama.class);
            startActivity(kode);
        });
    }
}