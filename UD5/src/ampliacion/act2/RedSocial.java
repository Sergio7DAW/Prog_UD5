/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ampliacion.act2;

/**
 *
 * @author usuario
 */
import java.util.*;

public class RedSocial {

    private Map<Usuario, Set<Usuario>> amistades;

    public RedSocial() {
        amistades = new HashMap<>();
    }

    public void agregarAmistad(Usuario u1, Usuario u2) {
        amistades.putIfAbsent(u1, new HashSet<>());
        amistades.putIfAbsent(u2, new HashSet<>());

        amistades.get(u1).add(u2);
        amistades.get(u2).add(u1);
    }

    public Set<Usuario> obtenerAmigos(Usuario u) {
        return amistades.getOrDefault(u, new HashSet<>());
    }

    public Set<Usuario> calcularAmigosEnComun(Usuario u1, Usuario u2) {
        Set<Usuario> amigos1 = obtenerAmigos(u1);
        Set<Usuario> amigos2 = obtenerAmigos(u2);

        Set<Usuario> enComun = new HashSet<>(amigos1);
        enComun.retainAll(amigos2); // intersección

        return enComun;
    }
}
