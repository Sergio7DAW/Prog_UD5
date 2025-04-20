/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act3;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author usuario
 */
public class GestorTareas {
     private PriorityQueue<Tarea> tareas;

    public GestorTareas() {
        tareas = new PriorityQueue<>(new Comparator<Tarea>() {
            @Override
            public int compare(Tarea t1, Tarea t2) {
                if (t1.getPrioridad() != t2.getPrioridad()) {
                    return Integer.compare(t1.getPrioridad(), t2.getPrioridad()); // Prioridad más baja = más urgente
                } else {
                    return t1.getFechaCreacion().compareTo(t2.getFechaCreacion()); // Más antigua primero
                }
            }
        });
    }

    public void agregarTarea(String descripcion, int prioridad) {
        Tarea nueva = new Tarea(descripcion, prioridad);
        tareas.add(nueva);
        System.out.println("Tarea agregada: " + nueva);
    }

    public Tarea obtenerProximaTarea() {
        return tareas.poll(); // Devuelve y elimina la tarea con mayor prioridad y más antigua
    }

    public boolean estaVacia() {
        return tareas.isEmpty();
    }
}
