// head of the loop 

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class linkedlist3_4 {
    public static void main(String[] args) {
        
        Node head=new Node(1);    
        Node second=new Node(2);  
        Node third=new Node(3);  
        Node fourth=new Node(4);  
        Node fifth=new Node(5); 
        
    
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        headofLoop(head);
        

       

    }

    public static void headofLoop(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
           
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                System.out.println(slow.data);
                break;
            }

        }
    }

}
