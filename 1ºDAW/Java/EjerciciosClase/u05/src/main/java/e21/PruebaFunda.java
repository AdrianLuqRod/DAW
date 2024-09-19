package e21;

public class PruebaFunda {
    public static void main(String[] args) {
        Funda<Smartphone> funda1 = new Funda<>();
        Funda<Tablet> funda2 = new Funda<>();
        Smartphone s = new Smartphone("Samsung", "S8", 6);
        Tablet t = new Tablet("Huawei", "P10", 10);

        funda1.guarda(s);
        System.out.println(funda1.isVacia());
        funda1.saca();
        System.out.println(funda1.isVacia());
        funda2.guarda(t);
        System.out.println(funda2.isVacia());
        funda2.saca();
        System.out.println(funda2.isVacia());

    }
}
