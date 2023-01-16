/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtest;

/**
 *
 * @author vanes
 */
public class MyRunnable implements Runnable {

    public void run(){
        go();
    }
    
    public void go(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        doMore();
    }
    
    public void doMore(){
        System.out.println("Top'o the satck!");
    }
}
