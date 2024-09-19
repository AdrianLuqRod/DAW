package examenSimulacro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Almacen {
    private Set<Producto> catalogo;

    private Map<String, Integer> stock;

    public Almacen() {
        catalogo = new HashSet<>();
        stock = new HashMap<>();
    }

    public void nuevoProducto(Producto p) throws ProductoDuplicadoException {
        if (catalogo.contains(p)) {
            throw new ProductoDuplicadoException("El producto que intenta añadir ya esta en el catalogo");
        }
        catalogo.add(p);
        stock.put(p.getNombre(), 0);
    }

    public void reponeProducto(String nombreProducto, int unidadesRepuestas) throws ProductoNoEncontradoException {
        if (!stock.containsKey(nombreProducto)) {
            throw new ProductoNoEncontradoException("No se ha encontrado el producto");
        }
        int unidadesExistentes = stock.get(nombreProducto);
        stock.replace(nombreProducto, (unidadesExistentes + unidadesRepuestas));
    }

    public void vendeProducto(String nombreProducto, int unidadesVendidas) throws ProductoException {
        if (!stock.containsKey(nombreProducto)) {
            throw new ProductoNoEncontradoException("No se ha encontrado el producto");
        }
        int unidadesExistentes = stock.get(nombreProducto);
        if (unidadesExistentes < unidadesVendidas) {
            throw new ProductoException("Unidades existentes insuficentes");
        }
        stock.replace(nombreProducto, unidadesExistentes - unidadesVendidas);
    }

    public void imprimeStock() {
        for (Producto p : catalogo) {
            System.out.println(
                    p.getNombre() + " - " + p.getPrecio() + "€ - " + stock.get(p.getNombre()) + " disponibles");
        }
    }

    public double calculaImporteEnStock() {
        double importe = 0;
        for (Producto p : catalogo) {
            importe += p.getPrecio() * stock.get(p.getNombre());
        }

        return importe;
    }

    public Producto buscaProductoPorNombre(String nombreProducto) throws ProductoNoEncontradoException {
        for (Producto p : catalogo) {
            if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException();
    }
}
