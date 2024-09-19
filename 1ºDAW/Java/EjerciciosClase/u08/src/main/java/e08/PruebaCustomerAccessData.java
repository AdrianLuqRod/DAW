package e08;

import java.util.ArrayList;
import java.util.List;

public class PruebaCustomerAccessData {
    public static void main(String[] args) {
        CustomerAccessData cad = new CustomerAccessData();
        try {
            List<Customer> lista = new ArrayList<>();
            lista = cad.selectAll();
            imprimeLista(lista);

            lista = cad.selectByName("Raytheon");
            imprimeLista(lista);

            System.out.println(cad.selectById(2));

            Customer c = new Customer(1, "Pepe", "Pepe2", "Pepe3", 321.0);
            System.out.println("---------------------------------------------------");
            System.out.println("Probamos el metodo update");
            System.out.println(cad.update(c));
            System.out.println("---------------------------------------------------");
            System.out.println("Probamos el metodo delete");
            System.out.println(cad.delete(c));
            System.out.println("---------------------------------------------------");
            System.out.println("Probamos el metodo selectNewestById");
            System.err.println(cad.selectByName("Alcoa"));
            System.out.println("---------------------------------------------------");
            System.out.println("Probamos el metodo create");
            System.out.println(cad.create("kk", "kk", "kk", 123.0));
            System.out.println("---------------------------------------------------");
            System.out.println("Probamos el metodo selectByCreditLimitRange sin ordenar");
            lista = cad.selectByCreditLimitRange(1300.0, 1500.0, false);
            imprimeLista(lista);
            System.out.println("Probamos el metodo selectByCreditLimitRange ordenado");
            lista = cad.selectByCreditLimitRange(1300.0, 1500.0, true);
            imprimeLista(lista);

        } catch (CustomerAccessDataException e) {
            System.out.println(e);
        }

    }

    private static void imprimeLista(List<Customer> lista) {
        for (Customer c : lista) {
            System.out.println(c);

        }
        System.out.println("----------------------------------------");
    }
}
