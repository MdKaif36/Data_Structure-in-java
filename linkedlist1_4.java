
import java.util.Scanner;

// find the length of LL

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



public class linkedlist1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] ar=new int[size];
        int cnt=0;
        
        System.out.println("enter the array element");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }

        Node head=new Node(ar[0]);
        Node current=head;

        for(int i=1;i<size;i++){
            Node newNode=new Node(ar[i]);
            current.next=newNode;
            current=current.next;
        }
         
        current=head;
        while(current!=null){
            cnt++;
            current=current.next;
        }

        System.out.println("Length of LL: "+cnt);

        
    }
    
}
