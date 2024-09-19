package e07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaOrdenPersonas {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        List personas = new ArrayList();
        Persona p1 = new Persona("Pepe", "12345678Z", 20);
        Persona p2 = new Persona("Mar", "12345678X", 79);
        Persona p3 = new Persona("Adrian", "12345678C", 21);
        Persona p4 = new Persona("Mario", "12345678V", 22);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        System.out.println(personas);
        Collections.sort(personas);
        System.out.println(personas);
    }
}
