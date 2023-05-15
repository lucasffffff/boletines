/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33_prog_lucasf;

/**
 *
 * @author lucas
 */

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private Integer anhosExperiencia;

    public Masajista(String nombre, String apellidos, Integer id, Integer edad, String titulacion, Integer anhosExperiencia) {
        super(nombre, apellidos, id, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + nombre + " se concentra antes de los partidos.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + nombre + " viaja con el equipo para brindar asistencia.");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista " + nombre + " brinda masajes y asistencia durante los entrenamientos.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista " + nombre + " no juega partidos, pero brinda asistencia al equipo.");
    }

    public void darMasaje() {
        System.out.println("El masajista " + nombre + " da un masaje a un jugador.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Titulación: " + titulacion + ", Años de experiencia: " + anhosExperiencia;
    }
}

