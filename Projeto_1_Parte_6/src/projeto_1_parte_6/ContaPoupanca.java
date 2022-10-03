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
public class ContaPoupanca extends ContaBancaria {

    public double taxarendimento;

    public ContaPoupanca(int numero, int senha, Cliente cliente, double taxarendimento) {
        super(numero, senha, cliente);
        this.taxarendimento = taxarendimento;
    }
    // TODO Auto-generated constructor stub

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nTaxa rendimento: " + this.taxarendimento;
    }
}
