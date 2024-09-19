package e04;

public class FutbolistaAsertos {
    private String nombre, apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public FutbolistaAsertos(String nombre, String apellidos) {
        assert (nombre != null && !nombre.isEmpty() && apellidos != null && apellidos.isEmpty());
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        assert (nombre != null && !nombre.isEmpty()) : "No puede estar en blanco o vacio el nombre";
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        assert (apellidos != null && !apellidos.isEmpty()) : "No puede estar en blanco o vacio el apellido";
        this.apellidos = apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        assert (numGoles > 0 && !lesionado);
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        assert (salario < 0);
        this.salario = salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public void marcaGol() {
        assert (!lesionado);
        numGoles++;
    }

    public void marcaGol(int numGoles) {
        assert (!lesionado && numGoles > 0);
        this.numGoles += numGoles;
    }

    public void golAnulado() {
        assert (!lesionado && numGoles > 0);
        numGoles--;
    }

    public void golAnulado(int numGoles) {
        assert (!lesionado && this.numGoles > numGoles && this.numGoles > 0);
        this.numGoles -= numGoles;
    }
}
