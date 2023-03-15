/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin22_prog_lucasf;

/**
 *
 * @author lucas
 */

public class Boletin22_PROG_LucasF {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        
        metodos.mostrarTabla(metodos.jornadas, metodos.equipos, metodos.goles);
        metodos.mostrarTablaOrdenada();
        metodos.maximoGoleadorPorJornada();
        metodos.equipoMaxGolJornada(3);
        metodos.equiposPorGolesEnJornada(5);
    }
}

