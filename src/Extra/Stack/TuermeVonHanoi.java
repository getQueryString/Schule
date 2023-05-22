package Extra.Stack;

import java.util.Scanner;
import java.util.Stack;

public class TuermeVonHanoi {

    static Stack<Integer> S = new Stack<>();
    static Stack<Integer> H = new Stack<>();
    static Stack<Integer> Z = new Stack<>();

    static Scanner sc;

    static int sizeOfStartTower;

    public static void main(String[] args) {
        createStartStack();
    }


    static void createStartStack() {
        System.out.println("Wie viele Kloetze soll der Turm haben?: ");
        sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        for (int i = input; i > 0; i--) {
            System.out.println(i);
            S.push(i);
        }

        sizeOfStartTower = S.size();
        printStacks(S, H, Z);

        solveTower();
    }

    static void solveTower() {
        while (!(Z.size() == sizeOfStartTower) || (!(S.empty() || !Z.empty()) && !(H.size() == sizeOfStartTower))) {
            if (!S.empty() && (H.empty() || S.peek() < H.peek()))
                H.push(S.pop());
            else
                S.push(H.pop());

            printStacks(S, H, Z);

            if (H.size() == sizeOfStartTower)
                break;

            if (!S.empty() && (Z.empty() || S.peek() < Z.peek()))
                Z.push(S.pop());
            else
                S.push(Z.pop());

            printStacks(S, H, Z);

            if (!H.empty() && (Z.empty() || H.peek() < Z.peek()))
                Z.push(H.pop());
            else
                H.push(Z.pop());

            printStacks(S, H, Z);
        }
    }

    static void printStacks(Stack<Integer> S, Stack<Integer> H, Stack<Integer> Z) {
        if (sizeOfStartTower % 2 == 0)
            System.out.println("S=" + S + ";\nH=" + H + ";\nZ=" + Z + "\n");
        else
            System.out.println("S=" + S + ";\nH=" + Z + ";\nZ=" + H + "\n");
    }
}

