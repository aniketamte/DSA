
import java.util.ArrayDeque;
import java.util.Deque;



public class Main {

    public static void main(String[] args) {
        /*Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(10);
        queue.add(60);
        queue.add(50);
        queue.add(16);
        queue.add(66);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());*/

        Deque<Integer> deq = new ArrayDeque<>();
        deq.add(50);
        deq.addFirst(60);
        deq.addFirst(80);
        System.out.println(deq);
        System.out.println(deq.removeFirst());
        System.out.println(deq);
    }
}
