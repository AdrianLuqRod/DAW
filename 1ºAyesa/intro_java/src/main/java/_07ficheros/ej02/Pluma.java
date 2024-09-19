package _07ficheros.ej02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pluma {
    private File papel;

    public Pluma(File papel) {
        this.papel = papel;
    }

    public File getPapel() {
        return papel;
    }

    public void setPapel(File papel) {
        this.papel = papel;
    }

    public void escribir(String textoAEscribir) {
        try (PrintWriter pw = new PrintWriter(papel)) {
            pw.println(textoAEscribir);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String leerTeclado() throws IOException {
        System.out.print("Introduce texto: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public void escribirPorConsola() throws IOException {
        Scanner sc = new Scanner(leerTeclado());
        System.out.println(sc.nextLine());
        sc.close();
    }

    public void leerFichero() {
        try (BufferedReader br = new BufferedReader(new FileReader(papel))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
