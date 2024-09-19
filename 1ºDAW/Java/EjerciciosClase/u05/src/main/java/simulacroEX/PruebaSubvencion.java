package simulacroEX;

import java.util.Iterator;

public class PruebaSubvencion {
    public static void main(String[] args) {
        Subvencion s1 = new Subvencion(16000, 3000);
        Persona p1 = new Persona("A", 23000, 33);
        Persona p2 = new Persona("B", 26000, 24);
        Persona p3 = new Persona("C", 23500, 45);
        Persona p4 = new Persona("D", 19600, 35);
        Persona p5 = new Persona("E", 21600, 43);
        Persona p6 = new Persona("F", 31000, 28);
        Persona p7 = new Persona("G", 24500, 33);
        Persona p8 = new Persona("H", 24500, 23);
        s1.agregaSolicitud(p1);
        s1.agregaSolicitud(p2);
        s1.agregaSolicitud(p3);
        s1.agregaSolicitud(p4);
        s1.agregaSolicitud(p5);
        s1.agregaSolicitud(p6);
        s1.agregaSolicitud(p7);
        s1.agregaSolicitud(p8);
        s1.agregaSolicitud(new Persona("B", 23000, 24));
        s1.adjudicaSubvencion();
        Iterator iter = s1.getAdmitidos().iterator();
        while (iter.hasNext()) {
            Persona p = (Persona) iter.next();
            System.out.println(iter.next());
        }
    }
}
