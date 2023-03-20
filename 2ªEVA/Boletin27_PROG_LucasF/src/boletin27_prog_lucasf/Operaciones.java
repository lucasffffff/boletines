package boletin27_prog_lucasf;

/**
 *
 * @author lucas
 */

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Operaciones {

    public static void añadirLibro(String nombreArchivo) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            archivo.createNewFile();
            System.out.println("Archivo creado correctamente.");
        }

        FileWriter fw = new FileWriter(archivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        System.out.println("Introduce el nombre del libro:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el autor del libro:");
        String autor = scanner.nextLine();
        System.out.println("Introduce el precio del libro:");
        double precio = scanner.nextDouble();
        System.out.println("Introduce el numero de unidades del libro:");
        int unidades = scanner.nextInt();

        pw.println(nombre + "," + autor + "," + precio + "," + unidades);
        pw.flush();
        pw.close();
        System.out.println("Libro agregado correctamente al archivo.");
    }

    public static void consultarPrecio(String nombreArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
    }

    public static void mostrarDatos(String nombreArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        System.out.printf("%-30s%-30s%-15s%-10s\n", "Nombre del libro", "Autor", "Precio", "Unidades");
        System.out.println("-------------------------------------------------------------------------------------");
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            String nombre = partes[0];
            String autor = partes[1];
            double precio = Double.parseDouble(partes[2]);
            int unidades = Integer.parseInt(partes[3]);
            System.out.printf("%-30s%-30s%-15.2f%-10d\n", nombre, autor, precio, unidades);
            System.out.println("-------------------------------------------------------------------------------------");
        }
        br.close();
    }

    public static void borrarLibros(String nombreArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        List<String> lineas = new ArrayList<String>();
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            int unidades = Integer.parseInt(partes[3]);
            if (unidades > 0) {
                lineas.add(linea);
            }
        }
        br.close();
        FileWriter fw = new FileWriter(nombreArchivo);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for (String l : lineas) {
            pw.println(l);
        }
        pw.flush();
        pw.close();
        System.out.println("Libros sin unidades borrados correctamente.");
    }

    public static void modificarPrecio(String nombreArchivo) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del libro cuyo precio quieres modificar: ");
        String nombreLibro = scanner.nextLine();
        System.out.println("Introduce el nuevo precio: ");
        double nuevoPrecio = Double.parseDouble(scanner.nextLine());
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        List<String> lineas = new ArrayList<String>();
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            String nombre = partes[0];
            double precio = Double.parseDouble(partes[2]);
            if (nombre.equalsIgnoreCase(nombreLibro)) {
                precio = nuevoPrecio;
            }
            lineas.add(nombre + "," + partes[1] + "," + precio + "," + partes[3]);
        }
        br.close();
        FileWriter fw = new FileWriter(nombreArchivo);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for (String l : lineas) {
            pw.println(l);
        }
        pw.flush();
        pw.close();
        System.out.println("Precio del libro modificado correctamente.");
    }
}
