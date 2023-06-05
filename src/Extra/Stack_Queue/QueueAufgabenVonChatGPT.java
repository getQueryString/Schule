// Copyright© by getQueryString/Fin

package Extra.Stack_Queue;

import java.util.*;

public class QueueAufgabenVonChatGPT {

    // Aufgaben von Level 1 bis 3 von ChatGPT
    /*
    Level 1: Einfach
    Aufgabe: Implementiere eine Methode addToQueue(Queue<Integer> queue, int[] elements),
    die ein Array von Integer-Elementen entgegennimmt und alle Elemente nacheinander zur gegebenen Queue hinzufügt.

    Level 2: Mittel
    Aufgabe: Implementiere eine Methode reverseQueue(Queue<String> queue),
    die die Reihenfolge der Elemente in der gegebenen Queue umkehrt. Du darfst nur die Methoden der Queue-Schnittstelle verwenden,
    keine zusätzlichen Datenstrukturen.

    Level 3: Fortgeschritten
    Aufgabe: Gegeben ist eine Warteschlange queue mit Integer-Elementen.
    Implementiere eine Methode findMaxElement(Queue<Integer> queue), die das größte Element in der Queue zurückgibt,
    ohne die Reihenfolge der Elemente zu ändern. Beachte, dass die Queue nach der Methode in ihrem ursprünglichen Zustand bleiben sollte.
     */

    static Queue<Integer> queue = new ArrayDeque<>();
    static Stack<Integer> cacheStack = new Stack<>();

    public static void main(String[] args) {

        // Level 1:
        addToQueue(queue, new int[]{5, 10, 7, 8, 99, 3435, 3});

        // Level 2:
        reverseQueue(queue);

        // Level 3:
        System.out.println("\nGroesster Wert: " + findMaxElement(queue));
        System.out.println(queue);
    }

    // Level 1:
    static void addToQueue(Queue<Integer> queue, int[] elements) {
        for (int element : elements) {
            queue.add(element);
        }
        System.out.println("Queue: " + queue);
    }

    // Level 2:
    static void reverseQueue(Queue<Integer> queue) {
        for (int i = queue.size(); i > 0; i--) { // Oder !queue.isEmpty() (Lösung von ChatGPT)
            cacheStack.push(queue.poll());
        }
        for (int i = cacheStack.size(); i > 0; i--) { // Oder !cacheStack.isEmpty() (Lösung von ChatGPT)
            queue.add(cacheStack.pop());
        }

        System.out.println("\ncacheStack: " + cacheStack);
        System.out.println("Queue: " + queue);
    }

    // Level 3:
    static Integer findMaxElement(Queue<Integer> queue) {
        // Eigene Lösung
        int max = 0;
        int queueElement = 0;
        for (int i = queue.size(); i > 0; i--) {
            if (!queue.isEmpty()) {
                queueElement = queue.poll();
                if (queueElement > max)
                    max = queueElement;
            }
            queue.add(queueElement);
        }

        // Lösung von ChatGPT
        /*for (int queueElement : queue) {
            if (queueElement > max)
                max = queueElement;
        }*/
        return max;
    }
}

