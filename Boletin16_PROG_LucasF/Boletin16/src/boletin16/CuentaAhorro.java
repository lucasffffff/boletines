/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author lucas
 */
public class CuentaAhorro extends Conta {

    private double interes;
    private final double saldoMinimo;

    public CuentaAhorro(Persona cliente, long numeroConta, double interes, double saldoMinimo) {
        super(cliente, numeroConta);
        this.interes = interes;
        this.saldoMinimo = saldoMinimo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    @Override
    public void actualizarSaldo() {
        double interes = getSaldo() * getInteres() / 100;
        ingresar(interes);
    }

    @Override
    public String toString() {
        return "Cuenta ahorro: " + getNumeroConta() + "| saldo: " + getSaldo() + " euros | cliente: " + getCliente().getNome() + " " + getCliente().getApelidos() + " (" + getCliente().getNIF() + ")| interes: " + getInteres() + " %";
    }
}
