/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin19_prog_lucasf;

/**
 *
 * @author lucas
 */
public class Boletin19_PROG_LucasF {
    public static void main(String[] args) {
        Canario canario = new Canario();
        Persona tenor = new Persona();

        System.out.println("Canta el canario:");
        canario.cantar();

        System.out.println("Canta el tenor:");
        tenor.cantar();
    }
}

