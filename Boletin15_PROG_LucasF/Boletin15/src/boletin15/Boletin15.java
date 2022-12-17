/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin15;

/**
 *
 * @author lucas
 */
public class Boletin15 {
  public static void main(String[] args) {
    Pelicula pelicula = new Pelicula("Matrix", "Lana Wachowski", "MP4", 170, "Keanu Reeves", "Carrie-Anne Moss");
    Disco disco = new Disco("X100PRE", "Bad Bunny", "MP3", 40, "Trap");

    System.out.println("Caracteristicas de la pelicula:");
    System.out.println("Titulo: " + pelicula.getTitulo());
    System.out.println("Autor: " + pelicula.getAutor());
    System.out.println("Formato: " + pelicula.getFormato());
    System.out.println("Duracion: " + pelicula.getDuracion() + " minutos");
    System.out.println("Actor principal: " + pelicula.getActorPrincipal());
    System.out.println("Actriz principal: " + pelicula.getActrizPrincipal());

    System.out.println("\nCaracteristicas del disco:");
    System.out.println("Titulo: " + disco.getTitulo());
    System.out.println("Autor: " + disco.getAutor());
    System.out.println("Formato: " + disco.getFormato());
    System.out.println("Duracion: " + disco.getDuracion() + " minutos");
    System.out.println("Genero: " + disco.getGenero());
  }
}

