/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin20_prog_lucasf;

/**
 *
 * @author lucas
 */
public class Gato extends Mamifero implements IPodeNadar, IPodeVoar {

    @Override
    public void nadar() {
        System.out.println("El gato esta nadando.");
    }

    @Override
    public void voar() {
        System.out.println("El gato esta volando.");
    }
}
