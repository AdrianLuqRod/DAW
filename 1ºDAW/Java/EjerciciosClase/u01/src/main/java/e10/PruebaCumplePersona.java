package e10;

public class PruebaCumplePersona {
    public static void main(String[] args) {
        Persona name1 = new Persona();
        Persona name2 = new Persona();
        name1.cambiaNombre("Carmen");
        name2.cambiaNombre("Alberto");
        name1.cambiaEdad(15);
        name2.cambiaEdad(16);
        name1.imprimeNombre();
        name1.imprimeEdad();
        name1.imprimeEstadoTrabajo();
        name1.imprimeEstadoCivil();
        name2.imprimeNombre();
        name2.imprimeEdad();
        name2.imprimeEstadoTrabajo();
        name2.imprimeEstadoCivil();
        name1.cumpleAnios();
        name1.cumpleAnios();
        name1.cumpleAnios();
        name1.cumpleAnios();
        name2.cumpleAnios();
        name2.cumpleAnios();
        name2.cumpleAnios();
        System.out.println(name1.obtieneNumAnios());
        System.out.println(name2.obtieneNumAnios());
    }
}
