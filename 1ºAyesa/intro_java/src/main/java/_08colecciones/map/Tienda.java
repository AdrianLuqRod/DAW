package _08colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class Tienda {
    private Map<String, Articulo> articulos;

    public Tienda() {
        articulos = new HashMap<String, Articulo>();
    }

    public Map<String, Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Map<String, Articulo> articulos) {
        this.articulos = articulos;
    }

    public void agregarArticulo(Articulo a) {
        articulos.put(a.getNombre(), a);
    }

    public void eliminarArticulo(String nombre) {
        articulos.remove(nombre);
    }

    public void comprarArticulo(String nombreArticulo) {
        Articulo a = articulos.get(nombreArticulo);
        if (a != null) {
            if (a.getCantidad() == 0) {
                System.out.println("El artículo está agotado.");
                return;
            } else {
                a.setCantidad(a.getCantidad() - 1);
            }

        } else {
            System.out.println("El artículo no existe en la tienda.");
        }
    }

}
