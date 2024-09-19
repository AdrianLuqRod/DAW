package e07;

import java.util.*;

public class ComparandoBusquedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] nums = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = r.nextInt(1000000);
        }
        int[] copiaNums = Arrays.copyOf(nums, 10000);
        Arrays.sort(copiaNums);
        long antes = System.nanoTime();
        System.out.printf("Pon el numero que deseas buscar: ");
        int buscar = sc.nextInt();
        sc.nextLine();
        for (int i : nums) {
            if (i == buscar) {
                break;
            }
        }
        long despues = System.nanoTime();
        long total = despues - antes;
        System.out.println(total);
        antes = System.nanoTime();
        Arrays.binarySearch(copiaNums, buscar);
        despues = System.nanoTime();
        total = despues - antes;
        System.out.println(total);
        sc.close();
    }

}
