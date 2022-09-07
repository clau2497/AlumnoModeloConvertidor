package com.example.alumnomodelolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.alumnomodelolist.Alumno.Alumno;
import com.example.alumnomodelolist.Alumno.AlumnoModel;
import com.example.alumnomodelolist.Maestro.Auto.Auto;
import com.example.alumnomodelolist.Maestro.Auto.AutoModel;
import com.example.alumnomodelolist.Maestro.Maestro;
import com.example.alumnomodelolist.Maestro.MaestroModel;
import com.example.alumnomodelolist.Materia.Materia;
import com.example.alumnomodelolist.Materia.MateriaModel;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    private List<AlumnoModel> convertidorAlumnotoAlumnoModelMaestro(List<Alumno> listAlumno) {
        List<AlumnoModel> alumnoModelList = new ArrayList<>();
        for (Alumno listaAlumnos : listAlumno) {
            AlumnoModel alumnoModel = new AlumnoModel();
            alumnoModel.setNombre(listaAlumnos.getNombre());
            alumnoModel.setEdad(listaAlumnos.getEdad());
            alumnoModel.setGrupo(listaAlumnos.getGrupo());
            List<MaestroModel> listMaestroModel = new ArrayList<>();
            for (Maestro listaMaestro : listaAlumnos.getMaestroModelList()) {
                MaestroModel maestroModel = new MaestroModel();
                maestroModel.setNombre(listaMaestro.getNombre());
                maestroModel.setEspecialidad(listaMaestro.getEspecialidad());
                maestroModel.setEdad(listaMaestro.getEdad());
                List<AutoModel> listAutoModel = new ArrayList<>();
                for (Auto listaAuto : listaMaestro.getAutoList()) {
                    AutoModel autoModel = new AutoModel();
                    autoModel.setModelo(listaAuto.getModelo());
                    autoModel.setAnio(listaAuto.getAnio());
                    autoModel.setMarca(listaAuto.getMarca());
                   // System.out.println("Alumno" + listaAlumnos.getNombre() +);
                    listAutoModel.add(autoModel);
                }
                maestroModel.setAutoListModel(listAutoModel);
                listMaestroModel.add(maestroModel);

            }
            alumnoModel.setMaestroModelList(listMaestroModel);

            List<MateriaModel> listMateriaModel = new ArrayList<>();
            for (Materia listaMateria : listaAlumnos.getMateriaModelList()) {
                MateriaModel materiaModel = new MateriaModel();
                materiaModel.setNombre(listaMateria.getNombre());
                materiaModel.setHoras(listaMateria.getHoras());
                listMateriaModel.add(materiaModel);
            }
            alumnoModel.setMateriaModelList(listMateriaModel);

        }
        return alumnoModelList;
    }
//lista materias igual a mismo nivel de maestro


}




