/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act11;

/**
 *
 * @author 1DAW2425-09
 */
import java.util.*;

public class act11 {
    public static void main(String[] args) {
        
            // 1. Crear la cola de tareas utilizando LinkedList
        LinkedList<String> tareas = new LinkedList<>();

        // 2. Añadir al menos 5 tareas iniciales a la cola
        tareas.addLast("Lavar los platos");
        tareas.addLast("Hacer la compra");
        tareas.addLast("Estudiar Java");
        tareas.addLast("Ir al gimnasio");
        tareas.addLast("Leer un libro");

        // 3. Mostrar todas las tareas
        System.out.println("Tareas pendientes iniciales:");
        mostrarTareas(tareas);

        // 4. Añadir una nueva tarea
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce una nueva tarea: ");
        String nuevaTarea = sc.nextLine();
        tareas.addLast(nuevaTarea);

        // 5. Completar una tarea (eliminar la primera)
        String tareaCompletada = tareas.removeFirst();
        System.out.println("\nTarea completada: " + tareaCompletada);

        // 6. Consultar la próxima tarea (sin eliminarla)
        String proximaTarea = tareas.getFirst();
        System.out.println("\nLa próxima tarea por completar es: " + proximaTarea);

        // 7. Añadir una tarea urgente al principio
        System.out.print("\nIntroduce una tarea urgente: ");
        String tareaUrgente = sc.nextLine();
        tareas.addFirst(tareaUrgente);

        // 8. Mostrar el estado final de la cola
        System.out.println("\nEstado final de las tareas pendientes:");
        mostrarTareas(tareas);
    }

    // Método para mostrar todas las tareas
    public static void mostrarTareas(LinkedList<String> tareas) {
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
    
}
