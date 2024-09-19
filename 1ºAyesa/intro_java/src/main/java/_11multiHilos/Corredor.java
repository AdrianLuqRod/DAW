package _11multiHilos;

public class Corredor implements Runnable {

    private static String vencedor;
    private String nombre;
    private static Integer distancia;

    public Corredor(String nombre) {
        this.nombre = nombre;
    }

    public static String getVencedor() {
        return vencedor;
    }

    public static void setVencedor(String vencedor) {
        Corredor.vencedor = vencedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Integer getDistancia() {
        return distancia;
    }

    public static void setDistancia(Integer distancia) {
        Corredor.distancia = distancia;
    }

    @Override
    public void run() {
        for (int i = 0; i < distancia; i++) {
            if (vencedor != null) {
                break;
            }
            System.out.println(nombre + " ha recorrido " + (i + 1) + " metros");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        if (vencedor == null) {
            vencedor = nombre;
            System.out.println("El vencedor es: " + vencedor);
        }
    }
}
