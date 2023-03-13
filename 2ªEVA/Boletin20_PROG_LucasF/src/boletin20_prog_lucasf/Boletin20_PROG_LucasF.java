/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin20_prog_lucasf;

/**
 *
 * @author lucas
 */
public class Boletin20_PROG_LucasF {
    public static void main(String[] args) {
        // Crear un gato y llamar a los métodos para caminar, nadar y volar
        Gato gato = new Gato();
        gato.camiñar();
        gato.nadar();
        gato.voar();

        // Crear un avestruz y llamar al método para volar
        Avestruz avestruz = new Avestruz();
        avestruz.voar(); // Mostrará el mensaje "O avestruz non pode voar."

        // Crear un papagaio y llamar a los métodos para caminar y volar
        Papagaio papagaio = new Papagaio();
        papagaio.camiñar();
        papagaio.voar();

        // Crear un morcego y llamar a los métodos para caminar y volar
        Morcego morcego = new Morcego();
        morcego.camiñar();
        morcego.voar();

        // Crear un tigre y llamar a los métodos para caminar y nadar
        Tigre tigre = new Tigre();
        tigre.camiñar();
        tigre.nadar();
    }
}

