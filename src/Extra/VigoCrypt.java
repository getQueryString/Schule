// Copyright© by getQueryString/Fin

package Extra;

import java.util.Scanner;

public class VigoCrypt {

    static char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static char[][] matrix = new char[26][26];

    static Scanner sc = new Scanner(System.in);

    static String newAlphabet;

    static StringBuilder newInput = new StringBuilder();
    //static StringBuilder encryptedInput = new StringBuilder();
    //static StringBuilder decryptedOutput = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Gebe einen Quadrat-Schluessel ein: ");
        String input = sc.next().toUpperCase();        // input -> keyInput
        sc.close();
        createMatrix(removeDuplicateChars(input));


        //System.out.println("Verschluesselt: " + getEncryptedInput(toEncryptedInput, input));
        //System.out.println("Entschluesselt: " + getDecryptedOutput(encryptedInput, input));
    }

    static StringBuilder removeDuplicateChars(String input) {
        char currentChar;
        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {
                if (newInput.toString().indexOf(currentChar) < 0) newInput.append(currentChar);
                if (currentChar == alphabet[j]) alphabet[j] = ' ';
            }
        }
        newAlphabet = new String(alphabet).replace(" ", "");
        newInput.append(newAlphabet);

        return newInput;
    }

    static void createMatrix(StringBuilder input) {
        System.out.println(input + "\n");
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = input.toString().toCharArray()[i];
            System.out.print(matrix[0][i] + "  ");
        }
        System.out.println();

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i - 1][j - 1 >= 0 ? j - 1 : 25];
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /*static String getEncryptedInput(String /*toEncryptedTextinput, String key) {
        // Position von zu verschlüsselndem char in 0. Reihe suchen
        // Position vom char des keys in 0. Spalte suchen

        // charPos = matrix[row ? i : 0][column ? j : 0]   ?

        int row, column;

        for (int i = 0; i < input.length; i++) {
            row = matrix.indexOf(toEncryptedChar);    // nicht indexOf	!
            column = matrix[0].indexOf(key);

            encryptedInput.append(matrix[row][column]);
        }
        return encryptedInput.toString();
    }

    static String getDecryptedOutput(String encryptedChar, String key) {
        // Position von key in 0. Spalte suchen
        // Position von verschlüsseltem char in der Reihe vom key in 0. Spalte suchen
        // Von der Spalte dieses keys die 0. Reihe nehmen

        int row, column;

        for (int i = 0; i < encryptedInput.toString().length; i++) {
            row = matrix.indexOf(key);
            column = matrix.indexOf(encryptedChar);

            decryptedOutput.append(matrix[row][column]);
        }
        return decryptedOutput.toString();
    }*/
}
