/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package boletin24_prog_lucasf;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private String ISBN;
    private double prezo;
    private int numUnidades;

    public Libro(String titulo, String autor, String ISBN, double prezo, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numUnidades = numUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareTo(o.titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", Autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Precio=" + prezo +
                ", numUnidades=" + numUnidades +
                '}';
    }
}