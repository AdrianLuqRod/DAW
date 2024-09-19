package e03;

import java.util.Scanner;

import e01.NombreDuplicadoException;

public class PruebaNombresUnicos {
    public static void main(String[] args) {
        NombresUnicos nUnicos = new NombresUnicos();
        try {
            nUnicos.agregaNombre("Juan");
            nUnicos.agregaNombre("Ana");
            nUnicos.agregaNombre("juan");
        } catch (NombreDuplicadoException e) {
            System.out.println("No puedes añadir un nombre repetido");
        }
    }
}
