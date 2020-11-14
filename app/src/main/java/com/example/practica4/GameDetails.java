package com.example.practica4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GameDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        // Icono en menu
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_practica4);

        // mostrar Up
        getSupportActionBar().setHomeButtonEnabled(true);

        //Asociar xml a java
        TextView textViewNombre = findViewById(R.id.textViewNombre);
        TextView textViewDescripcion = findViewById(R.id.textViewDescripcion);
        TextView textViewFecha = findViewById(R.id.textViewFecha);
        ImageView imageView = findViewById(R.id.imageViewPortada);

        ImageView imageViewStar1 = findViewById(R.id.imageViewStar1);
        ImageView imageViewStar2 = findViewById(R.id.imageViewStar2);
        ImageView imageViewStar3 = findViewById(R.id.imageViewStar3);
        ImageView imageViewStar4 = findViewById(R.id.imageViewStar4);
        ImageView imageViewStar5 = findViewById(R.id.imageViewStar5);
        ImageView[] imageViewStars = new ImageView[]{imageViewStar1, imageViewStar2, imageViewStar3, imageViewStar4, imageViewStar5};

        ImageView imageViewPlataforma1 = findViewById(R.id.imageViewPlataforma1);
        ImageView imageViewPlataforma2 = findViewById(R.id.imageViewPlataforma2);
        ImageView imageViewPlataforma3 = findViewById(R.id.imageViewPlataforma3);
        ImageView[] imageViewPlataformas = new ImageView[]{imageViewPlataforma1, imageViewPlataforma2, imageViewPlataforma3};


        // imprimir Datos del intent de activity1
        if (getIntent().getExtras() != null) {
            Juego juego_entrada = (Juego) getIntent().getSerializableExtra("JUEGO");

            textViewNombre.setText(juego_entrada.getName());
            textViewDescripcion.setText(juego_entrada.getDescripcion());
            textViewFecha.setText(juego_entrada.getDate());
            imageView.setImageResource(juego_entrada.getImgPortada());
            int[] plataformas = juego_entrada.getPlataforma();
            for (int i = 0; i < plataformas.length; i++) {
                imageViewPlataformas[i].setImageResource(plataformas[i]);
            }
            for (ImageView imageViewStar :
                    imageViewStars) {
                imageViewStar.setVisibility(View.INVISIBLE);
            }
            for (int i = 0; i < 4; i++) {
                if (i >= juego_entrada.getPuntuacion()) {
                    imageViewStars[i].setVisibility(View.INVISIBLE);
                } else {
                    imageViewStars[i].setVisibility(View.VISIBLE);
                }

            }
        }


    }
}