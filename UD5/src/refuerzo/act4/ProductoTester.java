/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo.act4;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ProductoTester {

    public void probarOrdenacion() {
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Producto("P003", "Zapato", 49.99));
        lista.add(new Producto("P001", "Camisa", 19.99));
        lista.add(new Producto("P005", "Sombrero", 15.00));
        lista.add(new Producto("P002", "Chaqueta", 59.99));
        lista.add(new Producto("P004", "Pantalón", 29.50));

        System.out.println("=== Lista ORIGINAL (desordenada) ===");
        for (Producto p : lista) {
            System.out.println(p);
        }

        Collections.sort(lista);
        System.out.println("\n=== Lista ORDENADA con Collections.sort() ===");
        for (Producto p : lista) {
            System.out.println(p);
        }

        TreeSet<Producto> set = new TreeSet<>();
        set.addAll(lista);

        System.out.println("\n=== TreeSet (orden natural automático) ===");
        for (Producto p : set) {
            System.out.println(p);
        }
    }
}
