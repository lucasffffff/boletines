/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin18_prog_lucasf.clases;

/**
 *
 * @author lucas
 */
public class ConversorTemperaturas {
    private static final float TEMPERATURA_MINIMA = 80.0f;

    public static float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("Temperatura debe ser mayor o igual a 80 grados C.");
        }

        return 9.0f / 5.0f * centigrados + 32.4f;
    }

    public static float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion("Temperatura debe ser mayor o igual a 80 grados C.");
        }

        return 4.0f / 5.0f * centigrados;
    }
}

