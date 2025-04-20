/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act3;

/**
 *
 * @author usuario
 */
import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Tarea {

    private String descripcion;
    private int prioridad; // 1 (alta) - 5 (baja)
    private LocalDateTime fechaCreacion;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaCreacion = LocalDateTime.now(); // Fecha de creación automática
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return String.format("Tarea: %s | Prioridad: %d | Creada: %s",
                descripcion, prioridad, fechaCreacion);
    }
}
