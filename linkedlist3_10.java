// sort a node 


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

public class linkedlist3_10 {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        
        Node head =new Node(5);
        Node node2=new Node(2);
        Node node3=new Node(9);
        Node node4=new Node(4);
        Node node5=new Node(7);
        Node node6=new Node(6);

        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=null;

        Node current=head;
        System.out.println("before sort LL");
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

        int temp;
        current=head;
        while(current!=null){
            Node refernce =current.next;
            while(refernce!=null){
                if(current.data>refernce.data){
                    temp=current.data;
                    current.data=refernce.data;
                    refernce.data=temp;
                }
                refernce=refernce.next;
            }
            current=current.next;
        }

        current=head;
        System.out.println("after sort LL");
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");

        

    }

}
