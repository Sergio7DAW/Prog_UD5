/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act2;

/**
 *
 * @author 1DAW2425-09
 */
import java.util.LinkedHashSet;
import java.util.Set;

public class act2 {
  public static void main(String[] args) {
        // Declarando el conjunto usando la interfaz Set
        Set<String> alumnos = new LinkedHashSet<>();

        // Agregando nombres al conjunto
        alumnos.add("Carlos");
        alumnos.add("Ana");
        alumnos.add("Pedro");
        alumnos.add("Beatriz");

        // Imprimiendo el conjunto
        System.out.println("Contenido del LinkedHashSet: " + alumnos);

        // Agregando un nombre repetido
        boolean agregado = alumnos.add("Carlos");
        System.out.println("Intentando agregar 'Carlos' nuevamente. ¿Se agregó? " + agregado);

        // Agregando un null
        alumnos.add(null);
        System.out.println("Después de agregar null: " + alumnos);

        // Recorriendo el conjunto en orden de inserción
        System.out.println("Recorriendo con for-each:");
        for (String alumno : alumnos) {
            System.out.println("- " + alumno);
        }
    }    
}
