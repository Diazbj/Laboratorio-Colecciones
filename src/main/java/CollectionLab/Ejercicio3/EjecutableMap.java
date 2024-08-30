package CollectionLab.Ejercicio3;

import CollectionLab.Model.Estudiante;

import java.util.HashMap;

public class EjecutableMap {

    public static void main(String[] args) {

        HashMap<Double, Estudiante> matriculaEstudiante=new HashMap<>();

        Estudiante estudiante1=new Estudiante("Jordy",31,"M",798.000);
        Estudiante estudiante2=new Estudiante("Fernando",56,"M",78.000);
        Estudiante estudiante3=new Estudiante("Aleja",28,"F" ,98.000);
        Estudiante estudiante4=new Estudiante("Diana",19,"F",8.000);

        matriculaEstudiante.put(estudiante1.getMatricula(),estudiante1);
        matriculaEstudiante.put(estudiante2.getMatricula(),estudiante2);
        matriculaEstudiante.put(estudiante3.getMatricula(),estudiante3);
        matriculaEstudiante.put(estudiante4.getMatricula(),estudiante4);

        System.out.println("Imprimir mapa de estudiantes");

        for(double clave:matriculaEstudiante.keySet()){
            Estudiante estudiante=matriculaEstudiante.get(clave);
            System.out.println("Matricula: " + clave+ " Estudiante: " + estudiante.getNombre());
        }

    }

}
