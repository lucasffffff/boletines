/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2__1;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Boletin2__1 {

    // Aplicacion que calcula el area de un triángulo
    public static void main(String[] args) {
        // Proyecto que calcula el area de un trangulo
        float base, altura; // Son variables  
        Scanner obxScaner = new Scanner(System.in);
        System.out.println("teclea la base");
        base = obxScaner.nextFloat();
        System.out.println("teclea la altura");
        altura = obxScaner.nextFloat();
        float area = base * altura / 2;
        System.out.println("el area = " + area);
    }
}
