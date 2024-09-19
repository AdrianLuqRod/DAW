package e36;

public class PruebaArrayPersona {
    public static void main(String[] args) {
        Persona[] person = new Persona[4];
        int[] edad = { 43, 40, 24, 14 };
        String[] rol = { "padre", "madre", "hijo", "hija" };
        for (int i = 0; i < person.length; i++) {
            person[i] = new Persona();
            person[i].setEdad(edad[i]);
            person[i].setRol(rol[i]);
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println("La posición " + i + " la ocupa el/la " + person[i].getRol() + " con "
                    + person[i].getEdad() + " años");
        }
        // - El hijo 'se va'
        person[2] = null;
        // - 'Llega' el abuelo
        person[2] = new Persona();
        person[2].setEdad(80);
        person[2].setRol("Abuelo");
    }
}