package com.example.alumnomodelolist.Animal;

import com.example.alumnomodelolist.Animal.Animal;
import com.example.alumnomodelolist.Animal.AnimalModel;
import com.example.alumnomodelolist.Animal.Juguetes;
import com.example.alumnomodelolist.Animal.JuguetesModel;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmList;

public class AnimalDAO {

    public static List<Animal> addAll(List<Animal> listAnimal) {
        Realm realm;
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        AnimalModel animalModel = new AnimalModel();
        List<AnimalModel> animalModelList = new ArrayList<>();
        animalModelList = convertidorAnimal(listAnimal);
        realm.copyToRealm(animalModelList);
        realm.commitTransaction();
        return listAnimal;
    }

    //lo que regresa                                //lo que recibe
    public static List<AnimalModel> convertidorAnimal(List<Animal> animalList) {

        List<AnimalModel> animalModelList = new ArrayList<>();
        for (Animal forAnimal : animalList) {

            RealmList<JuguetesModel> juguetesModelList = new RealmList<>();
            for (Juguetes forJuguetes : forAnimal.getListJuguetes()) {
                JuguetesModel juguetesModelRecorrido = new JuguetesModel();
                juguetesModelRecorrido.setNombre(forJuguetes.getNombre());
                juguetesModelRecorrido.setMaterial(forJuguetes.getMaterial());

                juguetesModelList.add(juguetesModelRecorrido);
            }

            AnimalModel animalModelRecorrido = new AnimalModel();
            animalModelRecorrido.setNombre(forAnimal.getNombre());
            animalModelRecorrido.setRaza(forAnimal.getRaza());
            animalModelRecorrido.setJuguetesModels(juguetesModelList);

            animalModelList.add(animalModelRecorrido);

        }
        return animalModelList;
    }

}
