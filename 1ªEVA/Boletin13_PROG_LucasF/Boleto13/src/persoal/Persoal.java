/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoal;

/**
 *
 * @author lucas
 */
public class Persoal {
    // Declaro los atributos telefono y correo

    private final String telefono;
    private final String correo;

    // Creo un constructor con los atributos de la clase
    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    // Creo un método toString.
    @Override
    public String toString() {
        return "Telefono: " + telefono + "\nCorreo: " + correo;
    }
}
