package e06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FiltrandoLists {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        List filtros = new ArrayList();
        filtros.add("Vertical");
        filtros.add("Horizontal");
        filtros.add("Izquierda");
        filtros.add("Derecha");
        filtros.add("Adelante");
        filtros.add("Atras");
        filtros.add("Curvo");
        filtros.add("Recto");
        filtros.add("Arriba");
        filtros.add("Abajo");

        Collections.sort(filtros);
        System.out.println(filtros.toString());
        System.out.println("");
        Iterator iter = filtros.iterator();
        while (iter.hasNext()) {
            String filtro = (String) iter.next();
            if (filtro.endsWith("o")) {
                iter.remove();
            }
        }
        System.out.println(filtros);
        System.out.println("");
        iter = filtros.iterator();

        while (iter.hasNext()) {
            String filtro = (String) iter.next();
            if (filtro.contains("t")) {
                iter.remove();
            }
        }
        System.out.println(filtros);
        System.out.println("");
        iter = filtros.iterator();
        while (iter.hasNext()) {
            String filtro = (String) iter.next();
            if (filtro.contains("a") || filtro.length() >= 5) {
                iter.remove();
            }
        }
        System.out.println(filtros);

    }
}
