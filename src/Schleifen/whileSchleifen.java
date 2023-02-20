// Copyright© by getQueryString/Fin

package Schleifen;

public class whileSchleifen {

    public static void main(String args[]) {
        //aufgabe2();
        aufgabe3();
    }

    static void aufgabe2() {
        int x = 0;
        while (x < 100) {
            x += 1;
            System.out.println(x);
        }
    }

    static void aufgabe3() {
        int y = 0;

        while (y < 100) {
            y += 1;
            if (y % 3 == 0) System.out.println("Durch 3 teilbar: " + y);
            if (y % 4 == 0) System.out.println("Durch 4 teilbar: " + y);
            System.out.println(y + ": " + isPrime(1));
        }
    }

    // Recherche
    static boolean isPrime(int p) {
        if (p % 2 == 0) return false;
        int i = (int) Math.sqrt(p);
        if (i % 2 == 0) i--;
        while (i > 2) {
            if (p % i == 0) return false;
            i -= 2;
        }
        return true;
    }
}