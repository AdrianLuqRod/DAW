package e18;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class MapaHabitaciones {
    public static void main(String[] args) {
        Map estadoHabitaciones = new HashMap();
        iniciaHabitaciones(estadoHabitaciones);
        mostrarMenu(estadoHabitaciones);

    }

    private static void iniciaHabitaciones(Map m) {
        m.put(101, false);
        m.put(102, true);
        m.put(103, true);
        m.put(104, false);
        m.put(105, true);
        m.put(201, true);
        m.put(202, true);
        m.put(203, false);
        m.put(204, true);
        m.put(205, false);
    }

    private static void mostrarMenu(Map m) {
        int op;
        do {
            System.out.println("0-Salir");
            System.out.println("1-Ver estado de ocupación");
            System.out.println("2-Ocupar una habitación");
            System.out.println("3-Liberar una habitación");
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la opcion que desees: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 0:
                    System.out.println("Aaaadios.");
                    break;
                case 1:
                    estadoHabitacion(m);
                    break;
                case 2:
                    ocuparHabitacion(m);
                    break;
                case 3:
                    liberarHabitacion(m);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }
        } while (op != 0);
    }

    private static void estadoHabitacion(Map m) {
        Set claves = m.keySet();
        Iterator iter = claves.iterator();
        while (iter.hasNext()) {
            int numHab = (int) iter.next();
            Boolean ocupada = (boolean) m.get(numHab);
            String estado = "Libre";
            if (ocupada) {
                estado = "Ocupada";
            }
            System.out.println("Habitacion " + numHab + ": " + estado);
        }
    }

    private static void ocuparHabitacion(Map m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que habitacion deseas ocupar?: ");
        int numHab = sc.nextInt();
        Set claves = m.keySet();
        if (claves.contains(numHab)) {
            Boolean ocupada = (Boolean) m.get(numHab);
            if (ocupada) {
                System.out.println("Esta habitacion ya esta ocupada");
            } else {
                m.put(numHab, true);
            }
        } else {
            System.out.println("Esa habitacion no existe.");
        }
    }

    private static void liberarHabitacion(Map m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que habitacion deseas liberar?: ");
        int numHab = sc.nextInt();
        Set claves = m.keySet();
        if (claves.contains(numHab)) {
            Boolean ocupada = (Boolean) m.get(numHab);
            if (!ocupada) {
                System.out.println("Esta habitacion ya esta libre");
            } else {
                m.put(numHab, false);
            }
        } else {
            System.out.println("Esa habitacion no existe.");
        }
    }
}
