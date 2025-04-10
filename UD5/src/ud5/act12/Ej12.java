/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act12;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author 1DAW2425-09
 */
public class Ej12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> diccionario;

        // Elegir implementación
        System.out.println(
                "Elige la implementación del diccionario:");
        System.out.println(
                "1 - HashMap");
        System.out.println(
                "2 - LinkedHashMap");
        System.out.println(
                "3 - TreeMap");
        int opcion = scanner.nextInt();

        scanner.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1:
                diccionario = new HashMap<>();
                break;
            case 2:
                diccionario = new LinkedHashMap<>();
                break;
            case 3:
                diccionario = new TreeMap<>();
                break;
            default:
                System.out.println("Opción no válida. Se usará HashMap por defecto.");
                diccionario = new HashMap<>();
        } // Poblar el diccionario con 5 entradas
        diccionario
                .put(
                        "ent", "Número entero");
        diccionario.put(
                "dec", "Número decimal");
        diccionario.put(
                "cad", "Cadena");
        diccionario.put(
                "log", "Lógico");
        diccionario.put(
                "bucle", "Estructura repetición");

        // Añadir valor duplicado con distinta clave
        diccionario.put(
                "bool", "Lógico"); // mismo valor que "log" pero distinta clave

        // Añadir valor nuevo con clave duplicada (sobrescribe)
        diccionario.put(
                "log", "Valor sobrescrito");

        // Comprobar si está presente antes de eliminar
        if (diccionario.containsKey(
                "log")) {
            diccionario.remove("log");
            System.out.println("Elemento con clave 'log' eliminado.");
        }

        // Obtener valor de una clave específica
        String valorCad = diccionario.get("cad");

        System.out.println(
                "Valor de la clave 'cad': " + valorCad);

        // Reemplazar valor
        diccionario.put(
                "cad", "Cadena de texto");

        // Recorrer el diccionario con iterador
        Iterator<Map.Entry<String, String>> it = diccionario.entrySet().iterator();

        System.out.println(
                "\nDiccionario completo:");
        while (it.hasNext()) {
            Map.Entry<String, String> entrada = it.next();
            System.out.println("Clave: " + entrada.getKey() + " -> Valor: " + entrada.getValue());

            // Intentar añadir un valor null durante la iteración
            try {
                diccionario.put(null, null);
            } catch (ConcurrentModificationException e) {
                System.out.println("No se puede modificar el diccionario durante la iteración.");
            }
        }

        // Mostrar contenido final del diccionario
        System.out.println(
                "\nDiccionario Final:");
        for (Map.Entry<String, String> entry
                : diccionario.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " -> Valor: " + entry.getValue());
        }
    }
}
