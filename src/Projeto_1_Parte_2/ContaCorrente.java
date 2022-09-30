package Projeto_1_Parte_2;

public class ContaCorrente extends ContaBancaria implements Autenticavel{
	public double limiteespecial;
	
	public ContaCorrente(int numero, int senha, Cliente cliente, double limiteespecial){
		super(numero, senha, cliente);
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

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0.01*saldo;
	}
}
