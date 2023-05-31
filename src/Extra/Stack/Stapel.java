// Copyright© by getQueryString/Fin

package Extra.Stack;

public class Stapel {

    static MyStack<Integer> S = new MyStack<>();
    static MyStack<Integer> H = new MyStack<>();
    static MyStack<Integer> Z = new MyStack<>();

    public static void main(String[] args) {
		/*S.push(3);
		S.push(1);
		S.push(2);*/

        S.push(2);
        S.push(4);
        S.push(1);
        S.push(3);
        System.out.println("S: " + S + "; H: " + H + "; Z: " + Z);

        while (!S.empty()) {
            H.push(S.pop());

            while (!Z.empty() && Z.top() > H.top()) {
                S.push(Z.pop());
            }
            Z.push(H.pop());
            System.out.println("S: " + S + "; H: " + H + "; Z: " + Z);
        }
    }
}

