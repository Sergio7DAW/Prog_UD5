/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act13;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author 1DAW2425-09
 */
public class Ej13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        // Eliminar signos de puntuación y pasar a minúsculas
        texto = texto.replaceAll("[.,;:!?¡¿\"()\\[\\]{}]", "").toLowerCase();

        // Dividir el texto en palabras
        String[] palabras = texto.split("\\s+");

        // Usamos TreeMap para mantener orden alfabético automáticamente
        Map<String, Integer> frecuenciaPalabras = new TreeMap<>();

        // Contar frecuencias
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
            }
        }

        // Mostrar resultado
        System.out.println("\nFrecuencia de palabras:");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}
