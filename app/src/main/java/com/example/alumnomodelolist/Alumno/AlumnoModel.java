package com.example.alumnomodelolist.Alumno;

import com.example.alumnomodelolist.Maestro.MaestroModel;
import com.example.alumnomodelolist.Materia.MateriaModel;

import java.util.List;

public class AlumnoModel {
   private String nombre;
   private int edad;
   private String grupo;
   List<MateriaModel> materiaModelList;
   List<MaestroModel> maestroModelList;

   public List<MateriaModel> getMateriaModelList() {
      return materiaModelList;
   }

   public void setMateriaModelList(List<MateriaModel> materiaModelList) {
      this.materiaModelList = materiaModelList;
   }

   public List<MaestroModel> getMaestroModelList() {
      return maestroModelList;
   }

   public void setMaestroModelList(List<MaestroModel> maestroModelList) {
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
