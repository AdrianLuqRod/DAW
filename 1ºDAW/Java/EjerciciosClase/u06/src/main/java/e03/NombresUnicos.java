package e03;

import java.util.ArrayList;
import java.util.List;

import e01.NombreDuplicadoException;

public class NombresUnicos {
    private List<String> lista;

    public NombresUnicos() {
        lista = new ArrayList<>();
    }

    public void agregaNombre(String nombre) throws NombreDuplicadoException {
        boolean flag = false;
        for (String nom : lista) {
            if (nom.equalsIgnoreCase(nombre)) {
                flag = true;
            }
        }
        if (flag) {
            throw new NombreDuplicadoException();
        } else {
            lista.add(nombre);
        }
    }
}
