package CollectionLab.Ejercicio1.Util;

import CollectionLab.Model.Persona;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getEdad() - persona2.getEdad();
    }
}
