package e20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Concesionario {
    private String nombre, direccion;
    private Set<Vehiculo> conjuntoVehiculo;

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        conjuntoVehiculo = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void meteVehiculo(Vehiculo v) {
        conjuntoVehiculo.add(v);
    }

    public void actualizaVehiculo(Vehiculo v, Vehiculo v1) {
        if (conjuntoVehiculo.contains(v)) {
            conjuntoVehiculo.remove(v);
            conjuntoVehiculo.add(v1);
        } else {
            System.out.println("Este vehiculo no se encuentra en el conjunto");
        }
    }

    public void borraVehiculo(Vehiculo v) {
        if (conjuntoVehiculo.contains(v)) {
            conjuntoVehiculo.remove(v);
        } else {
            System.out.println("Este vehiculo no se encuentra en el conjunto");
        }
    }

    public void muestraVehiculos() {
        for (Vehiculo v : conjuntoVehiculo) {
            System.out.println(v);
        }
    }

    public double sumaTotalPrecios() {
        double precio = 0;
        for (Vehiculo v : conjuntoVehiculo) {
            precio += v.getPrecio();
        }
        return precio;
    }
}
