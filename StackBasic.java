import java.util.Stack;
public class StackBasic {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(12);
        s.add(14);
        s.add(8);
        s.add(20);
        System.out.println(s.get(3));
        s.pop();
        System.out.println(s);
        System.out.println();
        
    }
    
}
