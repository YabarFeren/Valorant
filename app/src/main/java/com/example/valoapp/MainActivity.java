package com.example.valoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnArmas, btnAgentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArmas = (ImageButton) findViewById(R.id.imgArmasf);
        btnAgentes = (ImageButton) findViewById(R.id.imgAgentes);

        btnArmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Armas.class);
                intent.putExtra("SitioWeb",android.widget.ImageButton);
                startActivity(intent);
            }
        });

        btnAgentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, seleccionAgentes.class);
                startActivity(intent);
            }
        });

    }
}