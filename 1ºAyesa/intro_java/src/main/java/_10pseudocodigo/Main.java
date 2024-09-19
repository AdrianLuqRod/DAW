package _10pseudocodigo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 3, 1, 4, 2);
        System.out.println("Sin ordenar: " + lista);
        System.out.println("Ordenado: " + DeLaBurbuja(lista));
    }

    public static List<Integer> DeLaBurbuja(List<Integer> lista) {
        for (int i = 1; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int aux = lista.get(j);
                    lista.set(j, j + 1);
                    lista.set(j + 1, aux);
                }
            }
        }
        return lista;
    }
}
