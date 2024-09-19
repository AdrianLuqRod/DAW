package _08colecciones.cola;

import java.util.ArrayList;
import java.util.List;

public class Cola {
    List<Persona> listaPersonas;

    public Cola() {
        listaPersonas = new ArrayList<>();
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void nuevoCliente(Persona persona) {
        listaPersonas.add(persona);
    }

    public void avanzarCola() {
        if (listaPersonas.size() > 0) {
            listaPersonas.remove(0);
        }
    }
}
