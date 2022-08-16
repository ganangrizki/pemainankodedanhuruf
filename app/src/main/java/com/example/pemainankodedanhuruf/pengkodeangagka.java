package com.example.pemainankodedanhuruf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pengkodeangagka extends AppCompatActivity {
    Button btn_keluar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengkodeangagka);
        btn_keluar = (Button) findViewById(R.id.btn_keluar);
        btn_keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kode = new Intent(pengkodeangagka.this,menuutama.class);
                startActivity(kode);
            }

        });
    }
}