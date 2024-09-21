package boletin03;

/*
TODO: Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), que muestre los números del 0-0-0-0-0 al 9-9-9-9-9, con
 la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */

public class ej05 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            if (i == 3)
                                System.out.print("E");
                            else
                                System.out.print(i);
                            if (j == 3)
                                System.out.print("E");
                            else
                                System.out.print(j);
                            if (k == 3)
                                System.out.print("E");
                            else
                                System.out.print(k);
                            if (l == 3)
                                System.out.print("E");
                            else
                                System.out.print(l);
                            if (m == 3)
                                System.out.print("E");
                            else
                                System.out.print(m);
                            System.out.println(" ");
                        }
                    }
                }
            }
        }
    }
}
