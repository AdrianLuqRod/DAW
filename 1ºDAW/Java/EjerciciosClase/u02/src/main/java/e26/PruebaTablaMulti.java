package e26;

public class PruebaTablaMulti {
    public static void main(String[] args) {
        int cont = 0, num = 9;
        while (cont <= 10) {
            System.out.println(cont + "x" + num + "=" + cont * num);
            cont++;
        }
        // - Usando bucle for
        // . for (cont = 0; cont <= 10; cont++) {
        // . System.out.println(cont + "x" + num + "=" + cont * num);
        // . }
        // - Ejercicio 27
        // . Scanner sc = new Scanner(System.in);
        // . int cont = 0;
        // . System.out.printf("Introduce numero a multiplicar: ");
        // . int num = sc.nextInt();
        // . sc.nextLine();
        // . while (cont <= 10) {
        // . System.out.println(cont + "*" + num + "=" + cont * num);
        // . cont++;
        // . }
        // . sc.close();
    }
}
