/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act1;

/**
 *
 * @author 1DAW2425-09
 */
import java.util.*;
import java.util.Iterator;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        // Crear un HashSet para almacenar los nombres de los libros
        Set<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\n📚 Bienvenido al Club de Lectura 📚");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Mostrar libros (con for-each)");
            System.out.println("3. Mostrar libros (con Iterator)");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del libro: ");
                    String libro = scanner.nextLine();
                    // Intentar agregar el libro (evita duplicados automáticamente)
                    if (libros.add(libro)) {
                        System.out.println("✅ Libro agregado: " + libro);
                    } else {
                        System.out.println("⚠️ El libro ya está en el club.");
                    }
                    break;

                case 2:
                    System.out.println("\n📖 Lista de libros (for-each):");
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros en el club.");
                    } else {
                        for (String l : libros) {
                            System.out.println("- " + l);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n📖 Lista de libros (Iterator):");
                    if (libros.isEmpty()) {
                        System.out.println("No hay libros en el club.");
                    } else {
                        Iterator<String> iterator = libros.iterator();
                        while (iterator.hasNext()) {
                            System.out.println("- " + iterator.next());
                        }
                    }
                    break;

                case 4:
                    System.out.println("👋 ¡Hasta luego!");
                    break;

                default:
                    System.out.println("❌ Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close(); // Cerrar el scanner
    }
}
