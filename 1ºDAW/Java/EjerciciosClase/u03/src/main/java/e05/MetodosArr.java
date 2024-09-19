package e05;

import java.util.*;

public class MetodosArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.printf("Introduce el numero de matriculados: ");
        int tam = sc.nextInt();
        sc.nextLine();
        int[] alumnos = new int[tam];
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = r.nextInt(101);
        }
        System.out.println(Arrays.toString(alumnos));
        Arrays.sort(alumnos);
        System.out.println(Arrays.toString(alumnos));
        System.out.println("La nota mas baja de la clase es: " + alumnos[0]);
        System.out.println("La nota mas alta de la clase es: " + alumnos[(alumnos.length - 1)]);
        sc.close();
    }
}
