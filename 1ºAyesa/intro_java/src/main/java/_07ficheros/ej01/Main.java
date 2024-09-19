package _07ficheros.ej01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(
                        "C:\\Programación\\AyesaCourse\\intro_java\\src\\main\\java\\_07ficheros\\ej01\\numeros.txt"));
                PrintWriter pwPares = new PrintWriter(new FileWriter(
                        "C:\\Programación\\AyesaCourse\\intro_java\\src\\main\\java\\_07ficheros\\ej01\\pares.txt"));
                PrintWriter pwImpares = new PrintWriter(new FileWriter(
                        "C:\\Programación\\AyesaCourse\\intro_java\\src\\main\\java\\_07ficheros\\ej01\\impares.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                if (numero % 2 == 0) {
                    pwPares.println(numero);
                } else {
                    pwImpares.println(numero);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
