/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author vanes
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
    
}
