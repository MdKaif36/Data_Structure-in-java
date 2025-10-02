
// prefix to infix

//import java.nio.charset.CharacterCodingException;
import java.util.Stack;
public class prefix2infix {
    public static void main(String[] args) {
        String str="*+pq-mn";
        StringBuilder strreverse =new StringBuilder(str);
        System.out.println("prefix String is: "+str);
        //System.out.println(strreverse.reverse().toString());
        System.out.println("Infix String is: "+postfix2infix(strreverse.reverse().toString()));
    }

    static String postfix2infix(String str){              // ab-de+f*/
        Stack<String> sts=new Stack<>();
        //Stack<Character> stc=new Stack<>();
        StringBuilder newstr=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sts.push(String.valueOf(ch));
            }
            else{
                String operand1=sts.pop();
                String operand2=sts.pop();
                newstr.append('(');
                newstr.append(operand1);
                newstr.append(ch);
                newstr.append(operand2);
                newstr.append(')');
                sts.push(newstr.toString());
                newstr.setLength(0);

            }

        }

        return sts.peek();
    }
}
