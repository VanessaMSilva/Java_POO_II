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
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        
        myThread.start();
        try{
            myThread.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("back in main");
    }
    
}
