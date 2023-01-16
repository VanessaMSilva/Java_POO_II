/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadconcorrente;

/**
 *
 * @author vanes
 */
public class MinhaRunnable implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " rodando");
        for(int i = 0; i < 4; i++)
            System.out.println(name + ": " + i);
        System.out.println("FIM***");
    }
    
}
