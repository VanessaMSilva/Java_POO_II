/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.UUID;

/**
 *
 * @author vanes
 */
public class AluguelCarro {
    
    private float preçoAluguel;
    private float precoGasolina;
    private float distancia;
    private int tempo;
    private String nome;
    private int cpf;
    private UUID numeroDeAluguel;
   
    //calcula o tempo de viagem a partir do destino
    public int Tempo(int destino){
           switch(destino){
           //Sao paulo
           case 1:
               this.tempo = 1;
               return tempo;
        
           //Fortaleza
           case 2:
               this.tempo = 10;
               return tempo;
           
            //Paraguai:
           case 3:
               this.tempo = 5;
               return tempo;
       }
           return 0;
    }
    
    
    //calcula o preço de viagem a partir do destino
    public float precoDaGasolina(float gasolina) {
       this.precoGasolina = (float) (this.distancia*5.12);
       return this.precoGasolina;
    }
    
    public float Preco(int empresa) {
               
      switch(empresa){
            case 1:
                return this.preçoAluguel = (float) (1.2 * tempo);
            case 2:
                return this.preçoAluguel = (float) (1.5 * tempo);
        }
      return 0;
    }

     //calcula a distancia de viagem a partir do destino
    public float calcularDistancia(int destino) {
       switch(destino){
           //Sao paulo
           case 1:
               return this.distancia = 42;
           
           //Fortaleza
           case 2:
               return this.distancia = (float) 420;
            //Paraguai:
           case 3:
               return this.distancia = (float) 79;
               
       } 
       return 0;
    }
    public UUID numeroDeAluguel(){
        return(UUID.randomUUID());
    }
    
}
