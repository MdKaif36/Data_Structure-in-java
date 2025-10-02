// delete a middle node 

class Node {
    int data;
    Node next;

    Node (int data1){
        
        this.data=data1;
        this.next=null;

    }

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;

    }

}

public class linkedlist3_9 {
    public static void main(String[] args) {
        
        
        Node head =new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        Node node6=new Node(6);

        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        Node slow=head;
        Node fast=head;
        int copy;

        
        while(fast!=null&&fast.next!=null){                 //    {1 2 3 4 5}
            slow=slow.next;
            fast=fast.next.next;
        }

        copy=slow.data;
        System.out.println("Middle element: "+copy);

        Node current=head;
        Node prev=head;

        while(current!=null){
            if(copy==current.data){
                prev.next=current.next;
                break;

            }
            prev=current;
            current=current.next;
        }

        current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

       
    }
}
