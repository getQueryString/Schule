// Copyright© by getQueryString/Fin

package Extra;

public class MatrixMitZufallszahlenUndMax {

    public static void main(String[] args) {
    }

    // 4-3-Matrix mit Zufallszahlen, Maximum ausgeben und die Position des Maximums angeben
    static int[][] random = new int[4][3];
    static int max = 0;
    static int z = 0;
    static int s = 0;

    public void zufallsMatrix(char[][] tt) {

        for (int i = 0; i < tt.length; i++) {
            for (int j = 0; j < tt[i].length; j++) {
                random[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(random[i][j] + "\t");

                if (random[i][j] > max) {
                    max = random[i][j];
                    z = i;
                    s = j;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum: " + max);
        System.out.println("Zeile: " + z + "\nSpalte: " + s);
    }

}