
import java.util.Scanner;

// delete a node from end of given index

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
public class linkedlist3_8 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the delete node index from end: ");
        int del_node=sc.nextInt();

        Node head=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);

        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        Node current=head;
        int length=0;
        while(current!=null){
            length++;
            current=current.next;
        }
        System.out.println("length of LL: "+length );

        int count=0;
        current=head;
        Node prev=null;
        while(current!=null){

            if((length-del_node)==count){

                if(prev==null){
                    head=current.next;
                }
                else{
                    prev.next=current.next; 
                }
                break;
            }
    
            prev=current;
            current=current.next;
            count++;
            
           
        }

        current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");


    }
}
