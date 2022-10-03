package com.example.alumnomodelolist.Casa;

import io.realm.RealmObject;

public class HabitacionesModel extends RealmObject {

    String nombreHabitacion;
    String objetoHabitacion;

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
