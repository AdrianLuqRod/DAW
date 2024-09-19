package Extra;

import java.util.*;

public class PruebaConjuntoPersona {
    public static void main(String[] args) {
        ConjuntoPersona cp = new ConjuntoPersona(10);
        int op;
        inicializaConjuntoPersona(cp);
        Scanner sc = new Scanner(System.in);
        do {
            op = mostrarMenu();
            switch (op) {
                case 0:
                    System.out.println("Adioos.");
                    break;

                case 1:
                    System.out.println("La capacidad del array es de " + cp.getCapacidad() + " elementos.");
                    break;

                case 2:
                    System.out.println(
                            "El numero actual de elementos guardados es de " + cp.getNumElemActual() + " elementos.");
                    break;

                case 3: {
                    Persona p = creaPersona();
                    devuelveResultado(cp, p);
                    break;
                }
                case 4: {
                    Persona p = creaPersona();
                    agregaPersona(cp, p);
                    break;
                }
                case 5:
                    System.out.println(cp.toString());
                    break;

            }
        } while (op != 0);
    }

    private static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------------------------");
        System.out.println("0 - Salir");
        System.out.println("1 - Obtener capacidad");
        System.out.println("2 - Obtener número actual de elementos guardados");
        System.out.println("3 - Preguntar si contiene una persona dada");
        System.out.println("4 - Agregar una persona dada al conjunto");
        System.out.println("5 - Mostrar el contenido del conjunto");
        System.out.println("Elige una opción: ");
        return sc.nextInt();
    }

    private static void inicializaConjuntoPersona(ConjuntoPersona cp) {
        Persona p1 = new Persona("Pepe", "Luque");
        Persona p2 = new Persona("Antonio", "Luque");
        Persona p3 = new Persona("Raul", "Luque");
        Persona p4 = new Persona("Javier", "Luque");
        cp.agrega(p1);
        cp.agrega(p2);
        cp.agrega(p3);
        cp.agrega(p4);
    }

    private static Persona creaPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Dime el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.printf("Dime el apellido de la persona: ");
        String apellidos = sc.nextLine();
        Persona p = new Persona(nombre, apellidos);
        return p;
    }

    private static void devuelveResultado(ConjuntoPersona cp, Persona p) {
        if (cp.contiene(p)) {
            System.out.println("La persona ya esta en el conjunto");
        } else {
            System.out.println("La persona no esta en el conjunto");
        }
    }

    private static void agregaPersona(ConjuntoPersona cp, Persona p) {
        cp.agrega(p);
    }
}