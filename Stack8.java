// left next min element

import java.util.Stack;
public class Stack8 {
    public static void main(String[] args){
        int[] ar1 = {4, 5, 2, 10, 8};
        int[] ar2=new int[ar1.length];
        int size=ar1.length;
        Stack<Integer> st1=new Stack<>();

        // insret element in st1
        for(int i=0;i<ar1.length;i++){
            st1.push(ar1[i]);                         // {4, 5, 2, 10, 8}
        }

        for(int i=ar1.length-1;i>=0;i--){
            ar2[i]=nme(st1.peek(),(Stack<Integer>) st1.clone(),size);              // 10                                                      -1,4 ,-1,2 ,2
            st1.pop();
        }
        

        for(int i=0;i<ar1.length;i++){
            System.out.print(ar2[i]+" ");                       
        }
        
    } 

    // nme=next min element

    static int nme(int n,Stack<Integer> temp,int size){               //  {4, 5, 2, 10, 8}
         
        while (!temp.isEmpty()) {
            int top = temp.pop();
            if (top < n) {
                return top; // Return the first element that is less than n
            }
        }
        

        

        return -1;
    }
}
