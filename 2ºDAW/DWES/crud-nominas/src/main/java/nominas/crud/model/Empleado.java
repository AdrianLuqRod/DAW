package nominas.crud.model;

import nominas.crud.DatosNoCorrectosException;

public class Empleado {
    private String nombre, dni;
    private char sexo;
    private int categoria, anyos;

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
        if(categoria < 1 || categoria > 10 || anyos < 0) {
            throw new DatosNoCorrectosException("Datos incorrectos");
        }
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.categoria = categoria;
        this.anyos = anyos;
    }

    public Empleado(char sexo, String dni, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.categoria = 1;
        this.anyos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", categoria=" + categoria +
                ", anyos=" + anyos +
                '}';
    }
}