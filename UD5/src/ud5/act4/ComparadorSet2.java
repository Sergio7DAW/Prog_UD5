/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act4;

/**
 *
 * @author 1DAW2425-09
 */
import java.util.*;

public class ComparadorSet2 {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Agregar elementos a cada Set
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Medir tiempo de inserción
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());

        // Medir tiempo de búsqueda
        medirTiempoBusqueda(hashSet, "Python");
        medirTiempoBusqueda(treeSet, "Python");
        medirTiempoBusqueda(linkedHashSet, "Python");

        // Escenarios prácticos con cada Set
        escenarioHashSet();
        escenarioTreeSet();
        escenarioLinkedHashSet();
    }

    // Método para medir el tiempo de inserción en cada Set
    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }

    // Método para medir el tiempo de búsqueda en un Set
    private static void medirTiempoBusqueda(Set<String> set, String elemento) {
        long inicio = System.nanoTime();
        boolean encontrado = set.contains(elemento);
        long fin = System.nanoTime();
        System.out.println("Tiempo de búsqueda en " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns (Encontrado: " + encontrado + ")");
    }

    // Escenario 1: HashSet para códigos únicos de productos
    private static void escenarioHashSet() {
        Set<String> inventario = new HashSet<>();
        inventario.add("P001");
        inventario.add("P002");
        inventario.add("P003");
        inventario.add("P004");

        System.out.println("\nInventario de productos (HashSet): " + inventario);
        System.out.println("¿Existe el producto P003? " + inventario.contains("P003"));
    }

    // Escenario 2: TreeSet para lista ordenada de estudiantes
    private static void escenarioTreeSet() {
        Set<String> estudiantes = new TreeSet<>();
        estudiantes.add("Carlos");
        estudiantes.add("Ana");
        estudiantes.add("Pedro");
        estudiantes.add("Beatriz");

        System.out.println("\nLista de estudiantes ordenada (TreeSet): " + estudiantes);
    }

    // Escenario 3: LinkedHashSet para historial de páginas visitadas
    private static void escenarioLinkedHashSet() {
        Set<String> historial = new LinkedHashSet<>();
        historial.add("www.google.com");
        historial.add("www.facebook.com");
        historial.add("www.github.com");
        historial.add("www.google.com"); // No se duplica

        System.out.println("\nHistorial de navegación (LinkedHashSet): " + historial);
    }
}
