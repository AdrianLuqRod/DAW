package e42;

public class Compara {
    public String cadena1;
    public String cadena2;

    public String getCadena1() {
        return cadena1;
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    public boolean sonIguales(String cadena1, String cadena2) {

        if (cadena1.length() != cadena2.length()) {
            return false;
        }

        for (int i = 0; i < cadena1.length(); i++) {

            if (cadena1.charAt(i) != cadena2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
