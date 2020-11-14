package com.example.practica4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.practica4.R.drawable.dauntless1;
import static com.example.practica4.R.drawable.dauntless2;

public class MainActivity extends AppCompatActivity {
    private ListView listViewGameNames;

    private List<Juego> juegos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear y Cargar juegos en un array list
        juegos = new ArrayList<>();
        Juego juego1, juego2, juego3, juego4, juego5, juego6, juego7;
        // String[] plataforma = {"Xbox", "Play4", "Pc"};
        int[] plataformas = new int[]{R.mipmap.ic_xbox, R.mipmap.ic_psp, R.mipmap.ic_pc};
        int[] plataformas2 = {R.mipmap.ic_pc};
        int[] plataformas3 = {R.mipmap.ic_psp, R.mipmap.ic_pc};
        juego1 = new Juego(
                "Dauntless",
                plataformas,
                "Dauntless es un juego de rol de acción en línea gratuito desarrollado por Phoenix Labs. Te esperan actualizaciones frecuentes, eventos de temporada, nuevos Behemoths y mucho más en este mundo en constante evolución.",
                "21/05/2019",
                dauntless1,
                dauntless2,
                3);
        juego2 = new Juego(
                "League of Legends",
                plataformas2,
                "League of Legends es un juego de estrategia por equipos en el que dos equipos de cinco campeones se enfrentan para ver quién destruye antes la base del otro. Elige de entre un elenco de 140 campeones para realizar jugadas épicas, asesinar rivales y derribar torretas para alzarte con la victoria.",
                "27/10/2009",
                R.drawable.lol1,
                R.drawable.lol2,
                4);
        juego3 = new Juego(
                "Assasin's Creed",
                plataformas,
                "Ponte en la piel de una leyenda vikinga en busca de gloria. Saquea a tus enemigos, haz prosperar tu asentamiento y consolida tu poder político. ",
                "10/11/2020",
                R.drawable.assasin1,
                R.drawable.assasin2,
                2);
        juego4 = new Juego(
                "Whatch Dog's Legion",
                plataformas,
                "En Watch Dogs: Legion tu misión es formar una resistencia para salvar Londres de la debacle en un futuro próximo.",
                "27/10/2009",
                R.drawable.legion2,
                R.drawable.legion1,
                5);
        juego5 = new Juego(
                "War Thunder",
                plataformas,
                "War Thunder es un videojuego de combate aéreo, terrestre y naval, preferentemente arcade, aunque pudiendo el jugador si lo desea, elegir una modalidad realista o simulada de jugabilidad. Desarrollado por Gaijin Entertainment, War Thunder es un videojuego multijugador masivo en línea gratuito.",
                "29/11/2013",
                R.drawable.war2,
                R.drawable.war1,
                1);
        juego6 = new Juego(
                "Godfall",
                plataformas3,
                "Salva Aperion. Eres uno de los últimos caballeros valorianos, maestros del combate que emplean las armaduras legendarias conocidas como Valorplates. Asciende en Godfall, el primer RPG de acción looter-slasher centrado en el combate cuerpo a cuerpo.",
                "12/11/2020",
                R.drawable.godfall1,
                R.drawable.godfall2,
                0);
        juego7 = new Juego(
                "Observer",
                plataformas,
                "Estamos en el año 2084. En un oscuro mundo ciberpunk asolado por plagas y guerras, conviértete en un policía neuronal y penetra en las tormentosas mentes de los demás. Utiliza sus sentimientos, pensamientos y recuerdos para resolver el caso y atrapar al esquivo asesino.",
                "15/08/2017",
                R.drawable.observer1,
                R.drawable.observer2,
                1);

        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);
        juegos.add(juego4);
        juegos.add(juego5);
        juegos.add(juego6);
        juegos.add(juego7);

        // mostrar Icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_practica4);

        // mostrar Up
        getSupportActionBar().setHomeButtonEnabled(true);

        //Asociar java con xml
        listViewGameNames = findViewById(R.id.listViewGameName);

        ArrayList<String> juegosNames = new ArrayList<>();
        for (Juego juego : juegos) {
            juegosNames.add(juego.getName());
        }

        // Adaptador simple
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, juegosNames);

        // Asociar el adapter al listView
        listViewGameNames.setAdapter(adapter);


        //mi adaptador personalizado
        Myadapter myadapter = new Myadapter(this, R.layout.item_game, juegos);

        // Asociar el adapter al listView
        listViewGameNames.setAdapter(myadapter);

        // AdapterView.OnItemClickListener onItemClickListener = ;
        listViewGameNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Creamos el Intent
                Intent intent = new Intent(MainActivity.this, GameDetails.class);

                // sin bundle xq pasamos objeto serializable
                intent.putExtra("JUEGO", juegos.get(position));

                startActivity(intent);
            }
        });

    }
}
