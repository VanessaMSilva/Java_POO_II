
package threadconcorrente;


public class ThreadConcorrente {

    public static void main(String[] args) {
        System.out.println("INICIO DA THREAD MAIN*****");
        Thread t1 = new Thread(new MinhaRunnable(),"thread 1");
        Thread t2 = new Thread( new MinhaRunnable(),"\t\tThread 2");
        t1.start();
        t2.start();
        }
    
}
