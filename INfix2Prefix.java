// infix to postfix

import java.util.Stack;
public class INfix2Prefix {
    public static void main(String[] args) {
        String s="x+y*z/w+u";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println("Infix stringis : "+sb.reverse().toString());
        String str1=infixtoprefix(sb.toString());
        StringBuilder ans=new StringBuilder(str1);
        System.out.println(ans.reverse().toString());
    }
    
    static String infixtoprefix(String str){
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
