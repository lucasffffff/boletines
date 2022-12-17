/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra1_2;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Extra1_2 {
  public static void main(String[] args) {
    double a, b, c, x, y;

    Scanner scanner = new Scanner(System.in);

    // Solicito los coeficientes a, b, c y el valor de x:
    System.out.print("Escribe el coeficiente a: ");
    a = scanner.nextDouble();
    System.out.print("Escribe el coeficiente b: ");
    b = scanner.nextDouble();
    System.out.print("Escribe el coeficiente c: ");
    c = scanner.nextDouble();
    System.out.print("Escribe el valor de x: ");
    x = scanner.nextDouble();

    // Calculo Y:
    y = a * x * x + b * x + c;

    System.out.println("Valor de y: : " + y);
  }
}

