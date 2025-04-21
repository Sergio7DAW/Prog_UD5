/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act4;

/**
 *
 * @author usuario
 */
import java.util.*;

public class act4 {
      public static void main(String[] args) {
        // Lista inicial con posibles duplicados
        List<Contacto> listaInicial = Arrays.asList(
            new Contacto("Ana", "ana@mail.com", "123456789"),
            new Contacto("Luis", "luis@mail.com", "234567890"),
            new Contacto("Elena", "elena@mail.com", "345678901"),
            new Contacto("Carlos", "carlos@mail.com", "456789012"),
            new Contacto("Ana M", "ana@mail.com", "999999999"),  // Duplicado (por email)
            new Contacto("Raúl", "raul@mail.com", "567890123"),
            new Contacto("Eva", "eva@mail.com", "678901234"),
            new Contacto("A", "a@mail.com", "000000000")
        );

        // Usar un LinkedHashSet para mantener el orden de inserción y eliminar duplicados por email
        Set<Contacto> contactosUnicos = new LinkedHashSet<>(listaInicial);

        // Convertir a lista para ordenarla
        List<Contacto> contactosOrdenados = new ArrayList<>(contactosUnicos);

        // Ordenación personalizada:
        // 1. Por longitud del nombre (ascendente)
        // 2. Si tienen la misma longitud, orden alfabético
        contactosOrdenados.sort(Comparator
                .comparingInt((Contacto c) -> c.getNombre().length())
                .thenComparing(Contacto::getNombre));

        // Mostrar resultado final
        System.out.println("Lista final de contactos únicos y ordenados:");
        for (Contacto contacto : contactosOrdenados) {
            System.out.println(contacto);
        }
    } 
}
