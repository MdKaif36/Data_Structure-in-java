// implement stack using queue
import java.util.LinkedList;
import java.util.Queue;
public class stack2 {
    public static void main(String[] args) {
        stack s =new stack();
        s.push(2);
        s.push(6);
        s.push(12);
        s.push(9);
        s.display();
        s.remove();
        s.display();

    }
    
}
class stack{
    Queue<Integer> q=new LinkedList<>();
    //int front=0;
    //int rear=-1;
    int count=0;
    void push(int n){
        q.add(n);
        count++;
    }
    
    void remove(){
        if(!q.isEmpty()){
            
            int element=q.poll();
            System.out.print("removed element: "+element);
            count--;
        }
        else{
            System.out.print("no element is save in queue");
        }
        System.out.println();
    }

    void display(){
            System.out.println(q);
    }
}