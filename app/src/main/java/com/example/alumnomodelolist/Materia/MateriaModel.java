package com.example.alumnomodelolist.Materia;

import io.realm.RealmObject;

public class MateriaModel extends RealmObject {

    private String nombre;
    private int horas;

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
