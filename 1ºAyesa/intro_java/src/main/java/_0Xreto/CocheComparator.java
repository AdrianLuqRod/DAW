package _0Xreto;

import java.util.Comparator;

public class CocheComparator implements Comparator<Coche> {

    @Override
    public int compare(Coche arg0, Coche arg1) {
        int num = arg0.getPrecio() - arg1.getPrecio();
        if (num == 0) {
            num = arg0.getNumKms() - arg1.getNumKms();
            if (num == 0) {
                num = arg0.getMarca().compareTo(arg1.getMarca());
            }
        }
        return num;
    }

}
