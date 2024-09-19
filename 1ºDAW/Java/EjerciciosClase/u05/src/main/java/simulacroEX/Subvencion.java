package simulacroEX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Subvencion {
    private double presupuesto, cantPorPersona;
    private List solicitantes, admitidos, excluidos;
    private boolean plazoAbierto;

    public Subvencion(double presupuesto, double cantPorPersona) {
        solicitantes = new ArrayList();
        admitidos = new ArrayList();
        excluidos = new ArrayList();
        this.presupuesto = presupuesto;
        this.cantPorPersona = cantPorPersona;
        this.plazoAbierto = true;
    }

    public void agregaSolicitud(Persona p) {
        if (plazoAbierto) {
            if (solicitantes.contains(p)) {
                solicitantes.remove(p);
                solicitantes.add(p);
            }
        } else {
            System.out.println("Plazo Cerrado.");
        }
    }

    public void adjudicaSubvencion() {
        plazoAbierto = false;
        Collections.sort(solicitantes);
        Iterator iter = solicitantes.iterator();
        while (iter.hasNext()) {
            if (presupuesto >= cantPorPersona) {
                admitidos.add(iter.next());
                presupuesto -= cantPorPersona;
            } else {
                excluidos.add(iter.next());
            }
        }
    }

    public List getAdmitidos() {
        List copiaAdmitidos = new ArrayList();
        Iterator iter = admitidos.iterator();
        while (iter.hasNext()) {
            Persona p = (Persona) iter.next();
            copiaAdmitidos.add(new Persona(p.getDni(), p.getRentaAnual(), p.getEdad()));
        }
        Collections.sort(copiaAdmitidos);
        return copiaAdmitidos;
    }

    public List getExcluidos() {
        List getExcluidos = new ArrayList();
        Iterator iter = excluidos.iterator();
        while (iter.hasNext()) {
            Persona p = (Persona) iter.next();
            getExcluidos.add(new Persona(p.getDni(), p.getRentaAnual(), p.getEdad()));
        }
        Collections.sort(getExcluidos);
        return getExcluidos;
    }

}
