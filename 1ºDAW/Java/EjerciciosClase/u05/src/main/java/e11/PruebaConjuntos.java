package e11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PruebaConjuntos {
    public static void main(String[] args) {
        Set canditatos = new HashSet();
        canditatos.add("Juan");
        canditatos.add("Ana");
        canditatos.add("Pedro");
        canditatos.add("Rosa");
        canditatos.add("Maria");
        System.out.println("Esta vacio?: " + canditatos.isEmpty());
        System.out.println("Cuantos elementos tengo?: " + canditatos.size());
        System.out.println("Tengo el candidato 'Pedro'?: " + canditatos.contains("Pedro"));
        System.out.println("");
        Iterator iter = canditatos.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        Set seleccionados = new HashSet();
        iter = canditatos.iterator();
        while (iter.hasNext()) {
            String candidato = (String) iter.next();
            if (candidato.contains("a")) {
                seleccionados.add(candidato);
            }
        }
        iter = seleccionados.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
