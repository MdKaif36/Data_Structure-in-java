// middle of linked list

class node{
    int data;
    node next;

    node(int data1){
        this.data=data1;
        this.next=null;
    }

}


public class linkedlist3_1{
    public static void main(String[] args) {

        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next= new node(4);
        head.next.next.next.next= new node(5);         // {1,2,3,4,5}
        head.next.next.next.next.next= new node(6); 
        

        node fast=head;
        node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
    }

}
    

