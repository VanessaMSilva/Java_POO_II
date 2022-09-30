package Projeto_1_Parte_2;

public class ClientePJ extends Cliente{
	protected String CNPJ;
	
	public ClientePJ(String nometitular, String sobrenometitular, String endereco, String CNPJ) {
		super(nometitular, sobrenometitular, endereco);
		this.CNPJ = CNPJ;
		// TODO Auto-generated constructor stub
	}
}
