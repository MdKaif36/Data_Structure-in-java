
// detect a loop
 
class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class linkedlist3_3 {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        
        System.out.println(trueorfalse(head));
        
        
    }

    public static boolean trueorfalse(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    

}
