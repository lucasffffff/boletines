/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin4_1;

/**
 *
 * @author lucas
 */
public class Boletin4_1 {

    public static void main(String[] args) {
        // Creamos un libro usando el constructor por defecto
        Libro libro1 = new Libro();

        // Mostramos la información del libro
        libro1.mostrarLibro();

        // Modificamos los datos del libro usando los métodos de acceso
        libro1.setTitulo("El Quijote");
        libro1.setAutor("Miguel de Cervantes");
        libro1.setAno(1605);
        libro1.setNumPaginas((short) 1000);
        libro1.setValoracion(5.0f);

        // Mostramos la información del libro modificado
        libro1.mostrarLibro();

        // Creamos un libro usando el constructor que permite inicializar el título, autor, año y número de páginas
    }
}
