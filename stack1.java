// implementation of stack using array

public class stack1 {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(23);
        s.push(56);
        s.push(21);
        s.display();
        System.out.println("after pop element is: "+s.pop());
        s.display();
        
        
        

    }
}

class stack{
    int ptr=-1;
    int[] ar=new int[10];
    void push(int n){
        ptr++;
        ar[ptr]=n;
    }

    int pop(){
        int del=ar[ptr];
        ptr--;
        return del;
    }
    void display(){
        for(int i=0;i<=ptr;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

}
    

