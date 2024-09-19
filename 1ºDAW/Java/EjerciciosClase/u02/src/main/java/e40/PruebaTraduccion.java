package e40;

public class PruebaTraduccion {
    public static void main(String[] args) {
        Traduccion[] translations = new Traduccion[5];
        String[] ingles = { "To break down", "To fix", "To reboot", "To work", "To type" };
        String[] spanish = { "Averiar", "Arreglar", "Reiniciar", "Funcionar", "Teclear" };
        for (int i = 0; i < translations.length; i++) {
            translations[i] = new Traduccion();
            translations[i].setEnglish(ingles[i]);
            translations[i].setSpanish(spanish[i]);
        }
        // . t1.setEnglish("To break down");
        // . t2.setEnglish("To fix");
        // . t3.setEnglish("To reboot");
        // . t4.setEnglish("To work");
        // . t5.setEnglish("To type");
        // . t1.setSpanish("Averiar");
        // . t2.setSpanish("Arreglar");
        // . t3.setSpanish("Reiniciar");
        // . t4.setSpanish("Funcionar");
        // . t5.setSpanish("Teclear");
        for (Traduccion elemTraduccion : translations) {
            System.out
                    .println(elemTraduccion.getEnglish() + " en español se traduce por " + elemTraduccion.getSpanish());
        }
    }
}
