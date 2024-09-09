package CollectionLab.Ejercicio6;

import CollectionLab.Model.Tarea;

import java.util.Comparator;

public class ComparadorPorSecuencia implements Comparator<Tarea> {

    @Override
    public int compare(Tarea t1, Tarea t2) {
        return t1.getSecuencia() - t2.getSecuencia();
    }
}
