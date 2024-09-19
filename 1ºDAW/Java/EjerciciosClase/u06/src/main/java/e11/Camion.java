package e11;

public class Camion {
    private String matricula;
    private boolean revisionPasada, depositoCompleto;
    private int kmRecorridos;

    public Camion(String matricula, boolean revisionPasada, boolean depositoCompleto, int kmRecorridos) {
        this.matricula = matricula;
        this.revisionPasada = revisionPasada;
        this.depositoCompleto = depositoCompleto;
        this.kmRecorridos = kmRecorridos;
    }

    public void llenaDeposito() {
        depositoCompleto = true;
    }

    public void realizaRuta() throws RevisionPendienteException, DepositoIncompletoException {
        if (!revisionPasada) {
            throw new RevisionPendienteException("El camion no ha pasado la revision");
        }
        if (!depositoCompleto) {
            throw new DepositoIncompletoException("El deposito no esta lleno");
        }
        kmRecorridos += 500;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Camion other = (Camion) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Camion [matricula=" + matricula + ", revisionPasada=" + revisionPasada + ", depositoCompleto="
                + depositoCompleto + ", kmRecorridos=" + kmRecorridos + "]";
    }

}
