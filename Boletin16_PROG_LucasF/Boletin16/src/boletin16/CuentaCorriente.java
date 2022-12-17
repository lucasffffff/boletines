/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author lucas
 */
public class CuentaCorriente extends Conta {

    private static final double INTERES_FIJO = 1.5;

    public CuentaCorriente(Persona cliente, long numeroConta) {
        super(cliente, numeroConta);
    }

    @Override
    public void actualizarSaldo() {
        double interes = getSaldo() * INTERES_FIJO / 100;
        ingresar(interes);
    }

    @Override
    public String toString() {
        return "Cuenta corriente: " + getNumeroConta() + "| saldo: " + getSaldo() + " euros | cliente: " + getCliente().getNome() + " " + getCliente().getApelidos() + " (" + getCliente().getNIF() + ")";
    }
}
