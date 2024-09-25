package ejRepaso.Laboral;

public class Empleado extends Persona {
    public int categoria;
    public int anyos;

    /**
     * Constructor de la clase Empleado que recibe todos los atributos de la clase.
     *
     * @param sexo      Género del empleado
     * @param dni       DNI del empleado
     * @param nombre    Nombre del empleado
     * @param categoria Categoría del empleado, debe estar entre 1 y 10.
     * @param anyos     Número de años que lleva trabajando el empleado, debe ser positivo.
     * @throws DatosNoCorrectosException si la categoría no está entre 1 y 10 o si el número de años es negativo.
     */
    public Empleado(char sexo, String dni, String nombre, int categoria, int anyos) {
        super(sexo, dni, nombre);
        if (categoria < 1 || categoria > 10 || anyos < 0) {
            throw new DatosNoCorrectosException("Datos incorrectos");
        }
        this.categoria = categoria;
        this.anyos = anyos;
    }

    public Empleado(char sexo, String dni, String nombre) {
        super(sexo, dni, nombre);
        this.categoria = 1;
        this.anyos = 0;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * Incrementa el número de años trabajados por el empleado.
     */
    public void incrAnyo() {
        this.anyos++;
    }

    /**
     * Imprime los datos del empleado.
     */
    public void imprime() {
        super.imprime();
        System.out.println("Categoría: " + categoria);
        System.out.println("Anyos: " + anyos);
    }
}