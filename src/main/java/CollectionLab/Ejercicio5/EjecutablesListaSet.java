package CollectionLab.Ejercicio5;

import CollectionLab.Ejercicio5.Util.ComparadorPorAlfabeto;

import java.util.*;

public class EjecutablesListaSet {
    public static void main(String[] args) {

        Set<String> coleccionSet = new HashSet<>();
        coleccionSet.add("A");
        coleccionSet.add("B");
        coleccionSet.add("A");
        coleccionSet.add("D");
        coleccionSet.add("E");
        coleccionSet.add("D");

        Iterator<String> iterador= coleccionSet.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        // Convertir el Set a una List
        List<String> lista = new ArrayList<>(coleccionSet);


        Collections.sort(lista,new ComparadorPorAlfabeto());
        System.out.println(lista);

        for (String elemento:lista) {
            System.out.println(elemento);

        }

        //buscar elemento en hashSet

        String elementoABuscar="D";

        if(coleccionSet.contains(elementoABuscar)){
            System.out.println("El elemento "+elementoABuscar +" Si esta en la coleccion");

        }else {
            System.out.println("El elemento "+ elementoABuscar +" no se encuentra en la coleccion");
        }

    }
}
