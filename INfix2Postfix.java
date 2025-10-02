// infix to postfix

import java.util.Stack;
public class INfix2Postfix {
    public static void main(String[] args) {
        String str="a+b*(c^d-e)";
      
        String str1=infixtopostfix(str);
        System.out.println(str1.toString());
    }
    
    static String infixtopostfix(String str){
        Stack<Character> st=new Stack<>();
        StringBuilder newstr=new StringBuilder();
        int size=str.length();
        for(int i=0;i<size;i++){         //   a+b*(c^d-e)
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty()&&st.peek()!='('){
                    
                    char element=st.pop();
                    newstr.append(element);
                }
                st.pop();
            }
            else if (Character.isLetterOrDigit(ch)){
                newstr.append(ch);          
            }
            else{
                if(st.isEmpty()){
                    st.push(ch);
                }
                else if(priority(st.peek())<priority(ch)){
                    st.push(ch);
                }
                else{
                    newstr.append(st.peek());
                    st.pop();
                    st.push(ch);
                }
            }

        }
        if(st.isEmpty())
            return newstr.toString();
        else{
            while(!st.isEmpty()){
                char left=st.pop();
                newstr.append(left);
            }
            return newstr.toString();
        }
    }

    static int priority(char c){
        if(c=='^')
            return 3;
        else if(c=='*'||c=='/')
            return 2;
        else if(c=='+'||c=='-')
            return 1;
        else{
            return 0;
        }
    }


}
