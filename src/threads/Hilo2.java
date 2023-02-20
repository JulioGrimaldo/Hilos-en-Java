package threads;



public class Hilo2 extends Thread {

    @Override
    public void run() {
        int i, j, n;
        n=5000;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println("");
        }
    }
}
