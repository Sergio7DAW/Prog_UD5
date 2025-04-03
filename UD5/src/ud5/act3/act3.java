/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act3;

/**
 *
 * @author 1DAW2425-09
 */
import java.util.TreeSet;

public class act3 {
 public static void main(String[] args) {
        // Conjunto de números enteros
        TreeSet<Integer> numeros = new TreeSet<>();

        // Agregando números en orden aleatorio
        numeros.add(15);
        numeros.add(3);
        numeros.add(10);

        // Imprimiendo los números ordenados
        System.out.println("Números ordenados: " + numeros);

        // Conjunto de nombres de alumnos
        TreeSet<String> alumnos = new TreeSet<>();

        // Agregando nombres en orden aleatorio
        alumnos.add("Carlos");
        alumnos.add("Ana");
        alumnos.add("Pedro");

        // Imprimiendo los nombres ordenados
        System.out.println("Nombres ordenados: " + alumnos);
    }    
}
