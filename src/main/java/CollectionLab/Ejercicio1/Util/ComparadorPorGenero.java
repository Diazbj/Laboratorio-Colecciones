package CollectionLab.Ejercicio1.Util;

import CollectionLab.Model.Persona;

import java.util.Comparator;

public class ComparadorPorGenero implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getGenero().compareTo(persona2.getGenero());
    }
}
