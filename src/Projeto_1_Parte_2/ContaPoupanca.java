package Projeto_1_Parte_2;

public class ContaPoupanca extends ContaBancaria{
	public double taxarendimento;
	
	public ContaPoupanca(int numero, int senha, Cliente cliente, double taxarendimento) {
		super(numero, senha, cliente);
		this.taxarendimento = taxarendimento;
	}
		// TODO Auto-generated constructor stub
		
	@Override
	public String toString(){
		// TODO Auto-generated method stub
		return super.toString() + "\nTaxa rendimento: "+ this.taxarendimento;
	}
}


