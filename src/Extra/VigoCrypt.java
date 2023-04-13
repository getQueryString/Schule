// Copyright© by getQueryString/Fin

package Extra;

import java.util.Scanner;

public class VigoCrypt {

    static char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static char[][] matrix = new char[26][26];

    static Scanner sc = new Scanner(System.in);

    static String newAlphabet;
    static StringBuilder newInput = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("Gebe einen Quadrat-Schlüssel ein: ");
        String input = sc.next().toUpperCase();
        sc.close();
        createMatrix(removeDuplicateChars(input));
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
}
