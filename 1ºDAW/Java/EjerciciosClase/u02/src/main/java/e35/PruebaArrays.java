package e35;

public class PruebaArrays {
    public static void main(String[] args) {
        double[] notas = new double[25];
        notas[2] = 4.3;
        notas[3] = 5.3;
        notas[5] = 5.6;
        notas[7] = 7.8;
        System.out.println(notas[0] + "," + notas[2] + "," + notas[4] + "," + notas[5]);
        int[] metrosRecorridos = { 200, 400, 800, 1500, 42000 };
        System.out.println(metrosRecorridos[0] + "," + metrosRecorridos[1] + "," + metrosRecorridos[2]);
        System.out.println(metrosRecorridos[20]);
    }
}
