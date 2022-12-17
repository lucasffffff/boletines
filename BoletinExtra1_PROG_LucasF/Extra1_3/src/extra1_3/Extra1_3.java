/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra1_3;

/**
 *
 * @author lucas
 */

import java.util.Scanner;

public class Extra1_3 {
  public static void main(String[] args) {
    double a, b, c, x1, x2;

    Scanner scanner = new Scanner(System.in);

    // Solicito los coeficientes:
    System.out.print("Escribe el coeficiente a: ");
    a = scanner.nextDouble();
    System.out.print("Escribe el coeficiente b: ");
    b = scanner.nextDouble();
    System.out.print("Escribe el coeficiente c: ");
    c = scanner.nextDouble();

    // Compruebo si hay solucion en los reales para que no pueda dar NaN:
    if (b * b - 4 * a * c <= 0) {
      System.out.println("La ecuación no tiene soluciones reales.");
    } else {
      // Calculo las ecuaciones de segundo grado:
      // Math.sqrt lo uso para hacer la raíz cuadrada.
      x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
      x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

      System.out.println("La solucion x1 es: " + x1);
      System.out.println("La solucion x2 es: " + x2);
    }
  }
}

