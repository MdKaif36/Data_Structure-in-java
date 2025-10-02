// Add 1 to a Linked List Number

class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class linkedlist3_12{
    public static void main(String[] args) {
        
        Node head=new Node(3);
        Node node1=new Node(5);
        Node node2=new Node(7);
        Node node3=new Node(1);
        Node node4=new Node(6);

        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;

        Node current=head;

        while(current!=null){
            if(current.next==null){
                current.data=current.data+1;
            }

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




