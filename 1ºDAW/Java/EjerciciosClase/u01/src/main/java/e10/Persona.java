package e10;

public class Persona {
    public String nombre;
    public int edad;
    public boolean trabaja, casada;

    public void cambiaNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void imprimeNombre() {
        System.out.println("El nombre es: " + nombre);
    }

    public void cambiaEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public void imprimeEdad() {
        System.out.println("Mi edad es: " + edad);
    }

    public void consigueTrabajo() {
        trabaja = true;
    }

    public void pierdeTrabajo() {
        trabaja = false;
    }

    public void imprimeEstadoTrabajo() {
        System.out.println("Trabaja?:" + trabaja);
    }

    public void seCasa() {
        casada = true;
    }

    public void seDivorcia() {
        casada = false;
    }

    public void imprimeEstadoCivil() {
        System.out.println("Casada?:" + casada);
    }

    public void cumpleAnios() {
        edad++;
    }

    public int obtieneNumAnios() {
        return edad;
    }
}
