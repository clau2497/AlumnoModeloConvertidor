package com.example.alumnomodelolist.Animal;

import io.realm.RealmObject;

public class JuguetesModel extends RealmObject {

    String nombre;
    String material;

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
