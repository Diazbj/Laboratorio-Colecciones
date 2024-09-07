package CollectionLab.Ejercicio5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ListaSinDuplicar {
    public static void main(String[] args) {

        Set<String> lista = new HashSet<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("C");

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }
}
