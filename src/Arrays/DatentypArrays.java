// Copyright© by getQueryString/Fin

package Arrays;

public class DatentypArrays {

    public static void main(String args[]) {
        // 1. Beispiel
        int stunden0[];
        stunden0 = new int[5];

        // 2. Beispiel
        int stunden[] = new int[5];
        stunden[0] = 8;
        stunden[1] = 10;
        stunden[2] = 6;
        stunden[3] = 8;
        stunden[4] = 5;

		/*for(int i = 0; i < stunden.length; i++)
		 * {
			System.out.println(stunden[i]);
		}*/


        int x[] = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
            System.out.println(x[i]);
        }

        // Oder die Werte in einer separaten for-Schleife ausgeben lassen
        for (int j = 0; j < x.length; j++) {
            System.out.println(x[j]);
        }
    }
}