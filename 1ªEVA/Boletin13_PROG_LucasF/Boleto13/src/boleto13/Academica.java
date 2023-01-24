/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boleto13;

/**
 *
 * @author lucas
 */
import persoal.Persoal;

public class Academica {
    // Declaro la variable de clase numReferencia y le asigno el valor 2018

    private static int numReferencia = 2018;
    // Declaro atributos nome, nota y alum
    private final String nome;
    private final int nota;
    private final Persoal alum;

    // Hago un constructor con los atributos de la clase:
    public Academica(String nome, int nota, String telefono, String correo) {
        this.nome = nome;
        this.nota = nota;
        this.alum = new Persoal(telefono, correo);
        // Incremento numReferencia en 1
        numReferencia++;
    }

    // Método toString() que devuelve una cadena con los atributos de la clase
    @Override
    public String toString() {
        return "NumReferencia: " + numReferencia + "\nNombre: " + nome + "\nNota: " + nota + "\n" + alum;
    }
}
