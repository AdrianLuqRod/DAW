package e06;

public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo rx7 = new Vehiculo();
        ;
        Vehiculo nsx = new Vehiculo();
        ;
        rx7.setNumRuedas(4);
        rx7.setPotencia(100);
        rx7.setConsumoPorKm(0.06);
        rx7.reponerCombustible(30);
        rx7.arrancar();
        rx7.recorrerDistancia(100);
        rx7.apagar();
        rx7.arrancar();
        rx7.recorrerDistancia(200);
        rx7.imprimeAutonomiaEnKm();
        rx7.imprimeKmRecorridos();
        rx7.imprimeLitrosEnDeposito();
        rx7.imprimeNumRuedas();
        rx7.imprimePotencia();
        nsx.setNumRuedas(2);
        nsx.setPotencia(80);
        nsx.setConsumoPorKm(0.02);
        nsx.reponerCombustible(20);
        nsx.arrancar();
        nsx.recorrerDistancia(220);
        nsx.apagar();
        nsx.arrancar();
        nsx.recorrerDistancia(120);
        nsx.imprimeAutonomiaEnKm();
        nsx.imprimeKmRecorridos();
        nsx.imprimeLitrosEnDeposito();
        nsx.imprimeNumRuedas();
        nsx.imprimePotencia();
    }
}
