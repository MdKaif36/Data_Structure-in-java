//Segregate even and odd nodes in LinkedList

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
}
public class linkedlist3_7 {
    public static void main(String[] args) {
        Node even=new Node(-1);
        Node evenhead=even;
        Node odd=new Node(-1);
        Node oddhead=odd;


        Node head=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);

        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;

        System.out.println("Input LL");
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

        current=head;                        
        while(current!=null){
            if(current.data%2!=0){   
                Node temp=new Node(current.data);      
                oddhead.next=temp;       
                oddhead=oddhead.next;                // 1 3 5
            }
            else{
                Node temp=new Node(current.data);
                evenhead.next=temp;  
                evenhead=evenhead.next;                   //   2 4 
            }
            current=current.next;
        }

        System.out.println("even LL");
        current=even;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

        System.out.println("odd LL");
        current=odd;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

        
        //Segregate even and odd nodes in LinkedList
        System.out.println("Segregate even and odd nodes in LinkedList");
        int count=0;
        current=even.next;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
            if(count<1){
                if(current==null){
                    current=odd.next;
                    count++;
                }
            }
        }
        System.out.println("null");
        
    }
}
