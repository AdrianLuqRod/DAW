package _07ficheros.ej02;

import java.io.File;

public class PruebaPluma {
    public static void main(String[] args) {
        File papel = new File(
                "C:\\Programación\\AyesaCourse\\intro_java\\src\\main\\java\\_07ficheros\\ej01\\papel.txt");
        Pluma pluma = new Pluma(papel);
        try {
            pluma.escribirPorConsola();
            System.out.println("--------------------");
            pluma.escribir("Hola, esto es un texto de prueba.");
            System.out.println("--------------------");
            pluma.leerFichero();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
