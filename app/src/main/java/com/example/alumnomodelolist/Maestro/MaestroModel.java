package com.example.alumnomodelolist.Maestro;

import com.example.alumnomodelolist.Maestro.Auto.Auto;
import com.example.alumnomodelolist.Maestro.Auto.AutoModel;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

public class MaestroModel extends RealmObject {
    private String nombre;
    private String edad;
    private String especialidad;

    RealmList<AutoModel> autoListModel;

    public void setAutoListModel(RealmList<AutoModel> autoListModel) {
        this.autoListModel = autoListModel;
    }

    public List<AutoModel> getAutoListModel() {
        return autoListModel;
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
