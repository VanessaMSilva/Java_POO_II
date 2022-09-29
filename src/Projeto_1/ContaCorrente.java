package Projeto_1;

public class ContaCorrente extends ContaBancaria{
	public double limiteespecial;
	
	public ContaCorrente(int numero, int senha, String nometitular, double limiteespecial){
		super(numero, senha, nometitular);
		this.limiteespecial = limiteespecial; 
	}
	
	public boolean sacar(double valor, int senha) {
		if(saldo + limiteespecial >valor && verificasenha(senha)) {
			
			if(super.sacar(valor,senha)== false) {
				this.saldo -= valor;
				this.limiteespecial += saldo;
				super.saldo = 0;
			}	
			return true;
		}
		return false;
		
	}
}
