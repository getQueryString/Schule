// Copyright© by getQueryString/Fin

package Arrays;

public class ZweiDArrays {

    public static void main(String args[]) {
        int mq[][] = new int[3][3];
        mq[0][0] = 8;
        mq[0][1] = 1;
        mq[0][2] = 6;
        mq[1][0] = 3;
        mq[1][1] = 5;
        mq[1][2] = 7;
        mq[2][0] = 4;
        mq[2][1] = 9;
        mq[2][2] = 2;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mq[i][j] + "\t");
            }
            System.out.println();
        }

        // Gesamt
        int summe = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                summe += mq[i][j];
            }
        }
        System.out.println("\nSumme: " + summe);

        int z0 = 0;
        int z1 = 0;
        int z2 = 0;
        int s0 = 0;
        int s1 = 0;
        int s2 = 0;
        int d0 = 0;
        int d1 = 0;

        // Jede Zeile, Spalte und diagonal einzeln
        for (int i = 0; i < 3; i++) {
            z0 += mq[i][0];
            z1 += mq[i][0];
            z2 += mq[i][0];
            s0 += mq[0][i];
            s1 += mq[0][i];
            s2 += mq[0][i];
            d0 += mq[i][i];
        }

        for (int j = 0; j < 3; j++) {
            d1 += mq[2 - j][j];
        }

        System.out.println("\n1. Zeile: " + z0 + "\n2. Zeile: " + z1 + "\n3. Zeile: " + z2
                + "\n1. Spalte: " + s0 + "\n2. Spalte: " + s1 + "\n3. Spalte: " + s2
                + "\nDiagonal (links oben nach rechts unten): " + d0 + "\nDiagonal (links unten nach rechts oben: " + d1);
    }
}