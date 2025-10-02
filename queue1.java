// queue implementation using array
public class queue1 {
    public static void main(String[] args) {
        Queue q =new Queue();
        q.add("asif");
        q.add("faizan");
        q.add("irash");
        q.display();
        System.out.println("remove element is: "+q.remove());  
        q.display();

    }
    
}
class Queue{
    String[] ar=new String[10];
    int front=0;
    int rear=-1;
    void add(String str){
        rear++;
        ar[rear]=str;
    }
    String remove(){
        String str=ar[front];
        front++;
        return str;

    }
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    
}