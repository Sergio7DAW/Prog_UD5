/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act15;

/**
 *
 * @author usuario
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Crear la baraja
        List<Carta> baraja = new ArrayList<>();

        for (Palo palo : Palo.values()) {
            for (int i = 1; i <= 13; i++) {
                baraja.add(new Carta(i, palo));
            }
        }

        System.out.println("Baraja original:");
        mostrarCartas(baraja);

        // Barajar la baraja
        Collections.shuffle(baraja);
        System.out.println("\nBaraja mezclada:");
        mostrarCartas(baraja);

        // Repartir 5 cartas
        List<Carta> mano = baraja.subList(0, 5);
        System.out.println("\nMano repartida:");
        mostrarCartas(mano);

        // Ordenar la mano por valor y luego por palo
        mano.sort(Comparator
                .comparingInt(Carta::getValor)
                .thenComparing(c -> c.getPalo().toString()));

        System.out.println("\nMano ordenada:");
        mostrarCartas(mano);
    }

    // Método para mostrar cartas
    public static void mostrarCartas(List<Carta> cartas) {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
