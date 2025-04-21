/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo.act4;

/**
 *
 * @author usuario
 */
public class Producto implements Comparable<Producto> {

    private String id;
    private String nombre;
    private double precio;

    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " ($" + precio + ")";
    }
}
