package Projeto_1;

public class ContaPoupanca extends ContaBancaria{
	public double taxarendimento;
	
	public ContaPoupanca(int numero, int senha, String nometitular, double taxarendimento) {
		super(numero, senha, nometitular);
		this.taxarendimento = taxarendimento;
	}
		// TODO Auto-generated constructor stub
		
	@Override
	public String toString(){
		// TODO Auto-generated method stub
		return super.toString() + "\nTaxa rendimento: "+ this.taxarendimento;
	}
}


