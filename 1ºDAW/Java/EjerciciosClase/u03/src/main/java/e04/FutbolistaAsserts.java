package e04;

public class FutbolistaAsserts {
    private String nombre;
    private String apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public FutbolistaAsserts(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void marcaGol() {
        if (lesionado) {
            System.out.println("Jugador lesionado, no se puede marcar gol");
        }
        numGoles++;
    }

    public void marcaGol(int numGoles) {
        if (numGoles <= 0) {
            System.out.println("No se pueden marcar goles negativos o 0 goles.");
        } else if (lesionado) {
            System.out.println("Jugador lesionado, no se puede marcar gol");
        } else {
            this.numGoles += numGoles;
        }
    }

    public void golAnulado() {
        if (numGoles <= 0) {
            System.out.println("El numero de goles no puede ser negativo.");
        } else {
            numGoles--;
        }
    }

    public void golAnulado(int numGoles) {
        if (this.numGoles > numGoles && numGoles > 0 && this.numGoles > 0) {
            this.numGoles -= numGoles;
        } else {
            System.out.println("No se puede restar goles.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            System.out.println("El salario no puede ser menor a 0");
        } else {
            this.salario = salario;
        }
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        if (this.lesionado != lesionado) {
            this.lesionado = lesionado;
        } else {
            System.out.println("No se puede hacer eso.");
        }
    }
}
