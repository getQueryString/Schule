// Copyright© by getQueryString/Fin

package Extra;

import java.util.Scanner;

public class PlayfairVerschluesselung {

    static char[][] pfq = new char[5][5]; // pfq = Playfair Quadrat
    static char[] alphabet = new char[]
            {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static String newAlphabet;
    static String encryptedInput;
    static Scanner key = new Scanner(System.in);
    static StringBuilder newKey = new StringBuilder();

    public static void main(String[] args) {
        start();
    }

    static void start() {
        System.out.println("Dein Schlüsselwort: ");
        String input = key.next();
        if (input.length() <= 25 && input.length() > 0) {
            key.close();
            removeDuplicateChar(input);
            createMatrix();
        } else start();
    }

    static void removeDuplicateChar(String input) {
        char currentChar;
        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (newKey.toString().indexOf(currentChar) < 0)
                    newKey.append(currentChar);
                if (currentChar == alphabet[j]) {
                    alphabet[j] = ' ';
                }
            }
        }
        System.out.println(newKey.length());

        newAlphabet = new String(alphabet).replace(" ", "");
        System.out.println(newAlphabet);
    }

    static void createMatrix() {
        int keywordIndex = 0;
        int emptyFieldIndex = 0;

        for (int zeile = 0; zeile < pfq.length; zeile++) {
            for (int spalte = 0; spalte < pfq[zeile].length; spalte++) {
                if (keywordIndex < newKey.length()) {
                    pfq[zeile][spalte] = newKey.toString().toCharArray()[keywordIndex];
                    keywordIndex++;
                } else {
                    pfq[zeile][spalte] = newAlphabet.toCharArray()[emptyFieldIndex];
                    emptyFieldIndex++;
                }
                System.out.print(pfq[zeile][spalte] + "\t");
            }
            System.out.println();
        }
    }

    static void encrypt() {

    }
}