/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin12_1;

/**
 *
 * @author lucas
 */
import javax.swing.JOptionPane;

public class Boletin12_1 {

    public static void main(String[] args) {
        // Solicito al primer jugador que ponga el número a adivinar y un máximo de intentos:
        String numeroAAdivinarString = JOptionPane.showInputDialog("Pon el número para adivinar entre el 1 y el 50:");
        int numeroAAdivinar = Integer.parseInt(numeroAAdivinarString);
        String numeroMaximoIntentosString = JOptionPane.showInputDialog("Selecciona el máximo de intentos:");
        int numeroMaximoIntentos = Integer.parseInt(numeroMaximoIntentosString);

        // Hago el juego repetitivo:
        boolean adivinado = false;
        int numeroIntentos = 0;
        while (!adivinado && numeroIntentos < numeroMaximoIntentos) {
            // Pido al segundo jugador que introduzca un número:
            String numeroIntroducidoString = JOptionPane.showInputDialog("Escribe un número:");
            int numeroIntroducido = Integer.parseInt(numeroIntroducidoString);

            // Comparamos el número introducido con el número a adivinar y mostramos un mensaje de orientación
            if (numeroIntroducido == numeroAAdivinar) {
                JOptionPane.showMessageDialog(null, "¡Has acertado el número! ¡Felicidades!");
                adivinado = true;
            } else if (numeroIntroducido < numeroAAdivinar) {
                JOptionPane.showMessageDialog(null, "El número es menor que el número a adivinar. Vuelve a intentarlo.");
            } else {
                JOptionPane.showMessageDialog(null, "El número es mayor que el número a adivinar. Vuelve a intentarlo.");
            }

            numeroIntentos++;
        }

        // Acaba si se agotaron los intentos o se acertó el número:
        if (adivinado) {
            JOptionPane.showMessageDialog(null, "¡Has acertado en " + numeroIntentos + " intentos!");
        } else {
            JOptionPane.showMessageDialog(null, "Se te han agotado los intentos. El número era " + numeroAAdivinar + ".");
        }
    }
}
