package Projeto_1;

public class Projeto_1 {
	public static void main(String[] args) {
		//Instanciar 1 conta corrente (CC) com R$ 1000,00
		ContaBancaria cc = new ContaCorrente(12,34,"vanessa",100);
		cc.depositar(1000);
		//Instanciar 1 conta poupança (CP) com R$ 500,00
		ContaBancaria cp = new ContaPoupanca(56,78,"amanda",0.5);
		cp.depositar(500);
		//Depositar R$ 390,00 na CC
		cc.depositar(390);
		//Imprimir saldo da CC
		System.out.println(cc.toString());
		//Depositar R$ 900,00 na CP
		cp.depositar(900);
		//Imprimir saldo da CP
		System.out.println(cp.toString());
		//Sacar R$ 40,00 da CC
		if(cc.sacar(40,34))
			System.out.println("Sacou");
		else
			System.out.println("Nao Sacou\n");
		System.out.println(cc.toString());
		
		//Sacar R$ 50,00 da CP
			if(cp.sacar(50,78))
				System.out.println("Sacou");
			else
				System.out.println("Nao Sacou\n");
			System.out.println(cp.toString());
	}
}