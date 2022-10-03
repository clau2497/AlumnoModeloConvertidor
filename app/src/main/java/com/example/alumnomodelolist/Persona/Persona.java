package com.example.alumnomodelolist.Persona;

public class Persona {
    private String nombre = "juan";
    private String sexo;
    private String nacionalidad;

    public Persona(String nombre, String sexo, String nacionalidad){
        this.nombre= nombre;
        this.sexo=sexo;
        this.nacionalidad=nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo(){return sexo;}
    public void setSexo(String sexo){this.sexo=sexo;}

    public String getNacionalidad(){return nacionalidad;}
    public void setNacionalidad(String nacionalidad){this.nacionalidad=nacionalidad;}
}
