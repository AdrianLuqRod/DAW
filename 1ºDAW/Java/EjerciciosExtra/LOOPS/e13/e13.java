package e13;

// - Write a program to print out all Armstrong numbers between 1 and 500. 
// - If sum of cubes of each digit of the number is equal to the number itself, 
// - then the number is called an Armstrong number.
// - For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

public class e13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int temp = i;
            int sumaCub = 0;
            while (temp > 0) {
                int aux = temp % 10;
                sumaCub += Math.pow(aux, 3);
                temp /= 10;
            }
            if (sumaCub == i) {
                System.out.println(i + " es un numero de Amstrong");
            }
        }
    }
}
