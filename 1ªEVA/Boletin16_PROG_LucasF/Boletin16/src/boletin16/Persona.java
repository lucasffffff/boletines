/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author lucas
 */
public class Persona {

    private final String nome;
    private final String apelidos;
    private final String NIF;

    public Persona(String nome, String apelidos, String NIF) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.NIF = NIF;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public String getNIF() {
        return NIF;
    }
}
