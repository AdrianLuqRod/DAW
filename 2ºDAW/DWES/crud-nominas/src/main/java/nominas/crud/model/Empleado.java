package nominas.crud.model;

import nominas.crud.exceptions.DatosNoCorrectosException;

public class Empleado {
    public String nombre, dni;
    public int categoria;
    public int anyos;
    public char sexo;
    public final int[] SUELDO_BASE = {
            50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000, 230000
    };
    public int sueldo:


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
        this.categoria = categoria;
        this.anyos = anyos;
    }

    public Empleado(char sexo, String dni, String nombre) {
        this.categoria = 1;
        this.anyos = 0;
    }

    public Empleado() {
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

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
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
    }

    /**
     * Calcula el sueldo del empleado.
     * @return Sueldo del empleado.
     */
    public int sueldo() {
        return SUELDO_BASE[(this.categoria - 1)] + (this.anyos * 5000);
    }
}