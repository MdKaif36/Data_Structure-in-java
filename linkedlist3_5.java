// head of the loop 

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class linkedlist3_5 {
    public static void main(String[] args) {
        
        Node head=new Node(1);    
        Node Node2=new Node(2);  
        Node Node3=new Node(3);  
        Node Node4=new Node(4);  
        Node Node5=new Node(5); 
        Node Node6=new Node(6); 
        Node Node7=new Node(7); 
        
    
        head.next = Node2;
        Node2.next = Node3;
        Node3.next = Node4;
        Node4.next = Node5;
        Node5.next = Node6;
        Node6.next = Node7;
        Node7.next = Node2;

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
                int loopheaddata=slow.data;
                System.out.println("Loop head data: "+loopheaddata);
                slow=slow.next;
                int count=1;
                while(slow.data!=loopheaddata){
                    count++;
                    slow=slow.next;
                }
                System.out.println("Length of Loop: "+count);
                break;
            }

        }
    }

}

