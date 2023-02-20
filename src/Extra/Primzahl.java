// Copyright© by getQueryString/Fin

package Extra;

public class Primzahl {

    // Recherche
    public static void main(String[] args) {
        int x = 2;
        while (x < 2023) {
            int number = x;
            int i = 2;
            boolean isPrime = true;

            while (i < number) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
            x++;
        }
    }
}