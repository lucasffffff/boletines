/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin17;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Boletin17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calcularOtraNota = true;

        while (calcularOtraNota) {
            System.out.print("Nota primera prueba escrita: ");
            double notaEscrita1 = scanner.nextDouble();
            System.out.print("Nota segunda prueba escrita: ");
            double notaEscrita2 = scanner.nextDouble();
            double notaEscritaTotal = (notaEscrita1 + notaEscrita2) / 2;
            double notaEscritaFinal = notaEscritaTotal * 0.4;

            System.out.print("Nota prueba práctica: ");
            double notaPractica = scanner.nextDouble();
            double notaPracticaFinal = notaPractica * 0.4;

            System.out.print("Nota boletines: ");
            double notaBoletines = scanner.nextDouble();
            double notaBoletinesFinal = 0;
            if (notaBoletines >= 90) {
                notaBoletinesFinal = 2 * 0.2;
            } else if (notaBoletines >= 70) {
                notaBoletinesFinal = 1 * 0.2;
            } else {
                notaBoletinesFinal = 0;
            }

            double notaFinal = notaEscritaFinal + notaPracticaFinal + notaBoletinesFinal;

            System.out.println("Teoricas: " + notaEscritaTotal);
            System.out.println("Practicas: " + notaPractica);
            System.out.println("boletines: " + notaBoletines);
            System.out.println("Total: " + notaFinal);

            System.out.print("¿Quieres calcular otra nota? (s = si / n = no)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("n")) {
                calcularOtraNota = false;
            }
        }
    }
}
