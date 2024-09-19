package _02OrdenarMatriz;

import java.util.Arrays;

public class OrdenarMatrices {
    public static void main(String[] args) {
        Integer cont = 0;
        Integer[][] matriz = { { -2, 4, 1, 3 }, { 5, 0, -1, 1 }, { -3, 2, 4, 1 }, { 8, 5, 3, -1 } };
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + ",");
                cont++;
            }
            System.out.print("}");
            System.out.println();

        }
        Integer[] matrizOrdenada = new Integer[cont];
        System.out.println("-------------------------");
        cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizOrdenada[cont] = matriz[i][j];
                cont++;
            }
        }
        Arrays.sort(matrizOrdenada);
        System.out.println(Arrays.toString(matrizOrdenada));
    }

}
