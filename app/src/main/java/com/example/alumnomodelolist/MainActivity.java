package com.example.alumnomodelolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.alumnomodelolist.Alumno.Alumno;
import com.example.alumnomodelolist.Alumno.AlumnoModel;
import com.example.alumnomodelolist.Animal.AnimalDAO;
import com.example.alumnomodelolist.Animal.Animal;
import com.example.alumnomodelolist.Animal.Juguetes;
import com.example.alumnomodelolist.Casa.Casa;
import com.example.alumnomodelolist.Casa.CasaDAO;
import com.example.alumnomodelolist.Casa.Habitaciones;
import com.example.alumnomodelolist.Maestro.Auto.Auto;
import com.example.alumnomodelolist.Maestro.Auto.AutoModel;
import com.example.alumnomodelolist.Maestro.Maestro;
import com.example.alumnomodelolist.Maestro.MaestroModel;
import com.example.alumnomodelolist.Materia.Materia;
import com.example.alumnomodelolist.Materia.MateriaModel;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);

        llenarAnimal();
        llenarCasa();


        List<Materia> modelMateriasJuanito = new ArrayList<>();
        modelMateriasJuanito.add(new Materia("Español", 8));
        modelMateriasJuanito.add(new Materia("Historia", 8));
       /* otra forma se setear materias
        Materia materia = new Materia();
        materia.setNombre("Matematicas");
        materia.setHoras(5);
        modelMaterias.add(materia);*/
        List<Auto> modelAutoJose = new ArrayList<>();
        modelAutoJose.add(new Auto("Nissan", "2015", 2015));
        modelAutoJose.add(new Auto("Spark", "2017", 2017));

        Auto autoJuanita = new Auto("Audi", "2020", 2020);

        List<Maestro> modelMaestrosJuanito = new ArrayList<>();
        modelMaestrosJuanito.add(new Maestro("Jose", "30", "Matemaricas", modelAutoJose));

        List<Alumno> listaAlumno = new ArrayList<>();
        listaAlumno.add(new Alumno("Juanito", 15, "A", modelMateriasJuanito, modelMaestrosJuanito));
        listaAlumno.add(new Alumno("Carlos", 15, "A", modelMateriasJuanito, modelMaestrosJuanito));


        //alumno maestros y los autos de los maestros por cada lista es un for
        for (Alumno listaAlumnos : listaAlumno) {
            List<Maestro> listMaestro = listaAlumnos.getMaestroModelList();
            for (Maestro listaMaestros : listMaestro) {
                List<Auto> listaA = listaMaestros.getAutoList();
                for (Auto listaAutos : listaA) {
                    System.out.println(
                            "Alumno: " + listaAlumnos.getNombre() + " " + listaAlumnos.getEdad() + " " + listaAlumnos.getGrupo() + " \n " +
                                    "Maestro del alumno: " + listaMaestros.getNombre() + " " + listaMaestros.getEspecialidad() + " \n " +
                                    "Autos del maestro:" + listaAutos.getModelo() + " " + listaAutos.getMarca() + listaAutos.getAnio());
                }

            }
        }

        for (Alumno listaAlumnos : listaAlumno) {
            List<Materia> listMaterias = listaAlumnos.getMateriaModelList();
            for (Materia listaMaterias : listMaterias) {
                System.out.println("Alumno: " + listaAlumnos.getNombre() + " " + listaAlumnos.getEdad() + " " + listaAlumnos.getGrupo() + "\n" +
                        "Materia: " + listaMaterias.getNombre() + " " + listaMaterias.getHoras());
            }
        }

        convertidorAlumnotoAlumnoModelMaestro(listaAlumno);
        //convertir los datos de alumno a alumno model
        //en lugar alumno va a ser alumno model en la impresion

    }
    //gUARDAR DATOS
    public void llenarAnimal(){
        List<Juguetes> juguetesListRufis = new ArrayList<>();
        juguetesListRufis.add(new Juguetes("Pelota", "Caucho"));
        juguetesListRufis.add(new Juguetes("Hueso", "Carnaza"));
        juguetesListRufis.add(new Juguetes("Modedera", "Plastico"));

        List<Juguetes> juguetesListBenji = new ArrayList<>();
        juguetesListBenji.add(new Juguetes("Peluche Pizza", "Tela"));
        juguetesListBenji.add(new Juguetes("Pollo", "Plastico"));
        juguetesListBenji.add(new Juguetes("Pescado", "Plastico"));

        List<Animal> animalLista = new ArrayList<>();
        animalLista.add(new Animal("Rufis", "Snachauzer", juguetesListRufis));
        animalLista.add(new Animal("Bengi", "Unica", juguetesListBenji));

        AnimalDAO.addAll(animalLista);
    }
        public void llenarCasa(){
        List<Habitaciones> habitacionCocina = new ArrayList<>();
        habitacionCocina.add(new Habitaciones("Cocina", "Estufa"));
        habitacionCocina.add(new Habitaciones("Cocina", "Horno de microondas"));

        List<Casa> casaLista = new ArrayList<>();
        casaLista.add(new Casa("Rizos",621, habitacionCocina));

            CasaDAO.addAll(casaLista);
    }




    public static List<Alumno> addAll(List<Alumno> modeloAlumno) {
        Realm realm;
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        List<AlumnoModel> modeloRealm ;
        modeloRealm = convertidorAlumnotoAlumnoModelMaestro(modeloAlumno);
        List<AlumnoModel> models;
        models = realm.copyToRealm(modeloRealm );
        realm.commitTransaction();
        //realm.close();
       List<Alumno> modeloResponde = null;
        return modeloResponde;
    }
    //modelo persona que guarde

    private static List<AlumnoModel>  convertidorAlumnotoAlumnoModelMaestro(List<Alumno> listAlumno) {

        RealmList<AlumnoModel> alumnoModelrealmLista = new RealmList<>();
        for (Alumno listaAlumnos : listAlumno) {
            AlumnoModel alumnoModel = new AlumnoModel();
            alumnoModel.setNombre(listaAlumnos.getNombre());
            alumnoModel.setEdad(listaAlumnos.getEdad());
            alumnoModel.setGrupo(listaAlumnos.getGrupo());

            RealmList<MaestroModel> listMaestroModel = new RealmList<>();
            for (Maestro listaMaestro : listaAlumnos.getMaestroModelList()) {
                MaestroModel maestroModel = new MaestroModel();
                maestroModel.setNombre(listaMaestro.getNombre());
                maestroModel.setEspecialidad(listaMaestro.getEspecialidad());
                maestroModel.setEdad(listaMaestro.getEdad());

                RealmList<AutoModel> listAutoModel = new RealmList<>();
                for (Auto listaAuto : listaMaestro.getAutoList()) {
                    AutoModel autoModel = new AutoModel();
                    autoModel.setModelo(listaAuto.getModelo());
                    autoModel.setAnio(listaAuto.getAnio());
                    autoModel.setMarca(listaAuto.getMarca());
                    listAutoModel.add(autoModel);
                }
                maestroModel.setAutoListModel(listAutoModel);
                listMaestroModel.add(maestroModel);

            }
            alumnoModel.setMaestroModelList(listMaestroModel);

            RealmList<MateriaModel> listMateriaModel = new RealmList<>();
            for (Materia listaMateria : listaAlumnos.getMateriaModelList()) {
                MateriaModel materiaModel = new MateriaModel();
                materiaModel.setNombre(listaMateria.getNombre());
                materiaModel.setHoras(listaMateria.getHoras());
                listMateriaModel.add(materiaModel);
            }
            //agregar toda la lista completa
            alumnoModel.setMateriaModelList(listMateriaModel);
          //agregar elementos a una lista con .add, elemento por elemento

        }

        return alumnoModelrealmLista;
    }
//lista materias igual a mismo nivel de maestro


}




