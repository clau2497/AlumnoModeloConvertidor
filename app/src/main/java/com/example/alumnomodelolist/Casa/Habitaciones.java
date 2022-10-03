package com.example.alumnomodelolist.Casa;

public class Habitaciones {
    String nombreHabitacion;
    String objetoHabitacion;

    public Habitaciones(String nombreHabitacion, String objetoHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
        this.objetoHabitacion = objetoHabitacion;
    }

    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public void setNombreHabitacion(String nombreHabitacion) {
        this.nombreHabitacion = nombreHabitacion;
    }

    public String getObjetoHabitacion() {
        return objetoHabitacion;
    }

    public void setObjetoHabitacion(String objetoHabitacion) {
        this.objetoHabitacion = objetoHabitacion;
    }
}
