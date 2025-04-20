/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act1;

/**
 *
 * @author usuario
 */

import java.util.*;
public class act1 {

    public static void main(String[] args) {
        // Lista de ventas de ejemplo
        List<ventas> ventas = Arrays.asList(
                new ventas("P001", "Electrónica", 1200.00),
                new ventas("P002", "Ropa", 45.50),
                new ventas("P003", "Electrónica", 800.00),
                new ventas("P004", "Ropa", 60.00),
                new ventas("P005", "Hogar", 150.00),
                new ventas("P006", "Electrónica", 400.00),
                new ventas("P007", "Hogar", 300.00),
                new ventas("P008", "Ropa", 35.00)
        );

        // Mapa para acumular ventas por categoría
        Map<String, Double> ventasPorCategoria = new HashMap<>();

        for (ventas venta : ventas) {
            String categoria = venta.getCategoriaProducto();
            double precio = venta.getPrecioVenta();

            ventasPorCategoria.put(categoria,
                    ventasPorCategoria.getOrDefault(categoria, 0.0) + precio);
        }

        // Ordenar por total de ventas de mayor a menor
        List<Map.Entry<String, Double>> listaOrdenada = new ArrayList<>(ventasPorCategoria.entrySet());
        listaOrdenada.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

        // Mostrar el resultado
        System.out.println("Informe de Ventas por Categoría:");
        for (Map.Entry<String, Double> entry : listaOrdenada) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
