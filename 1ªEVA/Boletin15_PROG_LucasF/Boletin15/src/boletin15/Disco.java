/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author lucas
 */
public class Disco extends Multimedia {

    private final String genero;

    public Disco(String titulo, String autor, String formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + ", genero: " + genero;
    }
}
