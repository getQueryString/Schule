// Copyright© by getQueryString/Fin

package Extra;

public class ZufallMinMax {

    static double min;
    static double max;

    public static void main(String args[]) {
        System.out.println("Please wait ... Minimum and maximum are being calculated. This can take some time.");

        min(100000000);
        max(100000000);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    static void min(int n) {
        double x = Math.random();
        double y = Math.random();
        double z;
        int i = 0;

        if (x < y) min = x;
        else min = y;

        while (i < n) {
            z = Math.random();
            if (z < min) min = z;
            i++;
        }
    }

    static void max(int n) {
        double x = Math.random();
        double y = Math.random();
        double z;
        int i = 0;

        if (x > y) max = x;
        else max = y;

        while (i < n) {
            z = Math.random();
            if (z > max) max = z;
            i++;
        }
    }
}
