/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33_prog_lucasf;

/**
 *
 * @author lucas
 */

public class Entrenador extends SeleccionFutbol {
    private String idFederacion;

    public Entrenador(String nombre, String apellidos, Integer id, Integer edad, String idFederacion) {
        super(nombre, apellidos, id, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + nombre + " se concentra y motiva al equipo.");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + nombre + " viaja con el equipo para los partidos.");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + nombre + " dirige los entrenamientos del equipo.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador " + nombre + " dirige al equipo durante el partido.");
    }

    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + nombre + " planifica los entrenamientos del equipo.");
    }

    @Override
    public String toString() {
        return super.toString() + ", ID de Federación: " + idFederacion;
    }
}


