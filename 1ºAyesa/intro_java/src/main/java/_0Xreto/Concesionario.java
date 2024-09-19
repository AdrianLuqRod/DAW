package _0Xreto;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Concesionario {
    private SortedSet<Coche> coches;

    public Concesionario() {
        coches = new TreeSet<Coche>();
    }

    public Concesionario(Comparator c) {
        coches = new TreeSet<Coche>(c);
    }

    public SortedSet<Coche> getCoches() {
        return coches;
    }

    public void setCoches(SortedSet<Coche> coches) {
        this.coches = coches;
    }

    public void comprarCoche(Cliente cl, Coche co) {
        if (cl == null || co == null) {
            throw new IllegalArgumentException("Cliente o coche no pueden ser nulos");
        }
        if (!coches.contains(co)) {
            throw new IllegalArgumentException("El coche no está en el concesionario");
        }
        if (cl.getPresupuesto() < co.getPrecio()) {
            throw new IllegalArgumentException("El cliente no dispone de dinero suficiente para comprar el coche");
        }
        coches.remove(co);
        cl.setPresupuesto(cl.getPresupuesto() - co.getPrecio());
        cl.getCoches().add(co);
    }

    @Override
    public String toString() {
        return "Concesionario [coches=" + coches + "]";
    }

}
