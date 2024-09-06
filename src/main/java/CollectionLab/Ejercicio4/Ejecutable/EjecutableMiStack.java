package CollectionLab.Ejercicio4.Ejecutable;

import CollectionLab.Model.MiStack;

public class EjecutableMiStack {

    public static void main(String[] args) {

        MiStack<Object> pila = new MiStack<>(); // Usa `Object` para permitir tipos múltiples.

        // Intentamos insertar elementos de diferentes tipos.

        pila.push(2);
        pila.push("Pila"); // Inserta correctamente porque la pila está vacía.
        pila.push("rojo"); // Inserta porque es del mismo tipo (String).
        pila.push(10);     // No se inserta porque el tipo es Integer y el último fue String.

        // Imprimimos el contenido actual de la pila.
        pila.imprimirPila();
    }
}
