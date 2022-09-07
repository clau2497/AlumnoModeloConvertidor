package com.example.alumnomodelolist.Maestro.Auto;

import com.example.alumnomodelolist.Materia.MateriaModel;

import java.util.List;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(){

    }

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
