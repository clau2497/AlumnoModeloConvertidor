package com.example.alumnomodelolist.Alumno;

import com.example.alumnomodelolist.Maestro.MaestroModel;
import com.example.alumnomodelolist.Materia.MateriaModel;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

public class AlumnoModel extends RealmObject {
   private String nombre;
   private int edad;
   private String grupo;

   private RealmList<MateriaModel> materiaModelList;
   private RealmList<MaestroModel> maestroModelList;


   public RealmList<MateriaModel> getMateriaModelList() {
      return materiaModelList;
   }

   public void setMateriaModelList(RealmList<MateriaModel> materiaModelList) {
      this.materiaModelList = materiaModelList;
   }

   public RealmList<MaestroModel> getMaestroModelList() {
      return maestroModelList;
   }

   public void setMaestroModelList(RealmList<MaestroModel> maestroModelList) {
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
