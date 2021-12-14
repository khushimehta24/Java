import java.util.*;

public class Dequeue {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<Integer>();

        deque.add(1);

        deque.addFirst(2);

        deque.addLast(3);

        deque.push(4);

        deque.offer(5);

        deque.offerFirst(6);

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

    }

}
