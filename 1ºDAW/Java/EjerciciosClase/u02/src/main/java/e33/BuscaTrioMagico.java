package e33;

public class BuscaTrioMagico {
    public static void main(String[] args) {
        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                for (int z = 0; z <= 9; z++) {
                    int modX = x % 2;
                    int modY = y % 2;
                    int modZ = z % 2;
                    if (modX == 0 && modY != 0 && modZ == 0 && x + y + z > 10 && x * y * z < 90) {
                        System.out.println("Trio mágico: x: " + x + " y: " + y + " z: " + z);
                    }
                }
            }
        }
    }
}
