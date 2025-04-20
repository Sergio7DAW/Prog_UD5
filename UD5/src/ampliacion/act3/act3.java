/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act3;

/**
 *
 * @author usuario
 */
public class act3 {
     public static void main(String[] args) throws InterruptedException {
        GestorTareas gestor = new GestorTareas();

        gestor.agregarTarea("Hacer compras", 3);
        Thread.sleep(1000); // Para diferenciar la fecha de creación
        gestor.agregarTarea("Estudiar para el examen", 1);
        Thread.sleep(1000);
        gestor.agregarTarea("Llamar al médico", 1);
        gestor.agregarTarea("Lavar el auto", 4);

        System.out.println("\nObteniendo tareas por orden de prioridad:");
        while (!gestor.estaVacia()) {
            Tarea tarea = gestor.obtenerProximaTarea();
            System.out.println("-> Próxima tarea: " + tarea);
        }
    } 
}
