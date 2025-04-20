/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act2;

/**
 *
 * @author usuario
 */
public class act2 {
     public static void main(String[] args) {
        RedSocial red = new RedSocial();

        Usuario ana = new Usuario(1, "Ana");
        Usuario juan = new Usuario(2, "Juan");
        Usuario lucia = new Usuario(3, "Lucía");
        Usuario pedro = new Usuario(4, "Pedro");
        Usuario maria = new Usuario(5, "María");

        // Crear amistades
        red.agregarAmistad(ana, juan);
        red.agregarAmistad(ana, lucia);
        red.agregarAmistad(juan, lucia);
        red.agregarAmistad(juan, pedro);
        red.agregarAmistad(pedro, maria);

        // Obtener amigos de Ana
        System.out.println("Amigos de Ana: " + red.obtenerAmigos(ana));

        // Obtener amigos de Juan
        System.out.println("Amigos de Juan: " + red.obtenerAmigos(juan));

        // Calcular amigos en común entre Ana y Juan
        System.out.println("Amigos en común entre Ana y Juan: " + red.calcularAmigosEnComun(ana, juan));

        // Calcular amigos en común entre Juan y Pedro
        System.out.println("Amigos en común entre Juan y Pedro: " + red.calcularAmigosEnComun(juan, pedro));
    }   
}
