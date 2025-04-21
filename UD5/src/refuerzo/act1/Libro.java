/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refuerzo.act1;

/**
 *
 * @author usuario
 */
import java.util.Objects;

public class Libro implements Comparable<Libro> {
    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return isbn.equalsIgnoreCase(libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn.toLowerCase());
    }

    @Override
    public int compareTo(Libro otro) {
        return this.isbn.compareToIgnoreCase(otro.isbn);
    }

    @Override
    public String toString() {
        return "[" + isbn + "] \"" + titulo + "\", de " + autor;
    }
}
