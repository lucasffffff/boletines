/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra1_1;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Extra1_1 {

    public static void main(String[] args) {

        double baseImponible, ivaPorcentaje, ivaImporte, total;

        Scanner scanner = new Scanner(System.in);

        // Pido la base imponible y el porcentaje del IVA
        System.out.print("Escribe la base imponible: ");
        baseImponible = scanner.nextDouble();
        System.out.print("Escribe el porcentaje del IVA: ");
        ivaPorcentaje = scanner.nextDouble();

        // Calculo el importe del IVA y el total:
        ivaImporte = baseImponible * ivaPorcentaje / 100;
        total = baseImponible + ivaImporte;

        System.out.println("Importe del IVA: " + ivaImporte);
        System.out.println("Total: " + total);
    }
}
