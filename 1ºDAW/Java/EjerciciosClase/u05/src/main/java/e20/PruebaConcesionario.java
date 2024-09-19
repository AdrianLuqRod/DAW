package e20;

public class PruebaConcesionario {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Marca1", "Modelo1", "Matricula1", 1900, 32133.99);
        Vehiculo v2 = new Vehiculo("Marca2", "Modelo2", "Matricula2", 2020, 89133.99);
        Vehiculo v3 = new Vehiculo("Marca3", "Modelo3", "Matricula3", 1800, 30133.99);
        Vehiculo v4 = new Vehiculo("Marca4", "Modelo4", "Matricula4", 1700, 26133.99);
        Vehiculo v5 = new Vehiculo("Marca4", "Modelo4", "Matricula4", 1600, 26133.99);
        Concesionario c = new Concesionario("Nombre1", "Direccion1");
        c.meteVehiculo(v1);
        c.meteVehiculo(v2);
        c.meteVehiculo(v3);
        c.meteVehiculo(v4);
        c.muestraVehiculos();
        c.actualizaVehiculo(v4, v5);
        c.muestraVehiculos();
        c.borraVehiculo(v2);
        System.out.println(c.sumaTotalPrecios());
    }
}
