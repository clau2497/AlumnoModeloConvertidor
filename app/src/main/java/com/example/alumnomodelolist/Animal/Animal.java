package com.example.alumnomodelolist.Animal;

import java.util.List;

public class Animal {
    String nombre;
    String raza;

    List<Juguetes> listJuguetes;

    public Animal(String nombre, String raza, List<Juguetes> listJuguetes) {
        this.nombre = nombre;
        this.raza = raza;
        this.listJuguetes = listJuguetes;
    }

    public List<Juguetes> getListJuguetes() {
        return listJuguetes;
    }

    public void setListJuguetes(List<Juguetes> listJuguetes) {
        this.listJuguetes = listJuguetes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
