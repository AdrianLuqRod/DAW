package e31;

public class CandadoNumerico {
    public int numSecreto;

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    public boolean seAbreCon(int numero) {
        // return numero==numSecreto;
        if (numero == numSecreto) {
            return true;
        } else {
            return false;
        }
    }
}
