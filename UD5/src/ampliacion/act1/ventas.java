/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act1;

/**
 *
 * @author usuario
 */
public class ventas {
    private String idProducto;
    private String categoriaProducto;
    private double precioVenta;

    public ventas(String idProducto, String categoriaProducto, double precioVenta) {
        this.idProducto = idProducto;
        this.categoriaProducto = categoriaProducto;
        this.precioVenta = precioVenta;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
}
