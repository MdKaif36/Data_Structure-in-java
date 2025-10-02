import java.util.Stack;
public class stack5 {
    public static void main(String[] args) {
        Stack<Integer> stmain=new Stack<>();
        Stack<Integer> st=new Stack<>();
        

        stmain.push(2);
        stmain.push(4);
        stmain.push(-3);
        stmain.push(-9);
        stmain.push(0);
        System.out.println(stmain);
        System.out.println(getmin(stmain,st));
    }

    static int getmin(Stack<Integer> stmain,Stack<Integer> st){
        int min=0;
        while(!stmain.isEmpty()){
            min=Math.min(min,stmain.peek());
            st.push(stmain.peek());
            stmain.pop();
        }
        while(!st.isEmpty()){
            stmain.push(st.peek());
            st.pop();
        }

        return min;
    }
    
}
