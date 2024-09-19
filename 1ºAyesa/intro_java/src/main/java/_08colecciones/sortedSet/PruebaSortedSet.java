package _08colecciones.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet {
    public static void main(String[] args) {
        SortedSet<Usuario> usuarios = new TreeSet<>(new UsuarioComparator());
        usuarios.add(new Usuario("Juan"));
        usuarios.add(new Usuario("Pepe"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("ana"));
        usuarios.add(new Usuario("Juan")); // <-- Elemento duplicado, no se añade.

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNombre());
        }

    }
}
