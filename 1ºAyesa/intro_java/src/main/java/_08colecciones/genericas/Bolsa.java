package _08colecciones.genericas;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private String etiqueta;
    private List<T> contenido;

    public Bolsa(String etiqueta) {
        this.etiqueta = etiqueta;
        contenido = new ArrayList<T>();
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public List<T> getContenido() {
        return contenido;
    }

    public void setContenido(List<T> contenido) {
        this.contenido = contenido;
    }

}
