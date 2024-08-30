package CollectionLab.Ejercicio1.Ejecutables;

import CollectionLab.Model.Persona;
import CollectionLab.Ejercicio1.Util.ComparadorPorEdad;
import CollectionLab.Ejercicio1.Util.ComparadorPorGenero;
import CollectionLab.Ejercicio1.Util.ComparadorPorNombre;

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
        System.out.println("Lista Ordenado por nombre 1 ");
        imprimirLista(listaPersonas);


        ordenarPorEdad(listaPersonas);
        System.out.println("Lista Ordenado edad 1 ");
        imprimirLista(listaPersonas);

        Collections.sort(listaPersonas,new ComparadorPorNombre());
        System.out.println("Lista Ordenado nombre 2 ");
        imprimirLista(listaPersonas);

        Collections.sort(listaPersonas,new ComparadorPorEdad());
        System.out.println("Lista Ordenado edad 2 ");
        imprimirLista(listaPersonas);

        Collections.sort(listaPersonas,new ComparadorPorGenero());
        System.out.println("Lista Ordenado genero 1 ");
        imprimirLista(listaPersonas);



    }

    public static void imprimirLista(List<Persona> listaPersonas) {
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre());
        }
    }

    public static void ordenarPorEdad(List<Persona> personas) {
        Collections.sort(personas, (p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
    }
}
