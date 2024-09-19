package e11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Flota {
    private Set<Camion> flota;

    public Flota() {
        flota = new HashSet<>();
    }

    public void altaCamion(Camion c) {
        flota.add(c);
    }

    public boolean contieneCamion(Camion c) {
        return flota.contains(c);
    }

    public boolean bajaCamion(Camion c) {
        return flota.remove(c);
    }

    public void imprimeFlota() {
        Iterator iter = flota.iterator();
        for (int i = 1; i <= flota.size(); i++) {
            System.out.println(i + " - " + iter.next().toString());
        }
    }

    public void ponerFlotaEnRuta() {
        for (Camion c : flota) {
            try {
                c.realizaRuta();
                System.out.println("En ruta " + c.toString());
            } catch (DepositoIncompletoException e) {
                c.llenaDeposito();
                System.out.println("Se llena el deposito y se pone en ruta " + c.toString());
            } catch (TransporteException e) {
                System.out.println(e.getMessage() + ": " + c.toString());
            }
        }
    }

}
