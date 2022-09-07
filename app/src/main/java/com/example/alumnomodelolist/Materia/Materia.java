package com.example.alumnomodelolist.Materia;

import java.util.List;

public class Materia {

    private String nombre;
    private int horas;

    public Materia(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public Materia(){

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

}
