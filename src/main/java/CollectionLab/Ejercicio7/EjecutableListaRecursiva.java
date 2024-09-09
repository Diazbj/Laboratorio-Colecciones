package CollectionLab.Ejercicio7;

import CollectionLab.Model.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjecutableListaRecursiva {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Jordy",23,"M"));
        listaPersonas.add(new Persona("dav",10,"M"));
        listaPersonas.add(new Persona("dianb",5,"F"));
        listaPersonas.add(new Persona("jenn",45,"F"));
        listaPersonas.add(new Persona("fel",74,"M"));

        ArrayList<Persona> listaMayores = listaRecursiva(listaPersonas);

        for (Persona persona : listaMayores) {
            System.out.println(persona.getNombre());
        }

    }

    public static ArrayList<Persona> listaRecursiva(ArrayList<Persona> lista) {

        if (lista.isEmpty()) {
            return lista;
        }else {
            Persona primerPersona = lista.remove(0);

            ArrayList<Persona> listaMayores = listaRecursiva(lista);

            if(primerPersona.getEdad()>=18){

                listaMayores.add(0,primerPersona);
            }
            return listaMayores;
        }

    }
}
