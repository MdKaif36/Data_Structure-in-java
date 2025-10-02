// reverse of a LL

import java.util.Stack;

class node {
    int data;
    node next;

    node(int data1){
        this.data=data1;
        this.next=null;
    }

}

public class linkedlist3_2 {
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next= new node(4);
        head.next.next.next.next= new node(5);                     // {1,2,3,4,5,6}
       
        node temp=head;
        node prev=null;

        while(temp!=null){
            node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }

        head=prev;
        node current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
        
        
        
    }
    
}
