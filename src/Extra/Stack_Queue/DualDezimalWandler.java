// Copyright© by getQueryString/Fin

package Extra.Stack_Queue;

import java.util.Stack;

public class DualDezimalWandler {
    public static void main(String[] args) {
        Stack<Integer> eingabe = new Stack<>();

        /*Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();*/

        String input = Kon.readString("Binaerzahl eingeben: ");

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
