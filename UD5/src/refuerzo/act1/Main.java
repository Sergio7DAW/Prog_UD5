/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo.act1;

/**
 *
 * @author usuario
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crear algunos libros (con duplicados)
        Libro l1 = new Libro("123", "El Quijote", "Cervantes");
        Libro l2 = new Libro("456", "Cien Años de Soledad", "Gabriel García Márquez");
        Libro l3 = new Libro("789", "Rayuela", "Cortázar");
        Libro l4 = new Libro("234", "La sombra del viento", "Carlos Ruiz Zafón");
        Libro l5 = new Libro("123", "El Quijote", "Cervantes"); // duplicado
        Libro l6 = new Libro("567", "Pedro Páramo", "Juan Rulfo");

        // HashSet (no garantiza orden)
        Set<Libro> hashSet = new HashSet<>();
        Collections.addAll(hashSet, l1, l2, l3, l4, l5, l6);

        // LinkedHashSet (mantiene el orden de inserción)
        Set<Libro> linkedHashSet = new LinkedHashSet<>();
        Collections.addAll(linkedHashSet, l3, l2, l6, l1, l4, l5); // distinto orden

        // TreeSet (orden natural por ISBN)
        Set<Libro> treeSet = new TreeSet<>();
        Collections.addAll(treeSet, l6, l3, l1, l2, l5, l4); // otro orden

        System.out.println("➡️ HashSet:");
        hashSet.forEach(System.out::println);

        System.out.println("\n➡️ LinkedHashSet:");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\n➡️ TreeSet:");
        treeSet.forEach(System.out::println);

        System.out.println("\n🎓 Diferencias observadas:");
        System.out.println("- HashSet no mantiene ningún orden específico.");
        System.out.println("- LinkedHashSet mantiene el orden en que fueron añadidos.");
        System.out.println("- TreeSet ordena automáticamente por ISBN (orden natural).");
        System.out.println("- Ninguno de los sets permite duplicados (según equals/hashCode o compareTo).");
    }
}