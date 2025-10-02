import java.util.LinkedList;
import java.util.Queue;

public class queueBasic {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(12);
        queue.add(34);
        queue.add(18);
        queue.add(21);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());

    }
    
}
