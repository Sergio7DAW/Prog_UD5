/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author 1DAW2425-09
 */
public class Main {
    public static void main(String[] args) {
         // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", "Pérez", 25));
        personas.add(new Persona("Ana", "González", 30));
        personas.add(new Persona("Luis", "", 22));  // Persona sin apellido
        personas.add(new Persona("Marta", "López", 28));
        personas.add(new Persona("Pedro", "Martínez", 35));

        // Mostrar lista original
        System.out.println("Lista original de personas:");
        mostrarLista(personas);

        // Comparador por edad
        Comparator<Persona> comparadorPorEdad = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        };

        // Ordenar por edad
        Collections.sort(personas, comparadorPorEdad);
        System.out.println("\nLista ordenada por edad:");
        mostrarLista(personas);

        // Comparador por apellidos
        Comparator<Persona> comparadorPorApellido = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getApellido().compareTo(p2.getApellido());
            }
        };

        // Ordenar por apellidos
        Collections.sort(personas, comparadorPorApellido);
        System.out.println("\nLista ordenada por apellido:");
        mostrarLista(personas);

        // Comparador por apellidos, nombre y edad
        Comparator<Persona> comparadorPorApellidoNombreEdad;
        comparadorPorApellidoNombreEdad = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                // Primero comparo los apellidos
                int resultadoApellido = p1.getApellido().compareTo(p2.getApellido());
                if (resultadoApellido != 0) {
                    return resultadoApellido;
                }

                // Si los apellidos son iguales, comparo los nombres
                int resultadoNombre = p1.getNombre().compareTo(p2.getNombre());
                if (resultadoNombre != 0) {
                    return resultadoNombre;
                }

                // Si el nombre también es igual, comparo las edades
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        };

        // Ordenar por apellidos, nombre y edad
        Collections.sort(personas, comparadorPorApellidoNombreEdad);
        System.out.println("\nLista ordenada por apellidos, nombre y edad:");
        mostrarLista(personas);

        // Ampliación: personas sin apellido primero
        Comparator<Persona> comparadorConSinApellidoPrimero = new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                // Si p1 no tiene apellido, debe ir primero
                if (p1.getApellido().isEmpty() && !p2.getApellido().isEmpty()) {
                    return -1;
                }
                if (!p1.getApellido().isEmpty() && p2.getApellido().isEmpty()) {
                    return 1;
                }

                // Si ambos tienen apellido o ninguno, usar el comparador anterior
                return comparadorPorApellidoNombreEdad.compare(p1, p2);
            }
        };

        // Ordenar con la ampliación
        Collections.sort(personas, comparadorConSinApellidoPrimero);
        System.out.println("\nLista con personas sin apellido primero:");
        mostrarLista(personas);
    }

    // Método para mostrar la lista de personas
    public static void mostrarLista(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    
    }
}
