package _08colecciones.cola;

public class PruebaCola {

    public static void main(String[] args) {
        Cola c = new Cola();
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Ana");
        Persona p3 = new Persona("Luis");
        Persona p4 = new Persona("Maria");
        c.nuevoCliente(p1);
        c.nuevoCliente(p2);
        c.nuevoCliente(p3);
        c.nuevoCliente(p4);
        c.avanzarCola();
        System.out.println(c.getListaPersonas());
        System.out.println(c.getListaPersonas().remove(0));
    }
}
