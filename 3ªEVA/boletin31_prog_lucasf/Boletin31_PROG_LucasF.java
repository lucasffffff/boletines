/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin31_prog_lucasf;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Boletin31_PROG_LucasF {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        VentanaCalculadora obx = new VentanaCalculadora();
        obx.setVisible(true);
    }
}




