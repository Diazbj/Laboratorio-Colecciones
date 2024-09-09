package CollectionLab.Ejercicio6;

import CollectionLab.Model.Tarea;

import java.util.PriorityQueue;

public class EjecutableQueueTareas {

    public static void main(String[] args) {
        // Creamos una PriorityQueue de Tarea
        PriorityQueue<Tarea> colaDeTareas = new PriorityQueue<>(new ComparadorPorSecuencia());

        // Añadimos tareas a la cola con diferentes prioridades
        colaDeTareas.add(new Tarea("Tarea 1 - Baja prioridad", 3,1));
        colaDeTareas.add(new Tarea("Tarea 2 - Alta prioridad", 1,4));
        colaDeTareas.add(new Tarea("Tarea 3 - Media prioridad", 2,2));



        // Procesamos las tareas según su prioridad (de menor a mayor)
        while (!colaDeTareas.isEmpty()) {
            // Removemos y mostramos la tarea con mayor prioridad
            System.out.println("Procesando: " + colaDeTareas.poll().getDescripcion());
        }
    }
}
