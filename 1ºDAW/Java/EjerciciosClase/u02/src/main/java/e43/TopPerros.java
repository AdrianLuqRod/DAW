package e43;

import java.util.Scanner;

public class TopPerros {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        String[] dogs = { "Tobby", "Rocky", "Filete", "Perruedines", "Torrija" };
        System.out.printf("Write the name of a dog:");
        String name = sc.nextLine();
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].equalsIgnoreCase(name)) {
                System.out.println(
                        "El nombre " + name + " ocupa el puesto " + (i + 1) + " del TOP 5 de nombres de perros");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("El nombre " + name + " no está en el TOP 5 de nombres de perros");
        }
        sc.close();
    }
}
