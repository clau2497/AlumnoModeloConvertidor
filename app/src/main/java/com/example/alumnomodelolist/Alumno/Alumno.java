package com.example.alumnomodelolist.Alumno;

import com.example.alumnomodelolist.Maestro.Maestro;
import com.example.alumnomodelolist.Maestro.MaestroModel;
import com.example.alumnomodelolist.Materia.Materia;
import com.example.alumnomodelolist.Materia.MateriaModel;

import java.util.List;

public class Alumno {

    private String nombre;
    private int edad;
    private String grupo;
    List<Materia> materiaModelList;
    List<Maestro> maestroModelList;

    public Alumno(String nombre, int edad, String grupo, List<Materia> materiaModelList, List<Maestro> maestroModelList) {
        this.nombre = nombre;
        this.edad = edad;
        this.grupo = grupo;
        this.materiaModelList = materiaModelList;
        this.maestroModelList = maestroModelList;
    }

    public  Alumno(){

    }
    public List<Materia> getMateriaModelList() {
        return materiaModelList;
    }

    public void setMateriaModelList(List<Materia> materiaModelList) {
        this.materiaModelList = materiaModelList;
    }

    public List<Maestro> getMaestroModelList() {
        return maestroModelList;
    }

    public void setMaestroModelList(List<Maestro> maestroModelList) {
        this.maestroModelList = maestroModelList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
