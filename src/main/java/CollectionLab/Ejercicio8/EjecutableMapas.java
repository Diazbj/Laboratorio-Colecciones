package CollectionLab.Ejercicio8;

import java.util.HashMap;
import java.util.Map;

public class EjecutableMapas {

    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "A");
        mapa.put(2, "B");
        mapa.put(3, "C");
        mapa.put(4, "D");
        mapa.put(5, "E");
        mapa.put(6, "F");
        mapa.put(7, "G");
        mapa.put(8, "H");
        mapa.put(9, "I");
        mapa.put(10, "J");

        HashMap<Integer, String> mapaFiltrado = ClavePar(mapa);
        System.out.println(mapaFiltrado); // Output esperado: {2=B, 4=D, 6=F, 8=H, 10=J}
    }

    public static HashMap<Integer, String> ClavePar(HashMap<Integer, String> mapa) {
        // Crea un nuevo mapa para almacenar los elementos filtrados
        return ClaveParRecursivo(new HashMap<>(mapa));
    }

    // Método recursivo para filtrar las claves pares
    private static HashMap<Integer, String> ClaveParRecursivo(HashMap<Integer, String> mapa) {
        // Caso base: si el mapa está vacío, devuelve un nuevo mapa vacío
        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        // Obtiene la primera entrada del mapa usando un iterador
        Map.Entry<Integer, String> entrada = mapa.entrySet().iterator().next();

        // Crea un nuevo mapa para continuar la recursión sin modificar el original
        mapa.remove(entrada.getKey());
        HashMap<Integer, String> mapaFiltrado = ClaveParRecursivo(mapa);

        // Si la clave es par, se agrega al nuevo mapa filtrado
        if (entrada.getKey() % 2 == 0) {
            mapaFiltrado.put(entrada.getKey(), entrada.getValue());
        }

        return mapaFiltrado;
    }
}