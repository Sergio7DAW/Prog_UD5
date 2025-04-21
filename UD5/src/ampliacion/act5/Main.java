/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act5;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(5);

        // Insertar valores
        cache.putValor("A", "Apple");
        cache.putValor("B", "Banana");
        cache.putValor("C", "Cherry");
        cache.putValor("D", "Date");
        cache.putValor("E", "Elderberry");

        cache.mostrarCache();

        System.out.println("\nAccediendo a C y A...");
        cache.getValor("C");
        cache.getValor("A");

        cache.mostrarCache();

        System.out.println("\nAgregando F (debería eliminar el menos usado: B)");
        cache.putValor("F", "Fig");

        cache.mostrarCache();

        System.out.println("\nObteniendo valor de A: " + cache.getValor("A"));
        System.out.println("Obteniendo valor de B (ya eliminado): " + cache.getValor("B"));
    }
}
