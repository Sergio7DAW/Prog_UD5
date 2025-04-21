/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo.act3;

/**
 *
 * @author usuario
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapaTester {

    public void explorarMapas() {
        // Inserciones no secuenciales
        int[] claves = {42, 15, 73, 8, 60, 31, 90};
        String[] nombres = {"Ana", "Luis", "Carlos", "Bea", "Marta", "Sofía", "Juan"};

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        for (int i = 0; i < claves.length; i++) {
            hashMap.put(claves[i], nombres[i]);
            linkedHashMap.put(claves[i], nombres[i]);
            treeMap.put(claves[i], nombres[i]);
        }

        System.out.println("=== HashMap ===");
        for (Map.Entry<Integer, String> entrada : hashMap.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        System.out.println("\n=== LinkedHashMap ===");
        for (Map.Entry<Integer, String> entrada : linkedHashMap.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

        System.out.println("\n=== TreeMap ===");
        for (Map.Entry<Integer, String> entrada : treeMap.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}