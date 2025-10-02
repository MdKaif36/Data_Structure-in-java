
import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(45);
        deque.add(43);
        deque.addFirst(56);
        deque.addFirst(48);
        deque.addLast(21);
        deque.addLast(82);
        System.out.println(deque.toString());
        System.out.println(deque.pollFirst());
        String str="amandeep_chutiya";
        System.out.println(str.replace("amandeep", "abdul"));



    }
    
}
