package com.example.alumnomodelolist.Maestro.Auto;

import io.realm.RealmObject;

public class AutoModel extends RealmObject {
    private String marca;
    private String modelo;
    private int anio;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
