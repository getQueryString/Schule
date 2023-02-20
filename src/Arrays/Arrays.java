// Copyright© by getQueryString/Fin

package Arrays;

public class Arrays {

    public static void main(String args[]) {
        int[] array = new int[3];

        array[0] = 12;
        array[1] = -23;
        array[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

        System.out.println();
        array2();
    }


    private static void array2() {
        int[][] list = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int zeile = 0; zeile < list.length; zeile++) {
            for (int spalte = 0; spalte < list[0].length; spalte++) {
                System.out.print(list[zeile][spalte]);
            }
            System.out.println();
        }
    }
}

