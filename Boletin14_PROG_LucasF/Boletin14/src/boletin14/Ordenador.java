/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin14;

/**
 *
 * @author lucas
 */
import boletin14.partes.Monitor;
import boletin14.partes.Procesador;
import boletin14.partes.Teclado;

public class Ordenador {

    private Monitor mo;
    private Teclado te;
    private Procesador pro;
    float precio;

    public Ordenador(Monitor mo, Teclado te, Procesador pro, float precio) {
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }

    public String todasCarac() {
        return "Ordenador{" + "mo=" + mo + ", te=" + te + ", pro=" + pro + ", precio=" + precio + '}';
    }

    public String precioOrdenador() {
        return "Ordenador{" + "precio=" + precio + '}';
    }

    public String velocidadCPU() {
        return "Ordenador{" + "pro=" + pro + '}';
    }

    public String marcaTeclado() {
        return "Ordenador{" + "te=" + te + '}';
    }
}
