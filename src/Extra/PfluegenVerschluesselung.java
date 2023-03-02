// Copyright© by getQueryString/Fin

package Extra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PfluegenVerschluesselung {

    static Scanner columnInput = new Scanner(System.in);
    static Scanner stringInputScanner = new Scanner(System.in);
    static int keyInput;
    static int rowsCount;
    static int encryptInputIndex;
    static int decryptedInputIndex;
    static String stringInput;
    static StringBuilder encryptedInput;
    static StringBuilder decryptedInput;
    static char[][] encryptMatrix;
    static char[][] decryptMatrix;

    public static void main(String[] args) {
        input();
    }

    static void input() {
        System.out.println("Schluessel (Anzahl der Spalten): ");
        try {
            keyInput = columnInput.nextInt();
        } catch (InputMismatchException ime) {
            throw new InputMismatchException("Nur Zahlen erlaubt!");
        }
        if (keyInput == 0) throw new ArithmeticException("Zahl muss groesser als 0 sein!");

        System.out.println("Zu verschluesselnder String: ");
        stringInput = stringInputScanner.nextLine().toUpperCase().replaceAll("\\s", "");
        System.out.println();
        columnInput.close();
        stringInputScanner.close();
        encryptedInput = new StringBuilder();
        decryptedInput = new StringBuilder();
        get();
    }

    static void get() {
        System.out.println("VERSCHLUESSELUNG:");
        System.out.println("\nVerschluesselter String: " + encrypt(stringInput, keyInput) +
                "\n\n*------------------------------*" +
                "\n\nENTSCHLUESSELUNG:");
        System.out.println("\nEntschluesselter String: " + decrypt(stringInput, keyInput));
    }

    static int calculateRowsForMatrix(String input, int key) {
        rowsCount = 0;
        if (input.length() > key) {
            if (input.length() % key == 0) rowsCount += (input.length() / key);
            else rowsCount += (input.length() / key) + 1;
        } else rowsCount = 1;
        System.out.println("Es wurde eine " + rowsCount + "*" + key + "-Matrix generiert:\n");

        return rowsCount;
    }

    static void createEncryptMatrix(String input, int key) {
        encryptInputIndex = 0;
        encryptMatrix = new char[calculateRowsForMatrix(input, key)][key];

        for (int row = 0; row < encryptMatrix.length; row++) {
            for (int column = 0; column < encryptMatrix[row].length; column++) {
                if (encryptInputIndex < input.length()) {
                    encryptMatrix[row][column] = input.toCharArray()[encryptInputIndex];
                    encryptInputIndex++;
                } else encryptMatrix[row][column] = 'X';
                System.out.print("\t" + encryptMatrix[row][column]);
            }
            System.out.println();
        }
    }

    static void createDecryptMatrix(String input, int key) {
        decryptedInputIndex = 0;
        decryptMatrix = new char[calculateRowsForMatrix(input, key)][key];
        crypt(input, key, false);

        for (char[] matrix : decryptMatrix) {
            for (char c : matrix) {
                System.out.print("\t" + c);
                decryptedInput.append(c);
            }
            System.out.println();
        }
    }

    static StringBuilder encrypt(String input, int key) {
        encryptedInput.setLength(0);
        createEncryptMatrix(input, key);
        crypt(null, key, true);
        return encryptedInput;
    }

    static StringBuilder decrypt(String input, int key) {
        decryptedInput.setLength(0);
        createDecryptMatrix(input, key);
        return decryptedInput;
    }

    static void crypt(String input, int key, boolean encrypt) {
        if (key % 2 == 0) {
            straightColumn(input, encrypt);
        } else {
            columnUngerade(input, encrypt);
        }
    }

    static void straightColumn(String input, boolean encrypt) {
        for (int columnIndex = keyInput - 1; columnIndex >= 0; columnIndex--) {
            if (!(columnIndex % 2 == 0)) {
                for (int i = rowsCount - 1; i >= 0; i--) {
                    if (encrypt) encryptedInput.append(encryptMatrix[i][columnIndex]);
                    else if (decryptedInputIndex < input.length()) {
                        decryptMatrix[i][columnIndex] = input.toCharArray()[decryptedInputIndex];
                        decryptedInputIndex++;
                    } else decryptMatrix[i][columnIndex] = '-';
                }
            } else {
                for (int j = 0; j < rowsCount; j++) {
                    if (encrypt) encryptedInput.append(encryptMatrix[j][columnIndex]);
                    else if (decryptedInputIndex < input.length()) {
                        decryptMatrix[j][columnIndex] = input.toCharArray()[decryptedInputIndex];
                        decryptedInputIndex++;
                    } else decryptMatrix[j][columnIndex] = '-';
                }
            }
        }
    }

    static void columnUngerade(String input, boolean encrypt) {
        for (int columnIndex = keyInput - 1; columnIndex >= 0; columnIndex--) {
            if (columnIndex % 2 == 0) {
                for (int i = rowsCount - 1; i >= 0; i--) {
                    if (encrypt) encryptedInput.append(encryptMatrix[i][columnIndex]);
                    else if (decryptedInputIndex < input.length()) {
                        decryptMatrix[i][columnIndex] = input.toCharArray()[decryptedInputIndex];
                        decryptedInputIndex++;
                    } else decryptMatrix[i][columnIndex] = '-';
                }
            } else {
                for (int j = 0; j < rowsCount; j++) {
                    if (encrypt) encryptedInput.append(encryptMatrix[j][columnIndex]);
                    else if (decryptedInputIndex < input.length()) {
                        decryptMatrix[j][columnIndex] = input.toCharArray()[decryptedInputIndex];
                        decryptedInputIndex++;
                    } else decryptMatrix[j][columnIndex] = '-';
                }
            }
        }
    }
}