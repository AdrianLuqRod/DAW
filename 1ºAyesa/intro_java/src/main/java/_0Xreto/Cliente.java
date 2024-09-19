package _0Xreto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private Integer presupuesto;
    private List<Coche> coches;

    public Cliente(String nombre, Integer presupuesto) {
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        coches = new ArrayList<Coche>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public void setCoches(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", presupuesto=" + presupuesto + ", coches=" + coches + "]";
    }

}
