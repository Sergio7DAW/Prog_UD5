/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act10;

import java.util.*;

/**
 *
 * @author 1DAW2425-09
 */
public class act10 {
    public static void main(String[] args) {
        
      // 1. Declarar e inicializar la lista con al menos 10 enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            numeros.add(i);
        }

        // Mostrar la lista original
        System.out.println("Lista original:");
        System.out.println(numeros);

        // 2. Recorrido hacia adelante
        ListIterator<Integer> it = numeros.listIterator();
        System.out.println("\nRecorrido hacia adelante:");
        while (it.hasNext()) {
            int index = it.nextIndex();
            int valor = it.next();
            System.out.println("Índice: " + index + ", Valor: " + valor);

            // 3. Multiplicar por 2 si el valor es mayor que 50
            if (valor > 50) {
                int nuevoValor = valor * 2;
                it.set(nuevoValor);
                System.out.println(" -> Valor > 50, se actualiza a: " + nuevoValor);
            }
        }

        // Mostrar la lista tras modificaciones
        System.out.println("\nLista después de modificar valores > 50:");
        System.out.println(numeros);

        // 4. Recorrido hacia atrás
        System.out.println("\nRecorrido hacia atrás:");
        while (it.hasPrevious()) {
            int index = it.previousIndex();
            int valor = it.previous();
            System.out.println("Índice: " + index + ", Valor: " + valor);

            // 5. Insertar 25 después de valores < 30
            if (valor < 30) {
                it.add(25);
                System.out.println(" -> Valor < 30, se inserta 25 después");
                // El iterador se queda antes del elemento recién insertado,
                // así que lo avanzamos una vez para evitar bucles infinitos
                it.previous();
            }
        }

        // Mostrar la lista final
        System.out.println("\nLista final después de todas las modificaciones:");
        System.out.println(numeros);
    }
}
