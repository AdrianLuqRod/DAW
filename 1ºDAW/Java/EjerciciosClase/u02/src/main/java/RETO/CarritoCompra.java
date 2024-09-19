package RETO;

import e44.Articulo;

public class CarritoCompra {
    public Articulo[] articulos;
    public int numElem;

    // ? Se inicializa el array creado en el constructor.
    public CarritoCompra() {
        articulos = new Articulo[10];
    }

    public void guardarArticulo(Articulo art) {
        // ? Se comprueba si el carrito esta lleno o no.
        if (numElem == articulos.length) {
            System.out.println("El carrito ya está lleno.");
            // ? Si no está lleno, asignamos un articulo en un hueco.
        } else {
            for (int i = 0; i < articulos.length; i++) {
                if (articulos[i] == null) {
                    articulos[i] = art;
                    articulos[i].setIdArticulo(i);
                    numElem++;
                    break;
                }
            }
        }
    }

    public void mostrarArticulos() {
        boolean exist = false;
        for (Articulo elemArticulo : articulos) {
            // ? Si en el elemento hay algo, se obtiene las propiedades del articulo.
            if (elemArticulo != null) {
                System.out.printf("Id = %d\nnombre = %s\nPrecio = %.2f€\n", elemArticulo.getIdArticulo(),
                        elemArticulo.getNombre(), elemArticulo.getPrecio());
                exist = true;
            }
        }
        if (!exist) {
            System.out.println("No hay articulos en el carrito");
        }
    }

    // - También se puede hacer con un 'forI'
    // . for (int i = 0; i < articulos.length; i++) {
    // . if (articulos[i] != null) {
    // . System.out.println("Id = " + articulos[i].getIdArticulo() + ", nombre = " +
    // . articulos[i].getNombre()
    // . + ", precio = " + articulos[i].getPrecio() + "€");
    // . exist = true;
    // . }
    // . }
    public Articulo buscarArticuloPorId(int id) {
        for (Articulo elemArticulos : articulos) {
            // ? Si algun ID coincide con el introducido, se devuelve el nombre del articulo
            // ? en cuestion.
            if (elemArticulos != null && elemArticulos.getIdArticulo() == id) {
                return elemArticulos;
            }
        }
        return null;
    }

    public double calcularPrecioTotalarticulos() {
        double total = 0;
        for (Articulo elemArticulos : articulos) {
            // ? Si hay algo en el carrito se obtiene su precio para la suma total.
            if (elemArticulos != null) {
                total += elemArticulos.getPrecio();
            }
        }
        return total;
    }
}