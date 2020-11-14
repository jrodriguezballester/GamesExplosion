package com.example.practica4;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

public class Myadapter extends BaseAdapter {
    private Context context;
    private int layout;
    //private List<String>names;
    private List<Juego>juegos;

    public Myadapter(Context context, int layout, List<Juego> juegos) {
        this.context = context;
        this.layout = layout;
        this.juegos = juegos;
    }

    @Override
    public int getCount() {
        return this.juegos.size();
    }

    @Override
    public Object getItem(int position) {

        return this.juegos.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista_item=convertView;

        LayoutInflater layoutInflater=LayoutInflater.from(this.context);
        vista_item=layoutInflater.inflate(R.layout.item_game,null);

        //asociar elementos xml a java
        TextView textViewName=vista_item.findViewById(R.id.textViewNameGame);
        TextView textViewFecha=vista_item.findViewById(R.id.textViewFecha);
        TextView textViewPuntuacion=vista_item.findViewById(R.id.textViewPuntuacion);
        ImageView imageViewGameIcono=vista_item.findViewById(R.id.imageViewIco);
        ImageView imageView1=vista_item.findViewById(R.id.imageView2);
        ImageView imageView2=vista_item.findViewById(R.id.imageView3);
        ImageView imageView3=vista_item.findViewById(R.id.imageView4);

        ImageView[] imageViews=new ImageView[]{imageView1,imageView2,imageView3};

        //traer valores del juego segun posicion en la lista
        Juego currentGame=juegos.get(position);
        String currentGameName=currentGame.getName();
        int Icono=currentGame.getIcono();
        int[]plataformas=currentGame.getPlataforma();
        String currentGameFecha=currentGame.getDate();
        String currentGamePuntuacion="Puntuacion: "+ currentGame.getPuntuacion();

        //Pasar valores a los campos
        textViewName.setText(currentGameName);
        imageViewGameIcono.setImageResource(Icono);
        for (int i = 0; i < plataformas.length; i++) {
            imageViews[i].setImageResource(plataformas[i]);
        }
        textViewFecha.setText(currentGameFecha);
        textViewPuntuacion.setText(currentGamePuntuacion);

        // Cambiar fondo
        if (position % 2 == 0) {
            vista_item.setBackgroundColor(Color.LTGRAY);
        }else{
            vista_item.setBackgroundColor(Color.GRAY);
        }

        return vista_item;

    }
}
