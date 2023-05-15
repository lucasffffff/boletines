/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33_prog_lucasf;

/**
 *
 * @author lucas
 */
public class Futbolista extends SeleccionFutbol {

    private Integer dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellidos, Integer id, Integer edad, Integer dorsal, String posicion) {
        super(nombre, apellidos, id, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista " + nombre + " se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista " + nombre + " viaja con el equipo.");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista " + nombre + " entrena para mejorar sus habilidades.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista " + nombre + " juega el partido con el dorsal " + dorsal + " en la posición " + posicion + ".");
    }

    public void entrevista() {
        System.out.println("El futbolista " + nombre + " concede una entrevista.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Dorsal: " + dorsal + ", Posición: " + posicion;
    }
}
