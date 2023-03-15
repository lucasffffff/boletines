/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package boletin24_prog_lucasf;

import boletin24_prog_lucasf.Libro;
import java.util.ArrayList;
import java.util.Collections;

public class Libreria {
    private ArrayList<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public void engadirLibro(Libro libro) {
        libros.add(libro);
    }

    public void venderLibro(String ISBN) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getISBN().equals(ISBN)) {
                if (libros.get(i).getNumUnidades() > 0) {
                    libros.get(i).setNumUnidades(libros.get(i).getNumUnidades() - 1);
                    System.out.println("Libro vendido con éxito.");
                } else {
                    System.out.println("No hay unidades disponibles de este libro.");
                }
                return;
            }
        }
        System.out.println("No se encontró el libro con el ISBN indicado.");
    }

    public void amosarLibros() {
        Collections.sort(libros);
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }

    public void darDeBaixa() {
        libros.removeIf(libro -> libro.getNumUnidades() == 0);
        System.out.println("Libros con 0 unidades dados de baja.");
    }

    public Libro consultarLibro(String ISBN) {
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                return libro;
            }
        }
        return null;
    }
}
