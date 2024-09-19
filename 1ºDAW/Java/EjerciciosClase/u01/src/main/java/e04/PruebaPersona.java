package e04;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona name1;
        Persona name2;
        name1 = new Persona();
        name2 = new Persona();
        name1.cambiaNombre("Pepe");
        name1.cambiaEdad(18);
        name2.cambiaNombre("Pepa");
        name2.cambiaEdad(19);
        name1.imprimeEdad();
        name1.imprimeEstadoCivil();
        name1.imprimeEstadoTrabajo();
        name1.imprimeNombre();
        name2.imprimeEdad();
        name2.imprimeEstadoCivil();
        name2.imprimeEstadoTrabajo();
        name2.imprimeNombre();
        name1.consigueTrabajo();
        name1.pierdeTrabajo();
        name1.consigueTrabajo();
        name2.consigueTrabajo();
        name1.cambiaEdad(30);
        name2.cambiaEdad(31);
        name1.seCasa();
        name2.seCasa();
        name1.seDivorcia();
        name1.imprimeEdad();
        name1.imprimeEstadoCivil();
        name1.imprimeEstadoTrabajo();
        name1.imprimeNombre();
        name2.imprimeEdad();
        name2.imprimeEstadoCivil();
        name2.imprimeEstadoTrabajo();
        name2.imprimeNombre();
    }
}
