//  create a DLL 

class Node{
    int data;
    Node next;
    Node back;

    Node(int data1){
        this.data=data1;
        this.next=null;
        this.back=null;
    }
}
public class DLL1 {

    public static void main(String[] args) {
        int[] ar={1,2,3,4};

        Node head=new Node(ar[0]);
        Node current=head;

        for(int i=1;i<ar.length;i++){
            Node temp=new Node(ar[i]);
            current.next=temp;
            temp.back=current;
            current=current.next;
        }

        current=head;
        while(current.data!=4){
            current=current.next;
        }
        current=current.back;
        System.out.println(current.data);
        
    }
    

    
}
