// Delete all occurrences of a given key in a doubly linked list

import java.util.Arrays;
import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

public class DLL2 {
    public static void main(String[] args) {
        int ar[] = { 1, 2, 1, 4, 5, 1, 1, 6 };

        System.out.println(Arrays.toString(ar));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the key element: ");
        int key = sc.nextInt();

        Node head = new Node(ar[0]);
        Node current = head;

        for (int i = 1; i < ar.length; i++) {
            Node newNode = new Node(ar[i]);
            current.next = newNode;
            newNode.back = current;
            current = current.next;

        }
        display(head);
        current = head;
        Node newhead = new Node(0);
        Node newcurrent = newhead;
        while (current != null) {
            if (current.data != key) {
                Node dummyNode = new Node(current.data);
                newcurrent.next = dummyNode;
                newcurrent = newcurrent.next;
            }
            current = current.next;
        }
        newcurrent = newhead;
        display(newcurrent.next);
    }

    public static void display(Node head) {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "-->");
            pointer = pointer.next;
        }
        System.out.println("null");
    }

}
