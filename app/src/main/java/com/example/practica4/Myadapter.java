package com.example.practica4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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
        vista_item=layoutInflater.inflate(R.layout.list_game,null);
        //asociar xml a java
        TextView textViewName=vista_item.findViewById(R.id.textViewNameGame);
        TextView textViewPlataforma1=vista_item.findViewById(R.id.textViewPlataforma1);
        TextView textViewPlataforma2=vista_item.findViewById(R.id.textViewPlataforma2);
        TextView textViewPlataforma3=vista_item.findViewById(R.id.textViewPlataforma3);
        ImageView icono=vista_item.findViewById(R.id.imageViewIco);
        Juego currentGame=juegos.get(position);
        //traer valores posicion
        String currentName=currentGame.getName();
        int Icono=currentGame.getIcono();
        String[]plataformas=currentGame.getPlataforma();

        //Pasar valores a los campos
        textViewName.setText(currentName);
        icono.setImageResource(Icono);
        textViewPlataforma1.setText(plataformas[0]);
        textViewPlataforma2.setText(plataformas[1]);
        textViewPlataforma3.setText(plataformas[2]);
        return vista_item;

    }
}
