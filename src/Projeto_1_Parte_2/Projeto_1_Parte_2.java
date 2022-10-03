package Projeto_1_Parte_2;


import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

import Projeto_1.ContaBancaria;
import Projeto_1.ContaCorrente;
import Projeto_1.ContaPoupanca;

public class Projeto_1_Parte_2 {
	
	
	public static ArrayList <ContaBancaria> conta = new ArrayList<>();
	
    public void escreverBin(String nomeArq, String s) {
        try {
            FileOutputStream arqEscrita = new FileOutputStream(nomeArq);
            ObjectOutputStream os = new ObjectOutputStream(arqEscrita);
           
            os.writeObject(conta);
            os.close();            
            
        } catch (IOException erro) {
           JOptionPane.showMessageDialog(null,"Ocorreu um erro dos dados ");            
        }
    }    
    public void lerBi(String nomeArq, String s){
        try 
        {
            FileInputStream lerArq = new FileInputStream(nomeArq);
            ObjectInputStream lerEntrada = new ObjectInputStream(lerArq);
           
               	conta = (ArrayList<ContaBancaria>) lerEntrada.readObject();
                lerEntrada.close();
        }catch(IOException erro){
            JOptionPane.showMessageDialog(null, "Erro!!!"); 
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro!!!\nClasse nao encontrada"); 
        }
        
    }
    public void salvarTxt(String nomeArq){
        try{
            FileWriter arq  = new FileWriter(nomeArq);
            PrintWriter out = new PrintWriter(arq);
        for(int i = 0; i< conta.size(); i++){
            String linha = conta.get(i).toString();
            out.println(linha);
        }
        out.close();
        }catch(IOException erro){
            JOptionPane.showMessageDialog(null, "Erro na escrita de dados!!!\n");
        }
        JOptionPane.showMessageDialog(null, "Gerado com sucesso!!!\n");
    }
	
	
	
	public static void main(String[] args) {
		
		
		
		ContaBancaria cc = new ContaCorrente(12,34,"vanessa",100); //Instanciar 1 conta corrente (CC) com R$ 1000,00
		conta.add(cc);
		cc.depositar(1000);
		
		ContaBancaria cp = new ContaPoupanca(56,78,"amanda",0.5);//Instanciar 1 conta poupança (CP) com R$ 500,00
		conta.add(cp);
		cp.depositar(500);
		
		cc.depositar(390);//Depositar R$ 390,00 na CC
		
		System.out.println(cc.toString());//Imprimir saldo da CC
		
		cp.depositar(900);//Depositar R$ 900,00 na CP
		
		System.out.println(cp.toString());//Imprimir saldo da CP
				
		if(cc.sacar(40,34))//Sacar R$ 40,00 da CC
			System.out.println("Sacou");
		else
			System.out.println("Nao Sacou\n");
		System.out.println(cc.toString());
				
				
		if(cp.sacar(50,78))//Sacar R$ 50,00 da CP
			System.out.println("Sacou");
		else
			System.out.println("Nao Sacou\n");
		System.out.println(cp.toString());
	}
	
}