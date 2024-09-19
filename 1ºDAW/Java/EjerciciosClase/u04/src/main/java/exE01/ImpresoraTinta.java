package exE01;

public class ImpresoraTinta extends Impresoras {
    private double capacidadCartucho, tintaDisponible;
    private final int CIEN_POR_CIEN = 100;

    public void cambiarCartucho(double capacidad) {
        if (!isEncendido()) {
            if (capacidad <= 0) {
                System.out.println("Error, capacidad erronea.");
            } else {
                capacidadCartucho = capacidad;
                tintaDisponible = capacidad;
            }
        } else {
            System.out.println("Impresora encendida, error.");
        }

    }

    public double calculaTinta() {
        if (isEncendido()) {
            return (tintaDisponible / capacidadCartucho) * CIEN_POR_CIEN;
        } else {
            System.out.println("Impresora apagada, error.");
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public void imprimir(String texto) {
        if ((isEncendido())) {
            if (tintaDisponible == 0) {
                System.out.println("No hay tinta, cambie el cartucho");
            } else {
                System.out.println("Imprimiendo " + texto);
                for (int i = 0; i < texto.length(); i++) {
                    tintaDisponible -= 0.1;
                }
                if (tintaDisponible < 0) {
                    System.out.println("No se pudo imprimir el documento completo");
                    tintaDisponible = 0;
                }
            }

        } else {
            System.out.println("Impresora apagada, error.");
        }
    }

    @Override
    public void imprimirPaginaPrueba() {
        if (isEncendido()) {

            imprimir("Pagina de prueba de la impresora de inyeccion con un cartucho de " + capacidadCartucho
                    + " mililitros de titna que actualmnente esta al  %.2f".formatted(calculaTinta())
                    + " % de su capacidad");
        } else {
            System.out.println("Impresora apagada, error.");
        }
    }

}
