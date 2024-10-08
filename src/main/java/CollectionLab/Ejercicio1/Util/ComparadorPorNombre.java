package CollectionLab.Ejercicio1.Util;

import CollectionLab.Model.Persona;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}
