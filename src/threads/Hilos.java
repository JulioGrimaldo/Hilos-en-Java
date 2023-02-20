package threads;

public class Hilos {

 

    public static void main(String[] args) {
        Hilo1 Hilofibo = new Hilo1();
        Hilo2 Hilon2 = new Hilo2();
        Hilo3 Hilon3 = new Hilo3();

        Hilofibo.start();
        Hilon2.start();
        Hilon3.start();
    }

}
