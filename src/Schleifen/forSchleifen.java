// Copyright© by getQueryString/Fin

package Schleifen;

public class forSchleifen {

    public static void main(String... args) {

        int x = 0;

        for (int i = 0; i < 11; i++) {
            System.out.println(i + " * 3 = " + x);
            x = 3 + x;
        }

        System.out.println();
        easierCalc();
        System.out.println();
        otherLoop();
    }

    private static void easierCalc() {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " * 3 = " + i * 3);
        }
    }

    private static void otherLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
