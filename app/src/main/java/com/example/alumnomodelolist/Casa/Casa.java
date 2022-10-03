package com.example.alumnomodelolist.Casa;

import java.util.List;

public class Casa {
    String colonia;
    int numero;

    List<Habitaciones> habitacionesList;

    public Casa(String colonia, int numero, List<Habitaciones> habitacionesList) {
        this.colonia = colonia;
        this.numero = numero;
        this.habitacionesList = habitacionesList;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Habitaciones> getHabitacionesList() {
        return habitacionesList;
    }

    public void setHabitacionesList(List<Habitaciones> habitacionesList) {
        this.habitacionesList = habitacionesList;
    }
}
