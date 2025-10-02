// prefix 2 postfix

import java.util.Stack;
public class prefix2postfix {
    public static void main(String[] args) {
        String str="/-ab*+def";
        StringBuilder sb=new StringBuilder(str);
        System.out.println("prefix String is: "+sb);
        System.out.println("postfix String is: "+prefix2postfix(sb.reverse().toString()));
    }
    



    static String prefix2postfix(String str){                      //  fed+*ba-/
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
                sb.append(operand1);
                sb.append(operand2);
                sb.append(ch);
                st.push(sb.toString());
                sb.setLength(0);

            }
        }


        return st.peek();
    }
    
}
