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
public class ClientePF extends Cliente{
    	public String cpf;
	
	public ClientePF(String nometitular, String sobrenometitular, String endereco,String cpf) {
		super(nometitular, sobrenometitular, endereco);
		this.cpf = cpf;
		// TODO Auto-generated constructor stub
	}
}
