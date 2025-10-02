// insert a node LL
import java.util.Arrays;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class linkedlist1_2 {

    public static void main(String[] args) {

        int ar[]={1,2,4,5};
        System.out.println(Arrays.toString(ar));
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the option from 1 to 3 only ");
        System.out.println("1: On click 1 u want to insert node at starting point ");
        System.out.println("2: On click 2 u want to insert node at End point ");
        System.out.println("3: On click 3 u want to insert node at btw the node ");
        int opt=sc.nextInt();
        

        switch(opt){
            case 1:{
                System.out.println("enter the number which u want to insert");
                int num=sc.nextInt();
                Node head=new Node(num);
                Node current=head;

                for(int i=0;i<ar.length;i++){
                    Node newNode=new Node(ar[i]);
                    current.next=newNode;
                    current=current.next;

                }

                current=head;
                while(current!=null){
                    System.out.print(current.data+" -->");
                    current=current.next;
                }
                System.out.println("null");

            }
            break;
            case 2:{
                System.out.println("enter the number which u want to insert");
                int num=sc.nextInt();
                Node head=new Node(ar[0]);
                Node current=head;

                for(int i=1;i<ar.length;i++){
                    Node newNode=new Node(ar[i]);
                    current.next=newNode;
                    current=current.next;

                }

                Node newNode=new Node(num);
                current.next=newNode;
                current=current.next;
                System.out.println(current);

                current=head;
                while(current!=null){
                    System.out.print(current.data+" -->");
                    current=current.next;
                }
                System.out.println("null");
            }
            break;
            case 3:{                                                  //   {1,2,4,5}
                System.out.println("after which number u want to insert a node: ");
                int afternum=sc.nextInt();                            //  2

                System.out.println("enter the number which u want to insert");
                int num=sc.nextInt();
               

                Node head=new Node(num);
                Node current=head;

                for(int i=0;i<ar.length;i++){
                    if(current.data==afternum){
                        Node temparary= new Node(num);
                        current.next=temparary;
                        current=current.next;
                    }
                    Node newNode=new Node(ar[i]);
                    current.next=newNode;
                    current=current.next;


                }
                current=head;
                while(current!=null){
                    System.out.print(current.data+" -->");
                    current=current.next;
                }
                System.out.println("null");



            }
            break;

            default:{
                System.out.println("enter only option 1 to 3");
                break;
            }
        }
        
    }
    
}
