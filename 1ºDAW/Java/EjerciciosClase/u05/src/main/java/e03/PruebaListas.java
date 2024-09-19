package e03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PruebaListas {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        List meses = new ArrayList();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");
        meses.add("Junio");
        meses.add("Julio");
        meses.add("Agosto");
        meses.add("Septiembre");
        meses.add("Octubre");
        meses.add("Noviembre");
        meses.add("Diciembre");
        System.out.println("Esta la lista vacia?: " + meses.isEmpty());
        System.out.println("Cuantos elementos tiene?: " + meses.size());
        System.out.println("Contiene el mes 'Henero'?: " + meses.contains("Henero"));

        Iterator iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
        System.out.println("");
        Collections.sort(meses);
        iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("");
        meses.clear();
        iter = meses.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}