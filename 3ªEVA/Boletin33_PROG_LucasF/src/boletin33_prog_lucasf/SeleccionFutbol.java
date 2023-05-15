/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin33_prog_lucasf;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    protected String nombre;
    protected String apellidos;
    protected Integer id;
    protected Integer edad;

    public SeleccionFutbol(String nombre, String apellidos, Integer id, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + " " + apellidos + ", Edad: " + edad;
    }
}

