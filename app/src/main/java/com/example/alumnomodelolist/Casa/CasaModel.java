package com.example.alumnomodelolist.Casa;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

public class CasaModel extends RealmObject {
    String colonia;
    int numero;

    RealmList<HabitacionesModel> habitacionesModelsList;

    public RealmList<HabitacionesModel> getHabitacionesModelsList() {
        return habitacionesModelsList;
    }

    public void setHabitacionesModelsList(RealmList<HabitacionesModel> habitacionesModelsList) {
        this.habitacionesModelsList = habitacionesModelsList;
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


}
