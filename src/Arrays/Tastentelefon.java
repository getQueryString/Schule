// Copyright© by getQueryString/Fin

package Arrays;


import Extra.MatrixMitZufallszahlenUndMax;

public class Tastentelefon {

    static MatrixMitZufallszahlenUndMax zM = new MatrixMitZufallszahlenUndMax();

    public static char[][] tt = {{'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}};

    public static void main(String args[]) {
        printTastengeld();
        System.out.println();
        callGuthaben();
        System.out.println();
        zM.zufallsMatrix(tt);
    }

    static void printTastengeld() {
        for (int i = 0; i < tt.length; i++) {
            for (int j = 0; j < tt[i].length; j++) {
                System.out.print(tt[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void callGuthaben() {
        System.out.println(tt[3][0] + "" + tt[0][0] + "" + tt[3][1] + "" + tt[0][0] + "" + tt[3][2]);
    }


}