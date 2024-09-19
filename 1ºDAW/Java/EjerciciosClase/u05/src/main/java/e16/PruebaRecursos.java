package e16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PruebaRecursos {
    public static void main(String[] args) {
        Set recursos = new HashSet();
        List listaKen = creaListaUnAutor("Ken", "Follet", "BR");
        recursos.add(new Recurso(9788, 10, "Los pilares de la tierra", listaKen));
        List listaIdelfonso = creaListaUnAutor("Ildefonso", "Falcones", "ES");
        recursos.add(new Recurso(9789, 8, "La catedral del mar", listaIdelfonso));
        Iterator iter = recursos.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static List creaListaUnAutor(String nOMBRE, String aPELLIDOS, String nACIONALIDAD) {
        Autor ken = new Autor(nOMBRE, aPELLIDOS, nACIONALIDAD);
        List listaKen = new ArrayList();
        listaKen.add(ken);
        return listaKen;

    }
}
