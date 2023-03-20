package boletin27_prog_lucasf;

/**
 *
 * @author lucas
 */
import java.io.*;
import java.util.*;

public class Boletin27_PROG_LucasF {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "libros.txt";
        boolean salir = false;
        while (!salir) {
            Menu.mostrar();
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "a":
                    try {
                    Operaciones.añadirLibro(nombreArchivo);
                } catch (IOException e) {
                    System.out.println("Error al agregar el libro: " + e.getMessage());
                }
                break;

                case "b":
                    Operaciones.consultarPrecio(nombreArchivo);
                    break;
                case "c":
                    Operaciones.mostrarDatos(nombreArchivo);
                    break;
                case "d":
                    Operaciones.borrarLibros(nombreArchivo);
                    break;
                case "e":
                    Operaciones.modificarPrecio(nombreArchivo);
                    break;
                case "x":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Introduce otra.");
            }
        }
        System.out.println("Programa cerrado.");
    }
}
