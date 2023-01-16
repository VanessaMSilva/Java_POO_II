/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthreads;

/**
 *
 * @author vanes
 */
public class TestThreads {
    
    public static void main(String[] args) {
       ThreadTwo t2 = new ThreadTwo();
       ThreadOne t1 = new ThreadOne();
       Thread two = new Thread(t2);
       Thread one = new Thread(t1);
       two.start();
       one.start();
    }
} 
    
    class ThreadOne implements Runnable{
        Accum a = Accum.getAccum();
        
        public void run(){
            for(int x=0;x <98;x++){
                a.updateCounter(1000);
                try{
                    Thread.sleep(50);
                }catch(Exception e){}
            }
            System.out.println("One " + a.getCount());
        }
    }
    
    class ThreadTwo implements Runnable{
        Accum a = Accum.getAccum();
        public void run(){
            for(int x=0;x <99;x++){
             a.updateCounter(1000);
                try{
                    Thread.sleep(50);
                }catch(Exception e){}
            }
            System.out.println("Two " + a.getCount());
        }
    }
    
