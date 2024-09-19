package e12;

import java.util.HashSet;
import java.util.Set;

public class OperacionesConjuntos {
    public static void main(String[] args) {
        Set buscaPolicia = new HashSet();
        Set buscaGuardia = new HashSet();
        buscaPolicia.add("12345678A");
        buscaPolicia.add("12345678B");
        buscaPolicia.add("12345678C");
        buscaPolicia.add("12345678D");
        buscaGuardia.add("12345678E");
        buscaGuardia.add("12345678F");
        buscaGuardia.add("12345678G");
        buscaGuardia.add("12345678D");
        Set estanEnAlguno = new HashSet();
        estanEnAlguno.addAll(buscaPolicia);
        estanEnAlguno.addAll(buscaGuardia);
        System.out.println("Buscados por la policia o la guardia civil: ");
        System.out.println(estanEnAlguno);
        System.out.println("");

        Set estanEnLosDos = new HashSet(buscaPolicia);
        estanEnLosDos.retainAll(buscaGuardia);
        System.out.println("Buscados por la policia y por la guardia civil");
        System.out.println(estanEnLosDos);
        System.out.println("");

        Set buscadosSoloPorPolicia = new HashSet(buscaPolicia);
        buscadosSoloPorPolicia.removeAll(buscaGuardia);
        System.out.println("Buscados por Policia y no por Guardia: ");
        System.out.println(buscadosSoloPorPolicia);
        System.out.println("");
        Set buscadosSoloPorGuardia = new HashSet(buscaGuardia);
        buscadosSoloPorGuardia.removeAll(buscaPolicia);
        System.out.println("Buscados por Guardia y no por Policia");
        System.out.println(buscadosSoloPorGuardia);

    }
}
