// Copyright© by getQueryString/Fin

package Math;

public class Zufallsgenerator {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            double erste = Math.random() * 100;
            if (erste >= 5 && erste <= 80) {
                System.out.println("Zwischen 5 und 80: " + erste);
            }

            double zweite = (int) (Math.random() * 100);
            double dritte = (int) (Math.random() * 100 + 1);
            System.out.println("Zwischen 0 und 99: " + zweite);
            System.out.println("Zwischen 1 und 100: " + dritte);
        }
    }
}
