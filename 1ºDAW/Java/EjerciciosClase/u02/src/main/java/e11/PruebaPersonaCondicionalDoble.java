package e11;

public class PruebaPersonaCondicionalDoble {
    public static void main(String[] args) {
        PersonaCondicionalDoble p = new PersonaCondicionalDoble();
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        p.setTieneTrabajo(true);

        if (p.getEdad() < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }
        // - if ternario
        // . System.out.println((p.getEdad() < 18) ? "Eres menor de edad" : "Eres mayor
        // de
        // . edad");
        if (p.getAltura() >= 185) {
            System.out.println("Eres alto");
        } else {
            System.out.println("Eres bajo");
        }
        if (p.isEstaCasado()) {
            if (p.isTieneTrabajo()) {
                System.out.println("Casado y con trabajo");
            } else {
                System.out.println("Casado y sin trabajo");
            }
        } else {
            System.out.println("No está casado");
        }
        // - if ternario gigante
        // . String casado = (p.isEstaCasado()) ? (p.isTieneTrabajo()) ? "Casado y con
        // . trabajo" : "Casado y sin trabajo"
        // . : "No está casado";
    }
}
