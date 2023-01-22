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
    public int Tempo(int destino) {
        switch (destino) {
            //Sao paulo
            case 1:
                this.tempo = 1;
            //Fortaleza
            case 2:
                this.tempo = 10;

            //Paraguai:
            case 3:
                this.tempo = 5;
        }
        return tempo;
    }

    //calcula o preço de viagem a partir do destino
    public float precoDaGasolina(float gasolina) {
        this.precoGasolina = (float) (this.distancia * 5.0);
        return this.precoGasolina;
    }

    public float custoAluguel(int empresa) {

        switch (empresa) {
            case 1:
                this.preçoAluguel = (float) (12 * tempo);
            case 2:
                this.preçoAluguel = (float) (15 * tempo);
        }
        return this.preçoAluguel;

    }

    //calcula a distancia de viagem a partir do destino
    public float calcularDistancia(int destino) {
        switch (destino) {
            //Sao paulo
            case 1:
                this.distancia = 42;
            //Fortaleza
            case 2:
                this.distancia = (float) 420;
            //Paraguai:
            case 3:
                this.distancia = (float) 79;

        }
        return this.distancia;
    }

    public UUID numeroDeAluguel() {
        return (UUID.randomUUID());
    }

}
