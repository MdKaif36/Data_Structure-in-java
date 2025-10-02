import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back =null;
    }
}
public class DLL3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of DLL: ");
        int size=sc.nextInt();

        System.out.println("enter the head data: ");
        int headdata=sc.nextInt();

        Node head=new Node(headdata);
        Node current=head;

        System.out.println("enter the DLL element:");
        for(int i=1;i<size;i++){
            Node newNode=new Node(sc.nextInt());
            current.next=newNode;
            newNode.back=current;
            current=current.next;
        }

        System.out.println("DLL");
        current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            if(current.next==null){
                break;
            }
            current=current.next;
        }
         System.out.println();

        System.out.println(current.data);
       



        
    }
    
}
