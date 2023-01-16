/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadparimpar;

/**
 *
 * @author vanes
 */
public class Par implements Runnable{
    public void run(){
        String nome = Thread.currentThread().getName();
        System.out.println( nome + " ocorrendo");
        for(int i = 0; i < 10; i = i + 2)
            System.out.println(nome + ": " + i);
        System.out.println("\tFIM *******");
    }
}
