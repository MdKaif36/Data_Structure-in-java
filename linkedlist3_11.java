//  segregate 0 , 1 and 2 

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
public class linkedlist3_11 {
    public static void main(String[] args) {

        Node head =new Node(1);
        Node node2=new Node(1);
        Node node3=new Node(2);
        Node node4=new Node(2);
        Node node5=new Node(0);
        Node node6=new Node(1);

        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=null;
        
        Node zero=new Node(-1);
        Node zeroCurrent=zero;
        Node one=new Node(-1);
        Node oneCurrent=one;
        Node two=new Node(-1);
        Node twoCurrent=two;

        Node current=head;
        while(current!=null){
            if(current.data==0){
                Node temp=new Node(current.data);
                zeroCurrent.next=temp;
                zeroCurrent=zeroCurrent.next;
            }
            else if(current.data==1){
                Node temp=new Node(current.data);
                oneCurrent.next=current;
                oneCurrent=oneCurrent.next;
            }
            else if(current.data==2){
                Node temp=new Node(current.data);
                twoCurrent.next=temp;
                twoCurrent=twoCurrent.next;
            }
            current=current.next;
        }
        System.out.println("contain only 0 in LL ");
        current=zero;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
        System.out.println();

        System.out.println("contain only 1 in LL ");
        current=one;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
        System.out.println();

        System.out.println("contain only 2 in LL ");
        current=two;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
        System.out.println();


        // segregate 0 , 1 and 2  

        current=zero.next;
        Node prev=current;
        while(current!=null){
            if(current==null&&prev.data==0){
                current.next=one.next;
            }
            if(current==null&&prev.data==1){
                current.next=two.next;
            }
            prev=current;
            current=current.next;
        }

        current=zero.next;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");


    }   

    
}
