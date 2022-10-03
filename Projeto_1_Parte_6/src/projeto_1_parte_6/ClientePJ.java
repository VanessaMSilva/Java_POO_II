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
public class ClientePJ extends Cliente{
    protected String CNPJ;
	
	public ClientePJ(String nometitular, String sobrenometitular, String endereco, String CNPJ) {
		super(nometitular, sobrenometitular, endereco);
		this.CNPJ = CNPJ;
		// TODO Auto-generated constructor stub
	}
}
