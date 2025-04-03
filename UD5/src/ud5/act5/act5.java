/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act5;

/**
 *
 * @author 1DAW2425-09
 */
import java.util.*;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    // Orden natural: Por nombre
    @Override
    public int compareTo(Persona otra) {
        return this.nombre.compareTo(otra.nombre);
    }
}

public class act5 {
    public static void main(String[] args) {
        // Lista de personas
        Set<Persona> personasPorNombre = new TreeSet<>();
        personasPorNombre.add(new Persona("Carlos", 30));
        personasPorNombre.add(new Persona("Ana", 25));
        personasPorNombre.add(new Persona("Beatriz", 28));
        personasPorNombre.add(new Persona("Carlos", 22));

        System.out.println("\nOrden por nombre:");
        System.out.println(personasPorNombre);

        // Orden por edad (Modificando el comparador)
        Set<Persona> personasPorEdad = new TreeSet<>(new ComparadorPorEdad());
        personasPorEdad.addAll(personasPorNombre);

        System.out.println("\nOrden por edad:");
        System.out.println(personasPorEdad);

        // Orden por nombre y luego por edad
        Set<Persona> personasPorNombreYEdad = new TreeSet<>(new ComparadorPorNombreYEdad());
        personasPorNombreYEdad.addAll(personasPorNombre);

        System.out.println("\nOrden por nombre y luego edad:");
        System.out.println(personasPorNombreYEdad);
    }
}

// Comparador por edad
class ComparadorPorEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

// Comparador por nombre y luego edad
class ComparadorPorNombreYEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        int comparacionNombre = p1.getNombre().compareTo(p2.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

