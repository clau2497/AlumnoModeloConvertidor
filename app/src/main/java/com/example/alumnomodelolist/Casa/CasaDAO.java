package com.example.alumnomodelolist.Casa;

import com.example.alumnomodelolist.Animal.Animal;
import com.example.alumnomodelolist.Animal.AnimalModel;
import com.example.alumnomodelolist.Animal.Juguetes;
import com.example.alumnomodelolist.Animal.JuguetesModel;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmList;

public class CasaDAO {

    public static List<Casa> addAll(List<Casa> listCasa) {
        Realm realm;
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        HabitacionesModel habitacionesModel = new HabitacionesModel();
        List<CasaModel> casaModelList = new ArrayList<>();
        casaModelList = convertidorCasa(listCasa);
        realm.copyToRealm(casaModelList);
        realm.commitTransaction();
        return listCasa;
    }

    //lo que regresa                                //lo que recibe
    public static List<CasaModel> convertidorCasa(List<Casa> casaList) {

        List<CasaModel> casaModelList = new ArrayList<>();
        for (Casa forCasa : casaList) {

            RealmList<HabitacionesModel> habitacionesModelList = new RealmList<>();
            for (Habitaciones forHabitaciones : forCasa.getHabitacionesList()) {
                HabitacionesModel habitacionesModelRecorrido = new HabitacionesModel();
                habitacionesModelRecorrido.setNombreHabitacion(forHabitaciones.getNombreHabitacion());
                habitacionesModelRecorrido.setObjetoHabitacion(forHabitaciones.getObjetoHabitacion());

                habitacionesModelList.add(habitacionesModelRecorrido);
            }

            CasaModel casaModelRecorrido = new CasaModel();
            casaModelRecorrido.setColonia(forCasa.getColonia());
            casaModelRecorrido.setNumero(forCasa.getNumero());
            casaModelRecorrido.setHabitacionesModelsList(habitacionesModelList);

            casaModelList.add(casaModelRecorrido);

        }
        return casaModelList;
    }
}
