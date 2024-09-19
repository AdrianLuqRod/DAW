// package e08;

// import e02.Futbolista;
// import java.util.*;

// public class FutbolistaMenu {
// public static void main(String[] args) {
// Futbolista f = new Futbolista("Adrian", "Luque");
// Scanner sc = new Scanner(System.in);
// int op;
// do {
// System.out.println("----------------------------------------------"
// + "\n0-Salir"
// + "\n1-Mostrar Estado"
// + "\n2-Marcar varios goles"
// + "\n3-Anular varios goles"
// + "\n4-Cambiar nombre y apellidos"
// + "\n5-Cambiar salario"
// + "\n6-Se lesiona"
// + "\n7-Se recupera");
// System.out.printf("Escoge una opcion: ");
// op = sc.nextInt();
// sc.nextLine();
// switch (op) {
// case 0:
// break;
// case 1:
// mostrarEstado(f);
// break;
// case 2:
// marcaGoles(f);
// break;
// case 3:
// anulaGoles(f);
// break;
// case 4:
// cambiaIdentidad(f);
// break;
// case 5:
// cambiaSalario(f);
// break;
// case 6:
// lesionar(f);
// break;
// case 7:
// curar(f);
// break;

// default:
// System.out.println("Opcion incorrecta.");
// break;
// }
// } while (op != 0);

// sc.close();
// }

// public static void mostrarEstado(Futbolista f) {
// System.out.println(f.getNombre() + " " + f.getApellidos() + " esta " +
// f.isLesionado() + " ha marcado "
// + f.getNumGoles() + " goles y gana " + f.getSalario() + " euros");
// }

// public static void marcaGoles(Futbolista f) {
// Scanner sc = new Scanner(System.in);
// System.out.printf("¿Cuantos goles quieres marcar?: ");
// f.marcaGol(sc.nextInt());
// sc.nextLine();
// }

// public static void anulaGoles(Futbolista f) {
// Scanner sc = new Scanner(System.in);
// System.out.printf("¿Cuantos goles quieres anular?: ");
// f.golAnulado(sc.nextInt());
// sc.nextLine();
// }

// public static void cambiaIdentidad(Futbolista f) {
// Scanner sc = new Scanner(System.in);
// System.out.printf("¿Que nombre quieres poner?: ");
// f.setNombre(sc.nextLine());
// System.out.printf("¿Que apellido quieres poner?: ");
// f.setApellidos(sc.nextLine());
// }

// public static void cambiaSalario(Futbolista f) {
// Scanner sc = new Scanner(System.in);
// System.out.println("¿Que salario quieres poner?");
// f.setSalario(sc.nextInt());
// }

// public static void lesionar(Futbolista f) {
// f.setLesionado(true);
// }

// public static void curar(Futbolista f) {
// f.setLesionado(false);
// }
// }
