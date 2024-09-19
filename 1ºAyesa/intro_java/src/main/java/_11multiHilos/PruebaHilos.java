package _11multiHilos;

public class PruebaHilos {
    public static void main(String[] args) {
        Corredor c1 = new Corredor("Antonio");
        Corredor c2 = new Corredor("Mar");
        Corredor c3 = new Corredor("Adrián");

        Corredor.setDistancia(10);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();

    }
}
