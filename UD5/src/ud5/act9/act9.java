/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author 1DAW2425-09
 */
public class act9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        l.add("Juan");
        l.add("Antonio");
        l.add("Pepe");
        l.add("Jose");
        l.add("Raul");

        for (String nombre : l) {
            System.out.println(nombre);
        }

        System.out.println("Introduce in nombre");
        String nombre1 = sc.nextLine();
        l.add(nombre1);
        System.out.println("Listo");

        System.out.println("Introduce el nombre a eliminar");

        String nombre2 = sc.nextLine();

        if (l.contains(nombre2)) {
            l.remove(nombre2);
            System.out.println("Se elimino " + nombre2);
        } else {

            System.out.println("El nombre no esta en la lista");
        }

        System.out.println("Listo");

        System.out.println("Nueva Lista");

        for (String nombre : l) {
            System.out.println(nombre);
        }

        System.out.println("El tamaño de la lista es " + l.size());
    }

}
