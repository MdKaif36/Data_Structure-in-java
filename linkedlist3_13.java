// Add two numbers represented as Linked Lists

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class linkedlist3_13 {
    public static void main(String[] args) {

        Node head1 = new Node(3);
        Node node11 = new Node(5);
        Node node12 = new Node(7);
        Node node13 = new Node(1);
        Node node14 = new Node(6);

        head1.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = null;

        Node head2 = new Node(8);
        Node node21 = new Node(2);
        Node node22 = new Node(6);
        Node node23 = new Node(1);
        Node node24 = new Node(9);

        head2.next = node21;
        node21.next = node22;
        node22.next = node23;
        node23.next = node24;
        node24.next = null;

        int length1 = display(head1);
        System.out.println("null");
        int length2 = display(head2);
        System.out.println("null");

        if (length1 == length2) {
            System.out.println("Add two numbers represented as Linked Lists is possible ");
            Node current1 = head1;
            Node current2 = head2;
            Node dummyhead = new Node(0);
            Node newcurrent = dummyhead;

            while (current1 != null&&current2!=null) {
                Node newNode = new Node(current1.data + current2.data) ;
                newcurrent.next = newNode;
                newcurrent = newcurrent.next;
                current1 = current1.next;
                current2 = current2.next;
            }
            int newlength = display(dummyhead.next);
            System.out.println("null");
        } else
            System.out.println("Add two numbers represented as Linked Lists not possible ");
    }

    public static int display(Node head) {
        Node current = head;
        int length = 0;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
            length++;

        }
        return length;
    }

}
