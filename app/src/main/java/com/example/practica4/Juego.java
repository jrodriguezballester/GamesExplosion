package com.example.practica4;

import java.io.Serializable;
import java.lang.reflect.Array;

public class Juego implements Serializable {

    private String name;
    private String[] plataforma;
    private String descripcion;
    private int icono;
    private int imgPortada;
    private String date;



    public Juego(String name, String[] plataforma, String descripcion, String date, int icono, int imgPortada ) {
        this.name = name;
        this.plataforma = plataforma;
        this.descripcion = descripcion;
        this.icono = icono;
        this.imgPortada = imgPortada;
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public String[] getPlataforma() {
        return plataforma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIcono() {
        return icono;
    }

    public int getImgPortada() {
        return imgPortada;
    }

    public String getDate() {
        return date;
    }
}
