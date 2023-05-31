// Copyright© by getQueryString/Fin

package Extra.Stack;

import java.util.Scanner;
import java.util.Stack;

public class DualDezimalWandler {
    public static void main(String[] args) {
        Stack<Integer> eingabe = new Stack<>();

        System.out.println("Dualzahl eingeben: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch))
                eingabe.push(Character.getNumericValue(ch));
        }

        System.out.println("Eingabe: " + eingabe + "\n");

        int c;
        int dez = 0;

        while (!eingabe.empty()) {
            c = eingabe.peek();
            System.out.println("c=" + c);
            dez *= 2;
            System.out.println("dez=" + dez);
            if (c == 1)
                dez += 1;
            eingabe.pop();
            System.out.println("eingabe=" + eingabe + "\n");
        }
        System.out.println("Dezimalzahl: " + dez);
    }
}
