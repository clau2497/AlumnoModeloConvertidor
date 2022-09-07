package com.example.alumnomodelolist.Maestro;

import com.example.alumnomodelolist.Maestro.Auto.Auto;

import java.util.List;

public class Maestro {
    private String nombre;
    private String edad;
    private String especialidad;
    List<Auto> autoList;

    public Maestro(String nombre, String edad, String especialidad, List<Auto> autoList) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
        this.autoList = autoList;
    }
    public Maestro(){

    }

    public List<Auto> getAutoList() {
        return autoList;
    }

    public void setAutoList(List<Auto> autoList) {
        this.autoList = autoList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
