/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin14;

/**
 *
 * @author lucas
 */
import boletin14.partes.Monitor;
import boletin14.partes.Teclado;
import boletin14.partes.Procesador;

public class Boletin14 {

    public static void main(String[] args) {
        Monitor mo = new Monitor("LG");
        Teclado te = new Teclado("Logitech");
        Procesador pro = new Procesador(2);
        Ordenador ordenador = new Ordenador(mo, te, pro, 1200f);

        System.out.println(
                ordenador.marcaTeclado()
        );
        System.out.println(
                ordenador.precioOrdenador()
        );
        System.out.println(
                ordenador.velocidadCPU()
        );
        System.out.println(
                ordenador.todasCarac()
        );
    }
}
