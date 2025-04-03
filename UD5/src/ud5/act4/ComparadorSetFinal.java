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

public class ComparadorSetFinal {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby", "Java"));
        Set<String> treeSet = new TreeSet<>(hashSet);
        Set<String> linkedHashSet = new LinkedHashSet<>(hashSet);

        // Mostrar elementos con Iterator
        System.out.println("\n--- Iteración con Iterator ---");
        mostrarElementosConIterador(hashSet);
        mostrarElementosConIterador(treeSet);
        mostrarElementosConIterador(linkedHashSet);

        // Medir rendimiento de iteración
        medirTiempoIteracion(hashSet);
        medirTiempoIteracion(treeSet);
        medirTiempoIteracion(linkedHashSet);

        // Modificación durante iteración
        eliminarParesDuranteIteracion();

        // Escenarios prácticos con iteradores
        historialNavegacionConIterador();
    }

    // Método para mostrar elementos con Iterator
    private static void mostrarElementosConIterador(Set<String> set) {
        System.out.println("Recorriendo " + set.getClass().getSimpleName() + ":");
        Iterator<String> it = set.iterator();
        int count = 1;
        while (it.hasNext()) {
            System.out.println("Elemento #" + count + ": " + it.next());
            count++;
        }
    }

    // Método para medir el tiempo de iteración
    private static void medirTiempoIteracion(Set<String> set) {
        long inicio = System.nanoTime();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de iteración para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }

    // Modificación durante iteración: Eliminar pares y agregar 1000
    private static void eliminarParesDuranteIteracion() {
        TreeSet<Integer> numeros = new TreeSet<>();
        Random rand = new Random();
        while (numeros.size() < 10) {
            numeros.add(rand.nextInt(100) + 1);
        }
        System.out.println("\nTreeSet original: " + numeros);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove(); // Correcto: evitar ConcurrentModificationException
            }
            // Intento de agregar 1000 durante iteración (provocará excepción)
            // numeros.add(1000);
        }
        System.out.println("TreeSet después de eliminar pares: " + numeros);
    }

    // Escenario práctico: Historial de navegación con Iterator
    private static void historialNavegacionConIterador() {
        LinkedHashSet<String> historial = new LinkedHashSet<>(Arrays.asList(
                "google.com", "perplexity.ai", "stackoverflow.com", "github.com"));

        System.out.println("\nHistorial de navegación:");
        Iterator<String> it = historial.iterator();
        while (it.hasNext()) {
            String pagina = it.next();
            System.out.println("- " + pagina);
            if (pagina.contains("stackoverflow")) {
                System.out.println("🔍 Encontrado recurso de ayuda: " + pagina);
            }
        }
    }
}
