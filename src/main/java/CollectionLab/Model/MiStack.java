package CollectionLab.Model;

import java.util.Stack;

public class MiStack<Objeto> {

    private Stack<Objeto> stack;

    public MiStack() {
        this.stack = new Stack<>();
    }

    public void push(Objeto objeto) {
        // Si la pila está vacía, se permite insertar cualquier objeto.
        if (stack.isEmpty()) {
            stack.push(objeto);
            System.out.println("Elemento '" + objeto + "' insertado en la pila.");
        } else {
            // Si la pila no está vacía, verifica si el tipo del objeto coincide con el de la cima.
            Objeto cima = stack.peek();
            if (objeto.getClass().equals(cima.getClass())) {
                stack.push(objeto);
                System.out.println("Elemento '" + objeto + "' insertado en la pila.");
            } else {
                System.out.println("El objeto no puede ser insertado porque no coincide con el tipo del elemento en la cima.");
            }
        }
    }

    // Método adicional para imprimir el contenido de la pila, para depuración.
    public void imprimirPila() {
        System.out.println("Contenido de la pila: " + stack);
    }

}