package testthreads;

public class Accum {

    private static Accum a = new Accum();
    private int counter = 0;

    private Accum() {}

    public int getCount() {
        return counter;
    }

    public void updateCounter(int add) {
        counter += add;
    }

    public static Accum getAccum() {
        return a;
    }
    
}