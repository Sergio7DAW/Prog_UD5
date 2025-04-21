/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act14;

/**
 *
 * @author usuario
 */
import java.util.*;
public class act14 {
    public static void main(String[] args) {
        // Crear una colección de tipo ArrayList con elementos Integer
        List<Integer> numeros = new ArrayList<>(Arrays.asList(10, 5, 3, 8, 2, 7, 1));

        System.out.println("Original: " + numeros);

        // Desordenar la colección
        Collections.shuffle(numeros);
        System.out.println("Desordenado: " + numeros);

        // Ordenar en orden ascendente
        Collections.sort(numeros);
        System.out.println("Ordenado ascendente: " + numeros);

        // Darle la vuelta (orden inverso)
        Collections.reverse(numeros);
        System.out.println("Orden inverso: " + numeros);

        // Buscar un elemento (por ejemplo, el número 5)
        int elementoBuscado = 5;
        if (numeros.contains(elementoBuscado)) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la lista.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en la lista.");
        }

        // Crear una lista a partir de un array
        Integer[] arrayNumeros = {100, 200, 300, 400};
        List<Integer> listaDesdeArray = Arrays.asList(arrayNumeros);
        System.out.println("Lista creada desde array: " + listaDesdeArray);
    }
}
