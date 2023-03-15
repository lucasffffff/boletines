/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package boletin24_prog_lucasf;

import java.util.Scanner;

public class Boletin24_PROG_LucasF {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Libreria libreria = new Libreria();
            int opcion;
            
            do {
                System.out.println("Menu:");
                System.out.println("1. Añadir libro");
                System.out.println("2. Vender libro");
                System.out.println("3. Mostrar libros");
                System.out.println("4. Dar de baja libros que no quedan unidades");
                System.out.println("5. Consultar libro");
                System.out.println("6. Salir");
                System.out.print("Escoge opcion: ");
                opcion = sc.nextInt();
                
                try {
                    switch (opcion) {
                        case 1 -> {
                            sc.nextLine();
                            System.out.print("Introduce el título: ");
                            String titulo = sc.nextLine();
                            System.out.print("Introduce el autor: ");
                            String autor = sc.nextLine();
                            System.out.print("Introduce el ISBN: ");
                            String ISBN = sc.nextLine();
                            System.out.print("Introduce el precio: ");
                            double prezo = sc.nextDouble();
                            System.out.print("Introduce el número de unidades: ");
                            int numUnidades = sc.nextInt();
                            libreria.engadirLibro(new Libro(titulo, autor, ISBN, prezo, numUnidades));
                        }
                        case 2 -> {
                            sc.nextLine();
                            System.out.print("Introduce el ISBN del libro a vender: ");
                            String ISBNVender = sc.nextLine();
                            libreria.venderLibro(ISBNVender);
                        }
                        case 3 -> libreria.amosarLibros();
                        case 4 -> libreria.darDeBaixa();
                        case 5 -> {
                            sc.nextLine();
                            System.out.print("Introduce el ISBN del libro a consultar: ");
                            String ISBNConsultar = sc.nextLine();
                            Libro libroConsultado = libreria.consultarLibro(ISBNConsultar);
                            if (libroConsultado != null) {
                                System.out.println(libroConsultado.toString());
                            } else {
                                System.out.println("No se encontró el libro con el ISBN indicado.");
                            }
                        }
                        case 6 -> System.out.println("Saliendo...");
                        default -> System.out.println("No existe esa opcion. Elige otra.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } while (opcion != 6);
        }
    }
}