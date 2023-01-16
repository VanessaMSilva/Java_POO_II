/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadparimpar;

import java.util.Scanner;

/**
 *
 * @author vanes
 */
public class ThreadParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("**INICIO PROGRAMAÇÃO CONCORRENTE**");
        Thread par = new Thread(new Par(),"par 1");
        Thread num = new Thread(new Par(),"\t\tpar 2");
        par.start();
        num.start();
        
        try{
            par.join();
            num.join();
        }catch(Exception e){
            
        }
        System.out.println("***FIM PROGRAMAÇÃO CONCORRENTE***");
        
    }
    
}
