package e06;

import java.util.*;

public class Ciudades {
    public static void main(String[] args) {
        String[] ciudades = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el nombre de las 10 ciudades que mas te gusten: ");
        for (int i = 0; i < ciudades.length; i++) {
            ciudades[i] = sc.nextLine();
            if (i == ciudades.length - 1) {
                break;
            }
            System.out.printf("Introduce la siguiente: ");
        }
        Arrays.sort(ciudades);
        System.out.println(Arrays.toString(ciudades));
        sc.close();
    }
}
