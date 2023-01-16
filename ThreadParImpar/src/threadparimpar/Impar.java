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
public class Impar implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(300);
        }catch(Exception e){
            e.printStackTrace();
        }
        String nome = Thread.currentThread().getName();
        System.out.println(nome + "ocorrendo");
        
        for(int i = 1; i < 10; i=i+2)
            System.out.println(nome + ": " + i);
        System.out.println("FIM " + nome + "***********");
    }
    
}
