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
public class AdapterAluguel extends Passagem{

    private AluguelCarro ac = new AluguelCarro();
    
    
     @Override
    public Passagem gerarPassagem(int empresa, int destino, String nome, int cpf) {
       
        calcularTempo(destino);
        calcularPreco(destino, empresa);
        calcularDistancia(destino);
        this.id = gerarId();
        return this;
    }
    
    
    @Override
    public void calcularPreco(int destino, int empresa) {
        this.preco = ac.custoAluguel(destino, empresa) + ac.precoDaGasolina(destino);
    }

    @Override
    public void calcularDistancia(int destino) {
        this.distancia = ac.calcularDistancia(destino);
    }

    @Override
    public void calcularTempo(int destino) {
        this.tempo = ac.Tempo(destino);
    }

    @Override
    public UUID gerarId() {
        return ac.numeroDeAluguel();
    }

   

    @Override
    public UUID getId() {
        return this.id;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int getCpf() {
        return this.cpf;
    }

    @Override
    public int getTempo() {
        return this.tempo;
    }

    @Override
    public float getDistancia() {
        return this.distancia;
    }

    @Override
    public float getPreco() {
        return this.preco;
    }
    
}
