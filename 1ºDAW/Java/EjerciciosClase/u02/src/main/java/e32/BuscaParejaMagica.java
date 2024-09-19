package e32;

public class BuscaParejaMagica {
    public static void main(String[] args) {
        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                int modX = x % 2;
                int modY = y % 2;
                if (modX == 0 && modY != 0 && x + y > 6 && x * y < 60)
                    System.out.println("Pareja mágica: x: " + x + " y: " + y);
            }
        }
    }
}
