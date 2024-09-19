package e17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PruebaMapaCliente {
    public static void main(String[] args) {
        Map clientes = new HashMap();
        Cliente c1 = new Cliente(1, "Adri", "LR");
        Cliente c2 = new Cliente(2, "Gonzalo", "FR");
        Cliente c3 = new Cliente(3, "Juanma", "GR");
        clientes.put(c1.getIdCliente(), c1);
        clientes.put(c2.getIdCliente(), c2);
        clientes.put(c3.getIdCliente(), c3);
        Iterator iter = clientes.keySet().iterator();
        while (iter.hasNext()) {
            int clave = (int) iter.next();
            System.out.println(clientes.get(clave));
        }
        clientes.remove(1);
        System.out.println("");
        c3 = (Cliente) clientes.get(3);
        c3.setNombre("Manuela");
        clientes.put(c3.getIdCliente(), c3);
        iter = clientes.keySet().iterator();
        while (iter.hasNext()) {
            int clave = (int) iter.next();
            System.out.println(clientes.get(clave));
        }
    }
}
