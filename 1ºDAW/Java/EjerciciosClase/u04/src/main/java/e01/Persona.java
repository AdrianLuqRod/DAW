package e01;

public class Persona {
    private String nombre;
    private String dni;
    private Vehiculo coche;

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
    }

    public Persona() {
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void comprarCoche(Vehiculo coche) {
        this.coche = coche;
        this.coche.setPropietario(this);
    }

    public void venderCoche() {
        if (this.coche == null) {
            System.out.println("La persona no tiene coche.");
        } else {
            this.coche = null;
        }
    }

    public void arrancarCoche() {
        if (this.coche == null) {
            System.out.println("La persona no tiene coche.");
        } else {
            this.coche.arrancar();

        }
    }

    public void apagarCoche() {
        if (this.coche == null) {
            System.out.println("La persona no tiene coche.");
        } else {
            this.coche.apagar();
        }
    }

    public void recorrerDistancia(double numKm) {
        if (this.coche == null) {
            System.out.println("La persona no tiene coche.");
        } else {
            this.coche.recorrerDistancia(numKm);
        }
    }

    public void responerCombustible(double numLitros) {
        if (this.coche == null) {
            System.out.println("La persona no tiene coche.");
        } else {
            this.coche.reponerCombustible(numLitros);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Vehiculo getCoche() {
        return coche;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
