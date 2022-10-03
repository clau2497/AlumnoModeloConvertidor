package com.example.alumnomodelolist.Animal;

import io.realm.RealmList;
import io.realm.RealmObject;

//este es el que se guarda, las listas tienen que ser de tipo realmList
public class AnimalModel extends RealmObject {
    String nombre;
    String raza;

    RealmList<JuguetesModel> juguetesModels;

    public RealmList<JuguetesModel> getJuguetesModels() {
        return juguetesModels;
    }

    public void setJuguetesModels(RealmList<JuguetesModel> juguetesModels) {
        this.juguetesModels = juguetesModels;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
