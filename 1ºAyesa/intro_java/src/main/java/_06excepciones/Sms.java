package _06excepciones;

public class Sms {
    private String texto, numTlf;

    public Sms(String texto, String numTlf) {
        this.texto = texto;
        this.numTlf = numTlf;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getNumTlf() {
        return numTlf;
    }

    public void setNumTlf(String numTlf) {
        this.numTlf = numTlf;
    }

}
