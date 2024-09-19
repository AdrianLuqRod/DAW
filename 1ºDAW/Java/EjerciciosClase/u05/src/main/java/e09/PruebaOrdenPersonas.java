package e09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaOrdenPersonas {
    public static void main(String[] args) {
        List personas = new ArrayList();

        personas.add(new Persona("Mar", "12345678Z", 20));
        personas.add(new Persona("Mar", "12345678X", 79));
        personas.add(new Persona("Adrian", "12345678C", 21));
        personas.add(new Persona("Mario", "12345678V", 22));
        System.out.println(personas);
        Collections.sort(personas);
        System.out.println(personas);
    }
}
