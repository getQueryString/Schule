// Copyright© by getQueryString/Fin

package Extra;

import java.util.concurrent.TimeUnit;

class MagischesQuadratMitRandom {
    public static void main(String[] args) throws InterruptedException {
        /*boolean fertig = false;
        int[][] array = new int[3][3];
        //System.out.println("1");
        while (!fertig) {
            //System.out.println("2");
            int random = (int) (Math.random()*9*((9 - 1) + 1));
//            int random = (int) (Math.random()*9);
            System.out.println(random);
            for (int i = 0; i < 3; i++) {
                //System.out.println("3");
                for (int j = 0; j < 3; j++) {

                    if(i == 2 && j == 2) {
                        fertig = true;
                    }

                    if(random % 2 == 0) {
                        array[i][j] = random;
                    } else {
                        array[i][j] = random;
                    }

                    System.out.println(array[i][j]);
                }
            }
            fertig = true;
        }*/
        for (int i = 0; i < 10; i++) {
            System.out.println("\n" + (int) (Math.random() * ((9 - 1) + 1)));
            TimeUnit.MILLISECONDS.sleep(100);
        }
    }
}
