package e18;

public class e18 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Apart1(4);
        // Apart2(5);
        // Apart3(5);
        // Apart3_optimizado(5);
        // Apart4(5);
        // Apart5(5);
        // Apart6(5);
        // Apart7(5);
        Apart8(5);
        long endTime = System.nanoTime() - startTime;
        System.out.println("Tiempo: " + endTime);

    }

    public static void Apart1(int input) {
        // - **********
        // - **********
        // - **********
        // - **********
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("*");
            }
            if (i != input - 1)
                System.out.println();
        }

    }

    public static void Apart2(int input) {
        // - *
        // - **
        // - ***
        // - ****
        // - *****
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            if (i != input - 1)
                System.out.println();
        }

    }

    public static void Apart3(int input) {
        // - ----*
        // - ---**
        // - --***
        // - -****
        // - *****
        int j;
        for (int i = input; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.printf(" ");

            }
            for (int z = input; z >= i; z--) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void Apart3_optimizado(int input) {
        // - ----*
        // - ---**
        // - --***
        // - -****
        // - *****
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (j < (input - i) - 1)
                    System.out.printf(" ");
                else
                    System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void Apart4(int input) {
        // - ----*----
        // - ---***---
        // - --*****--
        // - -*******-
        // - *********
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input * 2 - 1; j++) {
                if (j >= (input - 1 - i) && j <= (input - 1 + i))
                    System.out.printf("*");
                else
                    System.out.printf(" ");

            }
            System.out.println();
        }
    }

    public static void Apart5(int input) {
        // - ----1----
        // - ---222---
        // - --33333--
        // - -4444444-
        // - 555555555
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input * 2 - 1; j++) {
                if (j >= (input - 1 - i) && j <= (input - 1 + i))
                    System.out.printf(i + 1 + "");
                else
                    System.out.printf("-");

            }
            System.out.println();
        }
    }

    public static void Apart6(int input) {
        // - ----1----
        // - ---212---
        // - --32123--
        // - -4321234-
        // - 543212345

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input * 2 - 1; j++) {
                if (j >= (input - 1 - i) && j <= (input - 1 + i)) {
                    if (j <= (input - 1)) {
                        System.out.printf(((j - (input - 1)) * -1) + 1 + "");

                    } else if (j >= (input - 1))
                        System.out.printf((((input - 1) - j) * -1) + 1 + "");
                } else
                    System.out.printf("-");

            }
            System.out.println();
        }
    }

    public static void Apart7(int input) {
        // - 1010101
        // - -10101-
        // - --101--
        // - ---1---

    }

    public static void Apart8(int input) {
        // - --*--
        // - -***-
        // - *****
        // - -***-
        // - --*--
        for (int i = 0; i < input; i++) {
            if (i < (input / 2.0) + 0.5) {
                for (int j = 0; j < input; j++) {
                    if (j >= (((input / 2.0) + 0.5) - 1 - i) && j <= (((input / 2.0) + 0.5) - 1 + i)) {
                        System.out.printf("*");
                    } else {
                        System.out.printf("-");
                    }
                }
                System.out.println();
            } else {
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                // !PREGUNTAR MARIO
                for (int j = input; j > 0; j--) {
                    if (((input / 2.0) + 0.5) - 1 - i * -1 > j || /* ((input / 2.0) + 0.5) + 1 + i < j) */ true) {
                        System.out.printf("-");
                    } else {
                        System.out.printf("*");
                    }
                }
                System.out.println();
            }
        }
    }
}

// i=3 j tiene que ser <=5 o >=5
// i=4 j tiene que ser <=3 o >=3
