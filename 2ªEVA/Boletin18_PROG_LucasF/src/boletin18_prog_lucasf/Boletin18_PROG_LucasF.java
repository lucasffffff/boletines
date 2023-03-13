/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package boletin18_prog_lucasf;
import boletin18_prog_lucasf.clases.*;

public class Boletin18_PROG_LucasF {

    public static void main(String[] args) {
        float temperaturaCentigrados = 95.0f;

        try {
            float temperaturaFharenheit = ConversorTemperaturas.centigradosAFharenheit(temperaturaCentigrados);
            System.out.println("Temperatura en grados Fharenheit: " + temperaturaFharenheit);

            float temperaturaReamur = ConversorTemperaturas.centigradosAReamur(temperaturaCentigrados);
            System.out.println("Temperatura en grados Reamur: " + temperaturaReamur);
        } catch (TemperaturaErradaExcepcion ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
