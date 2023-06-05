// Die Klasse MyStack benennt lediglich die Methoden peek()
// und empty() der Klasse Stack in top() und isEmpty() um.
package Extra.Stack_Queue;

import java.util.*;

public class MyStack<T> extends Stack<T> {
    public T top() {
        return peek();
    }

    public boolean isEmpty() {
        return empty();
    }
}
