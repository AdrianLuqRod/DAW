package e02;

public class Prueba {
    public static void main(String args[]) {
        Cliente cl1 = new Cliente("Pepe", "12345678Z");
        Usuario us1 = new Usuario("pepeuser", "contraseña1", cl1);
        Usuario us2 = new Usuario("erroruser", "errorpass", null);
        System.out.println(us2.getNombre() + " // " + us2.getPassword());
        Cliente cl2 = new Cliente("Juan", "32145678Z");
        Usuario us3 = new Usuario("juanuser", "juanpass", cl2);
        cl2.setUsuario(us3);
        System.out.println(cl2.getUsuario().getNombre());
        cl2.getUsuario().setPassword("juanpass2");
    }
}
