// delete a node 

import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class linkedlist1_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4,5};
        int del_element=0;
        System.out.println("enter the delete element");
        int del=sc.nextInt();

        Node head=new Node(ar[0]);
        Node current=head;

        for(int i=1;i<ar.length;i++){
            Node newNode=new Node(ar[i]);
            current.next=newNode;
            current=current.next;
        }

       
        display(head);

        current=head;
        if(current.data==del){
            head=current.next;
        }
        else{
            Node prev=null;
            while(current!=null){                    /// {1,2,3,4,5}
                if(current.data==del){
                    current=prev;
                    current.next=current.next.next;
                    current=current.next;
                    break;
                }
                prev=current;
                current=current.next;
            }
        }

        display(head);
        
    } 

    public static void display(Node head){
        Node current=head;
        while(current!=null){

            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    
}
