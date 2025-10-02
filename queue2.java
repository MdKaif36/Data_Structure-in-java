// implement queue using stack

import java.util.Stack;
//import java.util.Queue;
public class queue2 {
    public static void main(String[] args) {
        queue q=new queue();
        q.add(34);
        q.add(6);
        q.add(12);
        q.add(53);
        q.display();
        System.out.println("remove element: "+q.remove());
        q.display();
        q.add(43);
        q.display();
        q.peek();
        
    }
    
}

class queue{
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    int count=0;
    void add(int n){
      s1.push(n); 
      count++;
    }

    int remove(){
        for(int i=0;i<count-1;i++){
            int move2container=s1.peek();
            s1.pop();
            s2.push(move2container);
        }
        int remove=s1.peek();
        s1.pop();
        for(int i=0;i<count-1;i++){
            int move1container=s2.peek();
            s2.pop();
            s1.push(move1container);
        }
        count--;
        return remove;
    }

    void display(){
        System.out.println(s1);
    }

    void peek(){
        for(int i=0;i<count-1;i++){
            int move2container=s1.peek();
            s1.pop();
            s2.push(move2container);
        }
        int peek=s1.peek();
        s1.pop();
        for(int i=0;i<count-1;i++){
            int move1container=s2.peek();
            s2.pop();
            s1.push(move1container);
        }
        count--;
        System.out.println("peak element: "+peek);;
    }
}
