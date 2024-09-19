package e05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ManipulandoCadenas {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        List cadenas = new ArrayList();
        cadenas = Arrays.asList("Vertical", "Horizontal", "Izquierda", "Derecha", "Adelante", "Atras", "Curvo", "Recto",
                "Arriba", "Abajo");

        System.out.println(cadenas.toString().toUpperCase());
        Collections.sort(cadenas);
        System.out.println(cadenas);
        System.out.println("");
        Iterator iter = cadenas.iterator();
        while (iter.hasNext()) {
            String cadena = (String) iter.next();
            if (cadena.startsWith("A")) {
                System.out.println(cadena);
            }
        }
        System.out.println("");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String cadena = (String) iter.next();
            if (cadena.endsWith("o")) {
                System.out.println(cadena);
            }
        }
        System.out.println("");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String cadena = (String) iter.next();
            if (cadena.contains("e")) {
                System.out.println(cadena);
            }
        }
        System.out.println("");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String cadena = (String) iter.next();
            if (cadena.length() == 5) {
                System.out.println(cadena);
            }
        }

        System.out.println("");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String cadena = (String) iter.next();
            if (cadena.length() == 5 && cadena.startsWith("A")) {
                System.out.println(cadena);
            }
        }

    }
}
