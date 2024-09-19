package _08colecciones.sortedSet;

import java.util.Comparator;

public class UsuarioComparator implements Comparator<Usuario> {

    @Override
    public int compare(Usuario arg0, Usuario arg1) {
        return arg0.getNombre().compareTo(arg1.getNombre());
        // return arg0.getNombre().length() - arg1.getNombre().length(); <--- Comparator
        // que proporciona el ejercicio.
        /*
         * Es bastante malo porque no garantiza que el TreeSet no tenga elementos
         * duplicados. De hecho si quisieramos añadir dos usuario con nombre distinto
         * pero que tengan la misma longitud, el TreeSet no añadiría el segundo usuario.
         * Por ejemplo, Pepe y Juan tienen la misma longitud, por lo que el TreeSet no
         * lo añadiría.
         */
    }

}
