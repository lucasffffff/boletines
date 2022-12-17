/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author lucas
 */
public class Conta {

    private final long numeroConta;
    private double saldo;
    private final Persona cliente;

    public Conta(Persona cliente, long numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void ingresar(double cantidade) {
        saldo += cantidade;
    }

    public void retirar(double cantidade) {
        if (saldo >= cantidade) {
            saldo -= cantidade;
        }
    }

    public void actualizarSaldo() {
        // Cada subclase implementará este método de forma diferente
    }
}
