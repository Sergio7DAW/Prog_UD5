/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo.act2;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaTester {

    public void probarRendimiento() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("==== Añadiendo al FINAL ====");
        long tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("ArrayList - Añadir al final: " + (tiempoFinal - tiempoInicio) + " ms");

        tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("LinkedList - Añadir al final: " + (tiempoFinal - tiempoInicio) + " ms");

        System.out.println("\n==== Añadiendo al PRINCIPIO ====");
        tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(0, i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("ArrayList - Añadir al principio: " + (tiempoFinal - tiempoInicio) + " ms");

        tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(0, i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("LinkedList - Añadir al principio: " + (tiempoFinal - tiempoInicio) + " ms");

        System.out.println("\n==== Recorrido con get(index) ====");
        tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("ArrayList - Recorrido: " + (tiempoFinal - tiempoInicio) + " ms");

        tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("LinkedList - Recorrido: " + (tiempoFinal - tiempoInicio) + " ms");
    }
}
