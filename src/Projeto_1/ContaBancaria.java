package Projeto_1;


public class ContaBancaria {
	public int numero;
	private int senha;
	protected double saldo;
	public String nometitular;
	
	public ContaBancaria (int numero, int senha, String nometitular) {
		this.numero = numero;
		this.senha = senha;
		this.nometitular = nometitular;
		this.saldo = 0;
	}
	
	public boolean sacar(double valor, int senha) {
		
		if(this.saldo>valor && verificasenha(senha)) {
			this.saldo -= valor;
			return true;
		}else
			return false;
	}
	
	protected boolean verificasenha(int senha) {
		return this.senha == senha;
	}
	
	public void depositar(double valor) {
		if(valor>0)
			saldo += valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n_______________________\nConta Bancaria: \nnumero: " + this.numero + "\nsenha: " + this.senha + "\nNome Titular: " + this.nometitular + "\nSaldo: " + this.saldo;
	}
}
