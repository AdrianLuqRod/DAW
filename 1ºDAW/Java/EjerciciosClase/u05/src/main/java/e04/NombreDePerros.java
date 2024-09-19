package e04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NombreDePerros {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreTexto;
        List nombres = new ArrayList();
        nombres.add("Toby");
        nombres.add("Rocky");
        nombres.add("Max");
        nombres.add("Pancho");
        nombres.add("Coco");
        nombres.add("Chispa");
        System.out.println("Actualmente conozco " + nombres.size() + ". Te los digo: ");
        Iterator iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("También te lo puedo decir en orden alfabético: ");
        Collections.sort(nombres);
        iter = nombres.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        do {
            System.out.printf("Pon nombres de perros: ");
            nombreTexto = sc.nextLine();
            if (!nombreTexto.equalsIgnoreCase("Fin")) {
                nombres.add(nombreTexto);
            }
        } while (!nombreTexto.equalsIgnoreCase("Fin"));
        Collections.sort(nombres);
        iter = nombres.iterator();
        System.out.println("Gracias ahora conozco " + nombres.size() + " nombres de perros. Te los digo en orden: ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
