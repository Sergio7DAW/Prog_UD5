/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act5;

/**
 *
 * @author usuario
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<String, String> {
    private final int capacidad;

    public LRUCache(int capacidad) {
        super(capacidad, 0.75f, true); // true = orden basado en acceso
        this.capacidad = capacidad;
    }

    // Sobrescribir para eliminar el elemento menos recientemente usado
    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        return size() > capacidad;
    }

    // Agrega o actualiza un valor
    public void putValor(String key, String value) {
        super.put(key, value); // ya gestiona la lógica LRU automáticamente
    }

    // Obtiene un valor
    public String getValor(String key) {
        return super.getOrDefault(key, null);
    }

    // Muestra la caché del más reciente al menos reciente
    public void mostrarCache() {
        System.out.println("Contenido de la caché (más reciente → menos reciente):");
        var iterator = new LinkedHashMap<>(this).entrySet().iterator();
        // Pasar a lista para invertir el orden
        this.entrySet().stream()
                .sorted((e1, e2) -> -1) // invertimos el orden de acceso
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
