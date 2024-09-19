package e10;

import java.util.Scanner;

//? El modificador static permite acceder a las variables y métodos aunque no tengamos una instancia del objeto que los contiene.

public class PruebaCuentaCorriente {
    static CuentaCorriente cc;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        boolean flag = false;
        do {
            System.out.println("0-SALIR");
            System.out.println("1-Conectar con tu cuenta");
            System.out.println("2-Consultar saldo");
            System.out.println("3-Ingresar dinero");
            System.out.println("4-Abonar una compra");
            System.out.println("Elige una opcion");
            op = sc.nextInt();
            try {
                switch (op) {
                    case 0:
                        System.out.println("Aaaadios.");
                        break;
                    case 1:
                        flag = true;
                        cc = new CuentaCorriente(1000, 1234);
                        break;
                    case 2:
                        if (!flag) {
                            System.out.println("Tienes que conectar primero tu cuenta");
                        } else {
                            System.out.println(cc.consultaSaldo());
                        }
                        break;
                    case 3:
                        if (!flag) {
                            System.out.println("Tienes que conectar primero tu cuenta");
                        } else {
                            System.out.println("Introduce el dinero que quieres ingresar: ");
                            double importe = sc.nextDouble();
                            System.out.println("Introduce el PIN de la cuenta: ");
                            int pin = sc.nextInt();
                            cc.ingresa(importe, pin);
                        }
                        break;
                    case 4:
                        if (!flag) {
                            System.out.println("Tienes que conectar primero tu cuenta");
                        } else {
                            System.out.println("Introduce el dinero que quieres ingresar: ");
                            double importe = sc.nextDouble();
                            System.out.println("Introduce el PIN de la cuenta: ");
                            int pin = sc.nextInt();
                            cc.abona(importe, pin);
                        }
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }

            } catch (DatosCuentaInvalidosException | PinIncorrectoException | ImporteIncorrectoException e) {
                System.out.println(e);
            }
        } while (op != 0);
    }
}
