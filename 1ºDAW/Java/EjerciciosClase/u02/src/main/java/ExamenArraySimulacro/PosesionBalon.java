package ExamenArraySimulacro;

import java.util.Scanner;

public class PosesionBalon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        boolean supera = false;
        int[] tiempoPosesion = { 180, 120, 90, 180, 120, 120, 120, 240, 78, 270, 180, 120, 120, 180, 204, 420, 360, 420,
                480, 300, 120, 180, 600, 258 };
        do {
            System.out.println("--------------------\n" +
                    "0-Salir\n" +
                    "1-Lista de posesiones del partido\n" +
                    "2-Mostrar la duracion media de la posesion del balon\n" +
                    "3-Mostrar los totales de posesion\n" +
                    "4-Buscar la primera posesion con mas de X segundos de duracion\n" +
                    "5-Buscar todas las posesiones con mas de X segundos de duracion\n");
            System.out.println("Elige una opcion");
            op = sc.nextInt();

            sc.nextLine();
            switch (op) {
                case 1:
                    double total = 0;
                    for (int i = 0; i < tiempoPosesion.length; i++) {
                        if (i % 2 == 0) {
                            System.out.println((tiempoPosesion[i] / 60.0) + " minutos del equipo local");
                        } else {
                            System.out.println((tiempoPosesion[i] / 60.0) + " minutos del equipo visitante");
                        }
                        total += tiempoPosesion[i];
                    }
                    System.out.println("Se han jugado un total de " + (total / 60.0) + " minutos");
                    break;

                case 2:
                    double mediaLocal = 0, mediaVisitante = 0;
                    System.out.println("Duracion media de la posesion del balon:");
                    for (int i = 0; i < tiempoPosesion.length; i++) {
                        mediaLocal = (mediaLocal + (tiempoPosesion[i] / 60.0));
                        i++;
                    }
                    for (int i = 1; i < tiempoPosesion.length; i++) {
                        mediaVisitante = (mediaVisitante + (tiempoPosesion[i] / 60.0));
                        i++;
                    }
                    // if (i % 2 == 0) {
                    // mediaLocal = mediaLocal + ((tiempoPosesion[i] / 60.0));
                    // } else {
                    // mediaVisitante = mediaVisitante + ((tiempoPosesion[i] / 60.0));
                    // }
                    // }
                    mediaLocal = mediaLocal / ((tiempoPosesion.length) / 2);
                    mediaVisitante /= ((tiempoPosesion.length) / 2);
                    System.out.println("-Equipo local " + mediaLocal + " minutos\n" +
                            "-Equipo visitante " + mediaVisitante + " minutos");
                    break;

                case 3:
                    double tiempoTotal = 0, totalLocal = 0, totalVisitante = 0;
                    System.out.println("Minutos de posesion del balon:");
                    for (int i = 0; i < tiempoPosesion.length; i++) {
                        if (i % 2 == 0) {
                            totalLocal += (double) tiempoPosesion[i];
                        } else {
                            totalVisitante += (double) tiempoPosesion[i];
                        }
                    }
                    tiempoTotal = totalLocal + totalVisitante;
                    System.out.println("-Equipo local " + (totalLocal / 60.0) + " minutos\n" +
                            "-Equipo visitante " + (totalVisitante / 60.0) + " minutos");
                    totalLocal = (totalLocal / tiempoTotal) * 100;
                    totalVisitante = (totalVisitante / tiempoTotal) * 100;
                    System.out.println("Porcentaje de posesión del balon:\n" +
                            "-Equipo local: " + totalLocal + "%\n" +
                            "-Equipo Visitante: " + totalVisitante + "%");
                    break;

                case 4:
                    supera = false;
                    System.out.printf("Dime el numero de segundos de posesion:");
                    int num = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < tiempoPosesion.length; i++) {
                        if ((num < tiempoPosesion[i]) && (i % 2 == 0)) {
                            System.out.println("Primera posicion que supera los " + num + " segundos:\n" +
                                    "-Equipo local con " + tiempoPosesion[i] + " segundos");
                            supera = true;
                            break;
                        } else if ((num < tiempoPosesion[i]) && (i % 2 != 0)) {
                            System.out.println("Primera posicion que supera los " + num + " segundos:\n" +
                                    "-Equipo visitante con " + tiempoPosesion[i] + " segundos");
                            supera = true;
                            break;
                        }
                    }
                    if (!supera) {
                        System.out.println("Ninguno de los equipos ha superado los " + num + " segundos");
                    }
                    break;

                case 5:
                    supera = false;
                    System.out.printf("Dime el numero de segundos de posesion:");
                    int num2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Las posesiones que superan los " + num2 + " segundos son:");
                    for (int i = 0; i < tiempoPosesion.length; i++) {
                        if (num2 > tiempoPosesion[i] && i % 2 == 0) {
                            System.out.println("-Equipo local con " + tiempoPosesion[i] + " segundos");
                            supera = true;

                        } else if (num2 > tiempoPosesion[i] && i % 2 != 0) {
                            System.out.println("-Equipo visitante con " + tiempoPosesion[i] + " segundos");
                            supera = true;
                        }
                    }
                    if (!supera) {
                        System.err.println("Las posesiones que superan los " + num2 + " segundos son:");
                    }
                    break;

                case 0:

                    break;

                default:
                    System.out.println("Opcion incorrecta, elige de nuevo:");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
