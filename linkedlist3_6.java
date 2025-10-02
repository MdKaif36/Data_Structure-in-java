// check LL element are in palindrome or not
import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
}
public class linkedlist3_6{
    public static void main(String[] args) {

        StringBuilder str=new StringBuilder();
        
        StringBuilder reverse_str=new StringBuilder();
        Stack<Integer> st=new Stack<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        System.out.println("enter the head of LL");
        Node head=new Node(sc.nextInt());
        Node current=head;
        str.append(current.data);
        st.push(current.data);
        System.out.println("enter the linked list value: ");
        for(int i=1;i<size;i++){
            Node temp=new Node(sc.nextInt());
            current.next=temp;
            current=current.next;
            str.append(current.data);
            st.push(current.data);
        }

        current=head;
        while(current!=null){                               // print LL
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

        System.out.println("LL element "+str.toString());            // print str string use StringBUilder

        while(!st.isEmpty()){
            reverse_str.append(st.pop());
        }
        
        System.out.println("reverse of LL"+reverse_str.toString());            // print reverse_str string use StringBUilder


        if(str.toString().equals(reverse_str.toString())){     // check is palindromr or not 
            System.out.println("yes ' it is palimdrome  ");
        }
        else{
            System.out.println("no ' it is not palidrome ");
        }
    }

    
}