package com.example.alumnomodelolist.Animal;

public class Juguetes {
    String nombre;
    String material;

    public Juguetes(String nombre, String material) {
        this.nombre = nombre;
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
