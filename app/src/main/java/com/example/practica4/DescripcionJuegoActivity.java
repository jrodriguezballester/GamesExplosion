package com.example.practica4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescripcionJuegoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_juego);
        // Icono en menu
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_practica4);

        // mostrar Up
        getSupportActionBar().setHomeButtonEnabled(true);

        //Asociar xml a java
        TextView textViewNombre = findViewById(R.id.textViewNombre);
        TextView textViewDescripcion = findViewById(R.id.textViewDescripcion);
        TextView textViewFecha = findViewById(R.id.textViewFecha);
        ImageView imageView = findViewById(R.id.imageView);

        // imprimir Datos del intent de activity1
        if (getIntent().getExtras() != null) {
            Juego juego_entrada = (Juego) getIntent().getSerializableExtra("JUEGO");

            textViewNombre.setText(juego_entrada.getName());
            textViewDescripcion.setText(juego_entrada.getDescripcion());
            textViewFecha.setText(juego_entrada.getDate());
            imageView.setImageResource(juego_entrada.getImgPortada());
        }


    }
}