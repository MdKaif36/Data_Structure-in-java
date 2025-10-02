// create a LL fromm Array

import java.util.Arrays;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    public Node(int data1) {
        this.data=data1;
        this.next=null;
    } 
}

public class LinkedList1_1 {
    public static void main(String[] args) {
        int[] ar={2,6,8,4,3,9};

        System.out.println(Arrays.toString(ar));

        Node head=new Node(ar[0]);               // create a node name of head
        Node current=head;                         // adddress of head

        for(int i=1;i<ar.length;i++){
            Node newNode=new Node(ar[i]);
            current.next=newNode;
            current=current.next;

        }

        current=head;
        while(current!=null){
            System.out.print(current.data+" -->");
            current=current.next;
        }
        System.out.print("null");

        
    }
    
}
