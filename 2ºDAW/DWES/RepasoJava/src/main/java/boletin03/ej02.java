package boletin03;

/*
TODO: Realiza una traza del siguiente algoritmo y muestra la salida generada por pantalla.
    PROGRAMA ej_1
    VARIABLES
    i, j: ENTERO
    COMIENZO
    PARA i <- 1 HASTA 3
    j <- i+1
    MIENTRAS j < 4
    escribir (j-i)
    j <- j+1
    FIN MIENTRAS
    FIN PARA
    FIN
 */

public class ej02 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int j = i + 1;
            while (j < 4) {
                System.out.println(j - i);
                j++;
            }
        }
    }
}
