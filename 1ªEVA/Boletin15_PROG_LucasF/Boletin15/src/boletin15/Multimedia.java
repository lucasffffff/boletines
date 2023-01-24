/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author lucas
 */
public class Multimedia {

    private final String titulo;
    private final String autor;
    private final String formato;
    private final int duracion;

    public Multimedia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", autor: " + autor + ", formato: " + formato + ", duracion: " + duracion + " minutos";
    }
}
