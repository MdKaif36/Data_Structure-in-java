// postfix to prefix

import java.util.Stack;

public class post2prefix {
    public static void main(String[] args) {
        String str="ab-de+f*/";
        System.out.println("postfix String is: "+str);
        System.out.println("prefix String is: "+postfix2prefix(str));
    }

    static String postfix2prefix(String str){
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String operand1=st.pop();
                String operand2=st.pop();
                sb.append(ch);
                sb.append(operand2);
                sb.append(operand1);
                st.push(sb.toString());
                sb.setLength(0);

            }
        }


        return st.peek();
    }
    
}
