/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_1_parte_6;

/**
 *
 * @author vanes
 */
public abstract class ContaBancaria {

    public int numero;
    private int senha;
    protected double saldo;
    public Cliente cliente;

    public ContaBancaria(int numero, int senha, Cliente cliente) {
        this.numero = numero;
        this.senha = senha;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public boolean sacar(double valor, int senha) {

        if (this.saldo > valor && verificasenha(senha)) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    protected boolean verificasenha(int senha) {
        return this.senha == senha;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public static String imprimirsaldo(ContaBancaria c) {
        return "Saldo: R$" + c.saldo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "\n_______________________\nConta Bancaria: \n numero: " + this.numero + "\nsenha: " + this.senha + "\nNome Titular: " + this.cliente.sobrenometitular + "\nSaldo: " + this.saldo;
    }
}
