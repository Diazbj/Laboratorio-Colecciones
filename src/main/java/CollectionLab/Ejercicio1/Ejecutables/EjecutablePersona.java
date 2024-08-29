package CollectionLab.Ejercicio1.Ejecutables;

import CollectionLab.Ejercicio1.Model.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjecutablePersona {
    public static void main(String[] args) {

        List<Persona> listaPersonas=new ArrayList<Persona>();
        Persona persona1 =new Persona("jordy",31,"M");
        Persona persona2 = new Persona("Diana",25,"F");
        Persona persona3 = new Persona("sofia",19,"F");
        Persona persona4 =new Persona("Andres",50,"M");

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);

//        Persona[] personas = {persona1, persona2, persona3};
//
//        // Usando un for-each para agregar cada persona a la lista
//        for (Persona persona : personas) {
//            listaPersonas.add(persona);
//        }

        System.out.println("Lista original");
        imprimirLista(listaPersonas);

        Collections.sort(listaPersonas);

        System.out.println("Lista Ordenado");
        imprimirLista(listaPersonas);




    }

    public static void imprimirLista(List<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre());
        }
    }
}
