package com.example.practica4;

import java.io.Serializable;

public class Juego implements Serializable {

    private String name;
    private int[] plataforma;
    private String descripcion;
    private int icono;
    private int imgPortada;
    private String date;
    private int puntuacion;


    public Juego(String name, int[] plataforma, String descripcion, String date, int icono, int imgPortada, int puntuacion) {
        this.name = name;
        this.plataforma = plataforma;
        this.descripcion = descripcion;
        this.icono = icono;
        this.imgPortada = imgPortada;
        this.date = date;
        this.puntuacion = puntuacion;
    }

    public String getName() {
        return name;
    }

    public int[] getPlataforma() {
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

    public int getPuntuacion() {
        return puntuacion;
    }
}
