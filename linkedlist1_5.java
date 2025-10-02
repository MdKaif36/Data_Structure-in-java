// search element in LL

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class linkedlist1_5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ar[]={1,5,6,8,9};
        System.out.println("enter the search value");
        int search=sc.nextInt();

        Node head=new Node(ar[0]);
        Node current=head;

        for(int i=1;i<ar.length;i++){
            Node newNode=new Node(ar[i]);
            current.next=newNode;
            current=current.next;

        }

        System.out.println("search element exist or not: "+search(head,search));



        

        
    }
    public static boolean  search(Node head,int search){
        Node current=head;
        while(current!=null){
            if(current.data==search){
                return true;
            }
            current=current.next;
        }
        return false ;
    }
    
    
}
