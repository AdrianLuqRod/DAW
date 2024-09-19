package e15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PruebaSetPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(23, 1, "A", "Adri", "LR", "Calle1", true, true);
        Persona p2 = new Persona(20, 2, "A", "Gonzalo", "FR", "Calle2", true, true);
        Persona p3 = new Persona(18, 3, "B", "Juanma", "GR", "Calle3", true, true);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        Set personas = new HashSet();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        Iterator iter = personas.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
