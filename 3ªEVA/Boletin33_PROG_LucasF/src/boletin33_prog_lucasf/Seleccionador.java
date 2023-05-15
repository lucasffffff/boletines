/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33_prog_lucasf;

/**
 *
 * @author lucas
 */

public class Seleccionador extends SeleccionFutbol {
    public Seleccionador(String nombre, String apellidos, Integer id, Integer edad) {
        super(nombre, apellidos, id, edad);
    }

    public void seleccionarJugadores() {
        System.out.println("El seleccionador " + nombre + " está seleccionando a los jugadores para el equipo.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El seleccionador " + nombre + " se concentra en la estrategia del equipo.");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador " + nombre + " viaja con el equipo para los partidos internacionales.");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador " + nombre + " dirige los entrenamientos tácticos del equipo.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador " + nombre + " no juega partidos, pero dirige al equipo desde la banca.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

