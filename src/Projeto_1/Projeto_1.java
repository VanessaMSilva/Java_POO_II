package Projeto_1;

public class Projeto_1 {
	public static void main(String[] args) {
		ContaBancaria b = new ContaBancaria(12,34,"vanessa");
		b.depositar(500);
		System.out.println(b.toString());
	}
}