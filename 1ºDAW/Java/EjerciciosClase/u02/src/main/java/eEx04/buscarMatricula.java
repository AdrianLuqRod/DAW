package eEx04;

import java.util.Scanner;

public class buscarMatricula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ? Se inicializa un array con los valores dados y una 'flag'
        boolean flag = false;
        String[] matr = { "5432-FNT", "9823-TRH", "3451-LPU", "1937-YHN", "8474-PMG", "8183-TGF", "0293-SDR" };
        // ? Se pide una matrícula por teclado.
        System.out.printf("Introduce matricula: ");
        String buscar = sc.nextLine();
        // ? Se busca si la matrícula por teclado coincida con alguna del array.
        for (int i = 0; i < matr.length; i++) {
            if (matr[i].equalsIgnoreCase(buscar)) {
                System.out.println("Llamar a la Poli");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Matrícula no encontrada.");
        }
        sc.close();
    }
}
