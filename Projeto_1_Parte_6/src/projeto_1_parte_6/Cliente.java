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
public class Cliente {
    public String nometitular;
	public String sobrenometitular;
	public String endereco;
	
	public Cliente(String nometitular, String sobrenometitular, String endereco) {
		this.endereco = endereco;
		this.nometitular = nometitular;
		this.sobrenometitular = sobrenometitular;
	}
}
